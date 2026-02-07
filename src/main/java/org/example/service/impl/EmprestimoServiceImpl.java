package org.example.service.impl;

import org.example.model.impl.EmprestimoImpl;
import org.example.service.inter.EmprestimoService;

import java.sql.SQLException;
import java.util.List;

public class EmprestimoServiceImpl implements EmprestimoService {

    @Override
    public EmprestimoImpl realizarEmprestimo(EmprestimoImpl emprestimo) throws SQLException {
        return null;
    }

    @Override
    public EmprestimoImpl buscarEmprestimoForId(int id) throws SQLException {
        return null;
    }

    @Override
    public List<EmprestimoImpl> buscarAllEmprestimo() throws SQLException {
        return List.of();
    }

    @Override
    public List<EmprestimoImpl> buscarAllEmprestimoForUsuarioId(int id) throws SQLException {
        return List.of();
    }

    @Override
    public void atualizarEmprestimo(EmprestimoImpl emprestimo) throws SQLException {

    }

    @Override
    public void deletearEmprestimo(EmprestimoImpl emprestimo) throws SQLException {

    }
}
