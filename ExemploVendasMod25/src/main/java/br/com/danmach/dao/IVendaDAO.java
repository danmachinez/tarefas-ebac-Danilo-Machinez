package br.com.danmach.dao;

import br.com.danmach.dao.generic.IGenericDAO;
import br.com.danmach.domain.Venda;
import br.com.danmach.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}