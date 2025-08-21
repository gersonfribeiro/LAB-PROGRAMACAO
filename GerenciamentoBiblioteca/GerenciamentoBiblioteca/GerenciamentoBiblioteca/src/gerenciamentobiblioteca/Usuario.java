/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamentobiblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
abstract class Usuario {
   protected String nome;
   protected String cpf;
   protected LocalDate dataNasc;

    public Usuario() {}
    
    public List<Usuario> criarListaVazia() {
        return new ArrayList<Usuario>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }
   
    abstract Usuario cadastrar(String nome, String cpf, LocalDate dataNasc);
    
    abstract Usuario editar(Integer index, Usuario usuarioUpdate);
}
