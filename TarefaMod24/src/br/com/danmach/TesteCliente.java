package br.com.danmach;

public class TesteCliente {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarNome(String nome){
        setNome(nome);
    }

    public void adicionarNomes1(String nome){
        setNome(nome);
    }

}