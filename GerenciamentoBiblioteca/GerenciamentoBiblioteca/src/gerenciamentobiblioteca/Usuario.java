package gerenciamentobiblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
  Classe abstrata Usuario:
  Representa um usuário genérico da biblioteca (membro ou funcionário).
  Contém atributos comuns: nome, CPF e data de nascimento.
  Define métodos abstratos cadastrar e editar, que serão implementados pelas subclasses.
 */
abstract class Usuario {
    protected String nome;
    protected String cpf;
    protected LocalDate dataNasc;

    public Usuario() {}

    // Cria e retorna uma lista vazia de usuários
    
    public List<Usuario> criarListaVazia() {
        return new ArrayList<Usuario>();
    }

    // GETTERS E SETTERS
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public LocalDate getDataNasc() { return dataNasc; }
    public void setDataNasc(LocalDate dataNasc) { this.dataNasc = dataNasc; }

    // MÉTODOS ABSTRATOS
    abstract Usuario cadastrar(String nome, String cpf, LocalDate dataNasc);
    abstract Usuario editar(Integer index, Usuario usuarioUpdate);
}
