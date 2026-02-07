package org.example.model.impl;

public class LivroImpl {
    private int id;
    private String titulo;
    private String autor;
    private String isbn;
    private String status;

    public LivroImpl() {
    }

    public LivroImpl(String titulo, String autor, String isbn, String status) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.status = status;
    }

    public LivroImpl(int id, String titulo, String autor, String isbn, String status) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

/*id INT AUTO_INCREMENT PRIMARY KEY, -- Identificador único gerado automaticamente
    titulo VARCHAR(255) NOT NULL,      -- O título é obrigatório
    autor VARCHAR(255) NOT NULL,
    isbn VARCHAR(20) UNIQUE NOT NULL,  -- ISBN não pode repetir
    status VARCHAR(20) DEFAULT 'DISPONIVEL'

 */