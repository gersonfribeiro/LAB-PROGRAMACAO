package gerenciamentobiblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
  Classe abstrata Usuario:
  Representa um usu�rio gen�rico da biblioteca (membro ou funcion�rio).
  Cont�m atributos comuns: nome, CPF e data de nascimento.
  Define m�todos abstratos cadastrar e editar, que ser�o implementados pelas subclasses.
 */
abstract class Usuario {
    protected String nome;
    protected String cpf;
    protected LocalDate dataNasc;

    public Usuario() {}

    // Cria e retorna uma lista vazia de usu�rios
    
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

    // M�TODOS ABSTRATOS
    abstract Usuario cadastrar(String nome, String cpf, LocalDate dataNasc);
    abstract Usuario editar(Integer index, Usuario usuarioUpdate);
}
