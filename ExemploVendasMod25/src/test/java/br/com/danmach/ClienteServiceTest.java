package br.com.danmach;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.danmach.dao.ClienteDaoMock;
import br.com.danmach.dao.IClienteDAO;
import br.com.danmach.domain.Cliente;
import br.com.danmach.exceptions.TipoChaveNaoEncontradaException;
import br.com.danmach.services.ClienteService;
import br.com.danmach.services.IClienteService;


public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(1234567890L);
		cliente.setNome("Danilo");
		cliente.setCidade("Rio de Janeiro");
		cliente.setEnd("Rua");
		cliente.setEstado("RJ");
		cliente.setNumero(7);
		cliente.setTel(21999999999L);
		
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Rodrigo Pires");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Rodrigo Pires", cliente.getNome());
	}
}