package br.edu.danmach.dao;

import br.edu.danmach.domain.Cliente;

public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);
    public void excluir(Long cpf);
    public void alterar(Cliente cliente);
    public Cliente consultar(Long cpf);

}