package br.com.danmach.tests;

import br.com.danmach.dao.ContratoDao;
import br.com.danmach.dao.IContratoDao;
import br.com.danmach.dao.mock.ContratoDaoMock;
import br.com.danmach.service.ContratoService;
import br.com.danmach.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {
    @Test
    public void salvarTest(){
        IContratoDao DaoDao = new ContratoDaoMock();
        IContratoService service = new ContratoService(DaoDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso do contrato ao salvar", retorno);
    }
    @Test
    public void buscarTest(){
        IContratoDao DaoDao = new ContratoDaoMock();
        IContratoService service = new ContratoService(DaoDao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso do contrato ao buscar", retorno);
    }


    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarTest() {
        IContratoDao DaoDao = new ContratoDao();
        ContratoService service = new ContratoService(DaoDao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso do contrato ao buscar", retorno);
    }

    @Test
    public void ExcluirTest(){
        IContratoDao DaoDao = new ContratoDaoMock();
        IContratoService service = new ContratoService(DaoDao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso do contrato ao excluir", retorno);
    }


    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirTest() {
        IContratoDao DaoDao = new ContratoDao();
        ContratoService service = new ContratoService(DaoDao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso do contrato ao excluir", retorno);
    }

    @Test
    public void AlterarTest(){
        IContratoDao DaoDao = new ContratoDaoMock();
        IContratoService service = new ContratoService(DaoDao);
        String retorno = service.alterar();
        Assert.assertEquals("Sucesso do contrato ao alterar", retorno);
    }


    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAlterarTest() {
        IContratoDao DaoDao = new ContratoDao();
        ContratoService service = new ContratoService(DaoDao);
        String retorno = service.alterar();
        Assert.assertEquals("Sucesso do contrato ao alterar", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvar(){
        IContratoDao DaoDao = new ContratoDao();
        IContratoService service = new ContratoService(DaoDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso do contrato ao salvar", retorno);
    }
}