/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamentobiblioteca;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Funcionario extends Usuario {
    private Double salario;

    public Funcionario() {}

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    Usuario cadastrar(String nome, String cpf, LocalDate dataNasc) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setDataNasc(dataNasc);
        return this;
    }

    @Override
    Usuario editar(Integer index, Usuario usuarioUpdate) {
        return this.cadastrar(usuarioUpdate.getNome(), usuarioUpdate.getCpf(), usuarioUpdate.getDataNasc());
    }
    
}
