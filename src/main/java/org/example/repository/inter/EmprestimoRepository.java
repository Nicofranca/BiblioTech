package org.example.repository.inter;

import org.example.model.impl.EmprestimoImpl;

import java.sql.SQLException;
import java.util.List;

public interface EmprestimoRepository {
    EmprestimoImpl createEmprestimo(EmprestimoImpl emprestimo) throws SQLException;
    EmprestimoImpl readEmprestimoForId(int id) throws SQLException ;
    List<EmprestimoImpl> readAllEmprestimo() throws SQLException ;
    List<EmprestimoImpl> readAllEmprestimoForUsuarioId(int id) throws SQLException ;
    void updateEmprestimo(EmprestimoImpl emprestimo) throws SQLException ;
    void deleteEmprestimo(EmprestimoImpl emprestimo) throws SQLException ;
}
