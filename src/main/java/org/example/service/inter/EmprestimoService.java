package org.example.service.inter;

import org.example.model.impl.EmprestimoImpl;

import java.sql.SQLException;
import java.util.List;

public interface EmprestimoService {
    EmprestimoImpl realizarEmprestimo(EmprestimoImpl emprestimo) throws SQLException;
    EmprestimoImpl buscarEmprestimoForId(int id) throws SQLException ;
    List<EmprestimoImpl> buscarAllEmprestimo() throws SQLException ;
    List<EmprestimoImpl> buscarAllEmprestimoForUsuarioId(int id) throws SQLException ;
    void atualizarEmprestimo(EmprestimoImpl emprestimo) throws SQLException ;
    void deletearEmprestimo(EmprestimoImpl emprestimo) throws SQLException ;

}
