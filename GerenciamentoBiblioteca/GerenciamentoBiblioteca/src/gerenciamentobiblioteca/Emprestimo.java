package gerenciamentobiblioteca;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

/*
  Classe Emprestimo:
  Representa um empréstimo de livro feito por um membro.
  Contém livro emprestado, membro, datas de empréstimo e devolução.
  Permite calcular o valor do empréstimo baseado no número de dias.
 */
public class Emprestimo {
    private Livro livro;
    private Membro membro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private static final double VALOR_DIARIO = 2.0; // Valor por dia

    public Emprestimo() {}

    public Emprestimo(Livro livro, Membro membro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    // GETTERS E SETTERS
    public Livro getLivro() { return livro; }
    public void setLivro(Livro livro) { this.livro = livro; }

    public Membro getMembro() { return membro; }
    public void setMembro(Membro membro) { this.membro = membro; }

    public LocalDate getDataEmprestimo() { return dataEmprestimo; }
    public void setDataEmprestimo(LocalDate dataEmprestimo) { this.dataEmprestimo = dataEmprestimo; }

    public LocalDate getDataDevolucao() { return dataDevolucao; }
    public void setDataDevolucao(LocalDate dataDevolucao) { this.dataDevolucao = dataDevolucao; }

    // MÉTODO DE CÁLCULO
    // Calcula o valor do empréstimo com base nos dias entre empréstimo e devolução
    public double calcularValor() {
        long dias = ChronoUnit.DAYS.between(dataEmprestimo, dataDevolucao);
        if (dias <= 0) dias = 1; // mínimo de 1 dia
        return dias * VALOR_DIARIO;
    }

    // MÉTODOS DE GERENCIAMENTO
    public List<Emprestimo> listarEmprestimos(List<Emprestimo> emprestimos) { return emprestimos; }

    public List<Emprestimo> realizarEmprestimo(List<Emprestimo> emprestimos, Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        return listarEmprestimos(emprestimos);
    }

    public List<Emprestimo> encerrarEmprestimo(List<Emprestimo> emprestimos, Emprestimo emprestimo) {
        emprestimos.remove(emprestimo);
        return listarEmprestimos(emprestimos);
    }
}
