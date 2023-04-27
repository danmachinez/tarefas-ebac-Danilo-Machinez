package br.com.dmach;

import br.com.dmach.dao.ClienteMapDAO;
import br.com.dmach.dao.IClienteDAO;
import br.com.dmach.domain.Cliente;

import javax.swing.*;

public class App {
    private static IClienteDAO iClienteDAO;
    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "\"Digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alteração ou 5 para sair\"",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,
                    "OPÇÃO INVÁLIDA! Digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alteração ou 5 para sair",
                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)) {

            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados apenas por virgula, conforme exemplo: Nome,Cpf,Telefone,Endereco,Numero,Cidade,Estado",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsulta(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF do cliente: ",
                        "Consulta de Cliente", JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            } else if (isExclusao(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF do cliente que deseja excluir: ",
                        "Exclusão de cliente", JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            } else {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados apenas por virgula, conforme exemplo: Nome,Cpf,Telefone,Endereco,Numero,Cidade,Estado",
                        "Atualização de cliente", JOptionPane.INFORMATION_MESSAGE);
                atualizar(dados);
            }

            opcao = JOptionPane.showInputDialog(null,
                    "Digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alteração ou 5 para sair",
                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void atualizar(String dados) {
        String[] dadosSeparados = dados.split(",");
        String nome = dadosSeparados[0].isEmpty() ? null : dadosSeparados[0];
        String cpf = dadosSeparados[1].isEmpty() ? null : dadosSeparados[1];
        String telefone = dadosSeparados[2].isEmpty() ? null : dadosSeparados[2];
        String endereco = dadosSeparados[3].isEmpty() ? null : dadosSeparados[3];
        String numero = dadosSeparados[4].isEmpty() ? null : dadosSeparados[4];
        String cidade = dadosSeparados[5].isEmpty() ? null : dadosSeparados[5];
        String estado = dadosSeparados[6].isEmpty() ? null : dadosSeparados[6];
        Cliente cliente = new Cliente(nome, cpf, telefone, endereco, numero, cidade, estado);
        iClienteDAO.alterar(cliente);
    }

    private static void excluir(String dados) {
        iClienteDAO.excluir(Long.parseLong(dados));
        JOptionPane.showMessageDialog(null,
                "Cliente excluído com sucesso!",
                "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
    }

    private static boolean isExclusao(String opcao) {
        return ("3".equals(opcao));
    }

    private static void consultar(String dados) {
        if (dados.matches("\\d+")) {
            Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
            if (cliente != null) {
                JOptionPane.showMessageDialog(null,
                        "Cliente encontrado: " + cliente.toString());
            } else {
                JOptionPane.showMessageDialog(null,
                        "Cliente não encontrado");
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Digite apenas o CPF!");
        }
    }


    private static boolean isConsulta(String opcao) {
        return ("2".equals(opcao));
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        String nome = dadosSeparados[0].isEmpty() ? null : dadosSeparados[0];
        String cpf = dadosSeparados[1].isEmpty() ? null : dadosSeparados[1];
        String telefone = dadosSeparados[2].isEmpty() ? null : dadosSeparados[2];
        String endereco = dadosSeparados[3].isEmpty() ? null : dadosSeparados[3];
        String numero = dadosSeparados[4].isEmpty() ? null : dadosSeparados[4];
        String cidade = dadosSeparados[5].isEmpty() ? null : dadosSeparados[5];
        String estado = dadosSeparados[6].isEmpty() ? null : dadosSeparados[6];
        Cliente cliente = new Cliente(nome, cpf, telefone, endereco, numero, cidade, estado);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null,
                    "Cliente cadastrado com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Cliente já cadastrado no sistema!",
                    "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isCadastro(String opcao) {
        return ("1".equals(opcao));
    }

    private static boolean isOpcaoSair(String opcao) {
        return ("5".equals(opcao));
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null,
                "Até logo!",
                "Saindo!", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        return "1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao)
                || "4".equals(opcao) || "5".equals(opcao);
    }

}
