package br.com.danmach.tests;

import br.com.danmach.dao.ClienteDao;
import br.com.danmach.dao.IClienteDao;
import br.com.danmach.dao.mock.ClienteDaoMock;
import br.com.danmach.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void salvarTest () {
        IClienteDao DaoDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(DaoDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso do cliente ao salvar", retorno);
    }
    @Test
    public void buscarTest(){
        IClienteDao DaoDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(DaoDao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso do cliente ao buscar", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarTest(){
        IClienteDao DaoDao = new ClienteDao();
        ClienteService service = new ClienteService(DaoDao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso do cliente ao buscar", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest () {
        IClienteDao DaoDao = new ClienteDao();
        ClienteService service = new ClienteService(DaoDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso do cliente ao salvar", retorno);
    }
}