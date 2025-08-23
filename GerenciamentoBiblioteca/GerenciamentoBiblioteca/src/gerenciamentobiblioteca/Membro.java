package gerenciamentobiblioteca;

import java.time.LocalDate;
import java.util.List;

/*
  Classe Membro:
  Subclasse de Usuario que representa os membros da biblioteca.
  Possui lista de empréstimos feitos pelo membro.
  Implementa os métodos cadastrar e editar.
 */
public class Membro extends Usuario{
    private List<Emprestimo> emprestimos;

    public Membro() {}

    public List<Emprestimo> getEmprestimos() { return emprestimos; }
    public void setEmprestimos(List<Emprestimo> emprestimos) { this.emprestimos = emprestimos; }

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
