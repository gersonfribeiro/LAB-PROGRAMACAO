package gerenciamentobiblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
  Classe principal GerenciamentoBiblioteca:
  Implementa o sistema de gerenciamento de biblioteca.
  Permite:
  - Gerenciar livros (listar, adicionar, editar, remover)
  - Gerenciar membros (listar, adicionar, remover)
  - Gerenciar empréstimos (listar, realizar, encerrar)
 */
public class GerenciamentoBiblioteca {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Listas principais para armazenar dados do sistema
        List<Livro> livros = new ArrayList<>();          // Armazena livros cadastrados
        List<Usuario> usuarios = new ArrayList<>();      // Armazena usuários (membros e funcionários)
        List<Emprestimo> emprestimos = new ArrayList<>();// Armazena empréstimos realizados

        int opcao;

        // Menu principal do sistema
        do {
            System.out.println("\n=== SISTEMA DE GERENCIAMENTO DE BIBLIOTECA ===");
            System.out.println("1 - Gerenciar Livros");
            System.out.println("2 - Gerenciar Membros");
            System.out.println("3 - Gerenciar Empréstimos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    // Chama o menu de livros
                    menuLivros(livros, sc);
                    break;
                case 2:
                    // Chama o menu de membros
                    menuMembros(usuarios, sc);
                    break;
                case 3:
                    // Chama o menu de empréstimos
                    menuEmprestimos(livros, usuarios, emprestimos, sc);
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }

    //  MENU LIVROS
    private static void menuLivros(List<Livro> livros, Scanner sc) {
        int opc;
        do {
            System.out.println("\n--- GERENCIAR LIVROS ---");
            System.out.println("1 - Listar livros");
            System.out.println("2 - Adicionar livro");
            System.out.println("3 - Editar livro");
            System.out.println("4 - Remover livro");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    // Listagem de livros
                    System.out.println("\n=== LISTA DE LIVROS ===");
                    if (livros.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado.");
                    } else {
                        for (int i = 0; i < livros.size(); i++) {
                            Livro l = livros.get(i);
                            System.out.println((i + 1) + " - " + l.getTitulo() + " | " + l.getAutor() + " | ISBN: " + l.getISBN());
                        }
                    }
                    break;

                case 2:
                    // Adiciona um novo livro
                    Livro novo = new Livro();
                    System.out.print("Título: ");
                    novo.setTitulo(sc.nextLine());
                    System.out.print("Autor: ");
                    novo.setAutor(sc.nextLine());
                    System.out.print("Editora: ");
                    novo.setEditora(sc.nextLine());
                    System.out.print("Ano publicação (YYYY-MM-DD): ");
                    novo.setDataPubli(LocalDate.parse(sc.nextLine()));
                    System.out.print("ISBN: ");
                    novo.setISBN(sc.nextInt());
                    sc.nextLine();
                    livros.add(novo);
                    System.out.println("Livro adicionado!");
                    break;

                case 3:
                    // Edita um livro selecionado pelo usuário
                    if (livros.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado para editar.");
                        break;
                    }
                    System.out.println("\n=== LISTA DE LIVROS ===");
                    for (int i = 0; i < livros.size(); i++) {
                        Livro l = livros.get(i);
                        System.out.println((i + 1) + " - " + l.getTitulo() + " | " + l.getAutor() + " | ISBN: " + l.getISBN());
                    }
                    System.out.print("Informe o número do livro para editar: ");
                    int idxEdit = sc.nextInt() - 1;
                    sc.nextLine();
                    if (idxEdit >= 0 && idxEdit < livros.size()) {
                        Livro l = livros.get(idxEdit);
                        System.out.print("Novo título (" + l.getTitulo() + "): ");
                        String t = sc.nextLine();
                        if (!t.isEmpty()) l.setTitulo(t);
                        System.out.print("Novo autor (" + l.getAutor() + "): ");
                        t = sc.nextLine();
                        if (!t.isEmpty()) l.setAutor(t);
                        System.out.print("Nova editora (" + l.getEditora() + "): ");
                        t = sc.nextLine();
                        if (!t.isEmpty()) l.setEditora(t);
                        System.out.print("Nova data publicação (" + l.getDataPubli() + "): ");
                        t = sc.nextLine();
                        if (!t.isEmpty()) l.setDataPubli(LocalDate.parse(t));
                        System.out.print("Novo ISBN (" + l.getISBN() + "): ");
                        String isbn = sc.nextLine();
                        if (!isbn.isEmpty()) l.setISBN(Integer.parseInt(isbn));
                        System.out.println("Livro editado!");
                    } else {
                        System.out.println("Número inválido!");
                    }
                    break;

                case 4:
                    // Remove um livro selecionado pelo usuário
                    if (livros.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado para remover.");
                        break;
                    }
                    System.out.println("\n=== LISTA DE LIVROS ===");
                    for (int i = 0; i < livros.size(); i++) {
                        Livro l = livros.get(i);
                        System.out.println((i + 1) + " - " + l.getTitulo() + " | " + l.getAutor() + " | ISBN: " + l.getISBN());
                    }
                    System.out.print("Informe o número do livro para remover: ");
                    int idxRem = sc.nextInt() - 1;
                    sc.nextLine();
                    if (idxRem >= 0 && idxRem < livros.size()) {
                        livros.remove(idxRem);
                        System.out.println("Livro removido!");
                    } else {
                        System.out.println("Número inválido!");
                    }
                    break;
            }
        } while (opc != 0);
    }

    // MENU MEMBROS
    private static void menuMembros(List<Usuario> usuarios, Scanner sc) {
        int opc;
        do {
            System.out.println("\n--- GERENCIAR MEMBROS ---");
            System.out.println("1 - Listar membros");
            System.out.println("2 - Adicionar membro");
            System.out.println("3 - Remover membro");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    // Listar todos os membros
                    System.out.println("\n=== LISTA DE MEMBROS ===");
                    int count = 1;
                    for (Usuario u : usuarios) {
                        if (u instanceof Membro) {
                            System.out.println(count + " - " + u.getNome() + " | CPF: " + u.getCpf() + " | Nascimento: " + u.getDataNasc());
                            count++;
                        }
                    }
                    if (count == 1) System.out.println("Nenhum membro cadastrado.");
                    break;

                case 2:
                    // Adicionar um novo membro
                    Membro novo = new Membro();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    System.out.print("Data Nascimento (YYYY-MM-DD): ");
                    LocalDate data = LocalDate.parse(sc.nextLine());
                    novo.cadastrar(nome, cpf, data);
                    usuarios.add(novo);
                    System.out.println("Membro adicionado!");
                    break;

                case 3:
                    // Remover membro existente
                    List<Membro> membros = new ArrayList<>();
                    for (Usuario u : usuarios) if (u instanceof Membro) membros.add((Membro) u);

                    if (membros.isEmpty()) {
                        System.out.println("Nenhum membro cadastrado para remover.");
                        break;
                    }

                    System.out.println("Escolha o membro para remover (número):");
                    for (int i = 0; i < membros.size(); i++) {
                        System.out.println((i + 1) + " - " + membros.get(i).getNome());
                    }
                    int idxRem = sc.nextInt() - 1;
                    sc.nextLine();
                    if (idxRem >= 0 && idxRem < membros.size()) {
                        usuarios.remove(membros.get(idxRem));
                        System.out.println("Membro removido!");
                    } else {
                        System.out.println("Número inválido!");
                    }
                    break;
            }
        } while (opc != 0);
    }

    // MENU EMPRÉSTIMOS
    private static void menuEmprestimos(List<Livro> livros, List<Usuario> usuarios, List<Emprestimo> emprestimos, Scanner sc) {
        int opc;
        do {
            System.out.println("\n--- GERENCIAR EMPRÉSTIMOS ---");
            System.out.println("1 - Listar empréstimos");
            System.out.println("2 - Realizar empréstimo");
            System.out.println("3 - Encerrar empréstimo");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    // Listar todos os empréstimos com valor calculado
                    System.out.println("\n=== LISTA DE EMPRÉSTIMOS ===");
                    if (emprestimos.isEmpty()) {
                        System.out.println("Nenhum empréstimo registrado.");
                    } else {
                        for (int i = 0; i < emprestimos.size(); i++) {
                            Emprestimo e = emprestimos.get(i);
                            System.out.println((i + 1) + " - Livro: " + e.getLivro().getTitulo() +
                                    " | Membro: " + e.getMembro().getNome() +
                                    " | Devolução: " + e.getDataDevolucao() +
                                    " | Valor: R$ " + String.format("%.2f", e.calcularValor()));
                        }
                    }
                    break;

                case 2:
                    // Realizar um novo empréstimo
                    if (livros.isEmpty()) {
                        System.out.println("Nenhum livro disponível para empréstimo.");
                        break;
                    }
                    System.out.println("Escolha um livro (número):");
                    for (int i = 0; i < livros.size(); i++) {
                        System.out.println((i + 1) + " - " + livros.get(i).getTitulo());
                    }
                    int idxLivro = sc.nextInt() - 1; sc.nextLine();

                    List<Membro> membros = new ArrayList<>();
                    for (Usuario u : usuarios) if (u instanceof Membro) membros.add((Membro) u);
                    if (membros.isEmpty()) {
                        System.out.println("Nenhum membro cadastrado para empréstimo.");
                        break;
                    }
                    System.out.println("Escolha um membro (número):");
                    for (int i = 0; i < membros.size(); i++) System.out.println((i + 1) + " - " + membros.get(i).getNome());
                    int idxMembro = sc.nextInt() - 1; sc.nextLine();

                    System.out.print("Dias para devolução: ");
                    int dias = sc.nextInt(); sc.nextLine();

                    Emprestimo novo = new Emprestimo(
                            livros.get(idxLivro),
                            membros.get(idxMembro),
                            LocalDate.now(),
                            LocalDate.now().plusDays(dias)
                    );
                    emprestimos.add(novo);
                    System.out.println("Empréstimo realizado! Valor: R$ " + String.format("%.2f", novo.calcularValor()));
                    break;

                case 3:
                    // Encerrar empréstimo existente
                    if (emprestimos.isEmpty()) {
                        System.out.println("Nenhum empréstimo registrado para encerrar.");
                        break;
                    }
                    System.out.println("Escolha um empréstimo para encerrar (número):");
                    for (int i = 0; i < emprestimos.size(); i++) {
                        Emprestimo e = emprestimos.get(i);
                        System.out.println((i + 1) + " - Livro: " + e.getLivro().getTitulo() +
                                " | Membro: " + e.getMembro().getNome() +
                                " | Valor: R$ " + String.format("%.2f", e.calcularValor()));
                    }
                    int idxEnc = sc.nextInt() - 1; sc.nextLine();
                    if (idxEnc >= 0 && idxEnc < emprestimos.size()) {
                        emprestimos.remove(idxEnc);
                        System.out.println("Empréstimo encerrado!");
                    } else {
                        System.out.println("Número inválido!");
                    }
                    break;
            }
        } while (opc != 0);
    }
}
