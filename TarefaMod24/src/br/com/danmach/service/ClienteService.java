package br.com.danmach.service;
import br.com.danmach.dao.IClienteDao;

public class ClienteService implements IClienteService{
    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao){
        this.clienteDao = clienteDao;
    }

    @Override
    public String salvar() {
        clienteDao.salvar();
        return "Sucesso do cliente ao salvar";
    }

    @Override
    public String buscar() {
        clienteDao.buscar();
        return "Sucesso do cliente ao buscar";
    }

}