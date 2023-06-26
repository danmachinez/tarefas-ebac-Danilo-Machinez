package br.com.danmach.service;

import br.com.danmach.dao.IContratoDao;

public class ContratoService implements IContratoService {
    private IContratoDao contratoDao;

    public ContratoService(IContratoDao daoDao) {
        this.contratoDao = daoDao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso do contrato ao salvar";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Sucesso do contrato ao buscar";
    }

    @Override
    public String alterar() {
        contratoDao.alterar();
        return "Sucesso do contrato ao alterar";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Sucesso do contrato ao excluir";
    }
}