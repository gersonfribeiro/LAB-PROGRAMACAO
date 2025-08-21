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
public class Membro extends Usuario{
    private List<Emprestimo> emprestimos;

    public Membro() {}

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
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
