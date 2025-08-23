package gerenciamentobiblioteca;

import java.time.LocalDate;

/*
  Classe Funcionario:
  Subclasse de Usuario que representa os funcionários da biblioteca.
  Possui atributo adicional: salario.
  Implementa os métodos cadastrar e editar.
 */
public class Funcionario extends Usuario {
    private Double salario;

    public Funcionario() {}

    public Double getSalario() { return salario; }
    public void setSalario(Double salario) { this.salario = salario; }

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
