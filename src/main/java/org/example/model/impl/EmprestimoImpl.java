package org.example.model.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EmprestimoImpl {
    private int id;
    private int usuario_id;
    private int livro_id;
    private LocalDate data_emprestimo;
    private LocalDate data_devolucao;

    public EmprestimoImpl() {
    }

    public EmprestimoImpl(int usuario_id, int livro_id, LocalDate data_emprestimo, LocalDate data_devolucao) {
        this.usuario_id = usuario_id;
        this.livro_id = livro_id;
        this.data_emprestimo = data_emprestimo;
        this.data_devolucao = data_devolucao;
    }

    public EmprestimoImpl(int id, int usuario_id, int livro_id, LocalDate data_emprestimo, LocalDate data_devolucao) {
        this.id = id;
        this.usuario_id = usuario_id;
        this.livro_id = livro_id;
        this.data_emprestimo = data_emprestimo;
        this.data_devolucao = data_devolucao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getLivro_id() {
        return livro_id;
    }

    public void setLivro_id(int livro_id) {
        this.livro_id = livro_id;
    }

    public LocalDate getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(LocalDate data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public LocalDate getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(LocalDate data_devolucao) {
        this.data_devolucao = data_devolucao;
    }
}
/*
id INT AUTO_INCREMENT PRIMARY KEY,
usuario_id INT NOT NULL,
livro_id INT NOT NULL,
data_emprestimo DATE NOT NULL,
data_devolucao DATE
     */