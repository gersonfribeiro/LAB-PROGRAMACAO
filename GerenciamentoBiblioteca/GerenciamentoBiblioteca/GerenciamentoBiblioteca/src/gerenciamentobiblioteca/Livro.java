/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamentobiblioteca;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private LocalDate dataPubli;
    private Integer ISBN;

    public Livro() {}

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

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public LocalDate getDataPubli() {
        return dataPubli;
    }

    public void setDataPubli(LocalDate dataPubli) {
        this.dataPubli = dataPubli;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }
    
    public List<Livro> listarLivros(List<Livro> livros) {
        return livros;
    }
    
    public List<Livro> incluir(List<Livro> livros, Livro livro) {
        livros.add(livro);
        return listarLivros(livros);
    }
    
    public List<Livro> editar(List<Livro> livros, Integer index, Livro livroUpdate) {
        livros.set(index, livroUpdate);
        return listarLivros(livros);
    }
    
    public List<Livro> remover(List<Livro> livros, Integer index) {
        livros.remove(index);
        return listarLivros(livros);
    }
}
