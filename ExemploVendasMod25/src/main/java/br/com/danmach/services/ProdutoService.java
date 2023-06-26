package br.com.danmach.services;

import br.com.danmach.dao.IProdutoDAO;
import br.com.danmach.domain.Produto;
import br.com.danmach.services.generic.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}