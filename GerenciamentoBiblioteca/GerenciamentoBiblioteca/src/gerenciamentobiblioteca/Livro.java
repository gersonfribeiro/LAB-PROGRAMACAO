package gerenciamentobiblioteca;

import java.time.LocalDate;
import java.util.List;

/*
  Classe Livro:
  Representa um livro da biblioteca, com título, autor, editora, data de publicação e ISBN.
  Contém métodos para listar, incluir, editar e remover livros em listas.
 */
public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private LocalDate dataPubli;
    private Integer ISBN;

    public Livro() {}

    // GETTERS E SETTERS
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getEditora() { return editora; }
    public void setEditora(String editora) { this.editora = editora; }

    public LocalDate getDataPubli() { return dataPubli; }
    public void setDataPubli(LocalDate dataPubli) { this.dataPubli = dataPubli; }

    public Integer getISBN() { return ISBN; }
    public void setISBN(Integer ISBN) { this.ISBN = ISBN; }

    // MÉTODOS DE GERENCIAMENTO

    // Retorna a lista de livros recebida

    public List<Livro> listarLivros(List<Livro> livros) {
        return livros;
    }

    // Inclui um livro na lista e retorna a lista atualizada
    public List<Livro> incluir(List<Livro> livros, Livro livro) {
        livros.add(livro);
        return listarLivros(livros);
    }

    // Edita um livro existente na lista, substituindo pelo livro atualizado

    public List<Livro> editar(List<Livro> livros, Integer index, Livro livroUpdate) {
        livros.set(index, livroUpdate);
        return listarLivros(livros);
    }

    // Remove um livro da lista pelo índice
    
    public List<Livro> remover(List<Livro> livros, Integer index) {
        livros.remove(index);
        return listarLivros(livros);
    }
}
