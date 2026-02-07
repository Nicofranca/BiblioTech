package org.example.repository.impl;

import org.example.database.Conexao;
import org.example.model.impl.EmprestimoImpl;
import org.example.repository.inter.EmprestimoRepository;

import java.sql.*;
import java.util.List;

public class EmprestimoRepositoryImpl implements EmprestimoRepository {
    @Override
    public EmprestimoImpl createEmprestimo(EmprestimoImpl emprestimo) throws SQLException {
        String query = """
                INSERT INTO emprestimo(usuario_id, livro_id, data_emprestimo, data_devolucao) VALUES (?, ?, ?, ?)
                """;

        try(Connection conn = Conexao.conexao();
            PreparedStatement stmt = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setInt(1, emprestimo.getUsuario_id());
            stmt.setInt(2, emprestimo.getLivro_id());
            stmt.setDate(3, Date.valueOf(emprestimo.getData_emprestimo()));
            stmt.setDate(4, Date.valueOf(emprestimo.getData_devolucao()));
            stmt.executeUpdate();

            try(ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()){
                    emprestimo.setId(rs.getInt(1));
                }
            }

        }
        return emprestimo;
    }

    /*
    id INT AUTO_INCREMENT PRIMARY KEY,
    usuario_id INT NOT NULL,
    livro_id INT NOT NULL,
    data_emprestimo DATE NOT NULL,
    data_devolucao DATE
     */

    @Override
    public EmprestimoImpl readEmprestimoForId(int id) {
        return null;
    }

    @Override
    public List<EmprestimoImpl> readAllEmprestimo() {
        return List.of();
    }

    @Override
    public List<EmprestimoImpl> readAllEmprestimoForUsuarioId(int id) {
        return List.of();
    }

    @Override
    public void updateEmprestimo(EmprestimoImpl emprestimo) {

    }

    @Override
    public void deleteEmprestimo(EmprestimoImpl emprestimo) {

    }
}
