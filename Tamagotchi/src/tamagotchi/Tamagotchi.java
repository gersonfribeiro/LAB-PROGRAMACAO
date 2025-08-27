/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tamagotchi;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static tamagotchi.ExceptionsGenericas.validarEntradaCriacao;

/**
 *
 * @author Aluno
 */
public class Tamagotchi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaraç?o do Scanner
        Scanner scanner = new Scanner(System.in);
        String nomeTamagotchi = "";
        int opcaoClasse = 0;
        int opcaoFamilia = 0;
        
        // Declaraç?o do animal
        Animal girafaTamagotchi = new SeuTamagotchi();

        try {
            // Solicitar ao usuário as informaç?es para o tamagotchi nascer - NOME
            System.out.println("Primeiro de um nome ao seu Tamagotchi: ");
            nomeTamagotchi = scanner.nextLine();
            System.out.println(String.format("Nome do seu Tamagotchi: %s", nomeTamagotchi));
            
            // - CLASSE
            System.out.println("Agora escolha a sua classe!");
            String opcoesClasses = "Selecione entre: \n";
            ClassesAnimal[] classesAnimais = ClassesAnimal.values();            
            ArrayList<Integer> valoresValidos = new ArrayList<>();
            ArrayList<String> descricoes = new ArrayList<>();

            for (int i = 0; i < ClassesAnimal.values().length; i++) {
                opcoesClasses += String.format("%d - %s\n", i + 1, classesAnimais[i].name());
                valoresValidos.add(i);
                descricoes.add(classesAnimais[i].name());
            }
            
            System.out.println(opcoesClasses);
            opcaoClasse = scanner.nextInt();
            opcaoClasse = opcaoClasse - 1;
            validarEntradaCriacao(opcaoClasse, valoresValidos, descricoes);
            
            System.out.println("Voce digitou: " + (opcaoClasse + 1) + " - " + classesAnimais[opcaoFamilia].name());
            
            // - FAMILIA
            System.out.println("Por fim escolha a familia!");
            String opcoesFamilias = "Selecione entre:\n";
            FamiliasAnimal[] familiasAnimais = FamiliasAnimal.values();            
            valoresValidos = new ArrayList<>();
            descricoes = new ArrayList<>();

            for (int i = 0; i < FamiliasAnimal.values().length; i++) {
                opcoesFamilias += String.format("%d - %s\n", i + 1, familiasAnimais[i].name());
                valoresValidos.add(i);
                descricoes.add(familiasAnimais[i].name());
            }
            
            System.out.println(opcoesFamilias);
            opcaoFamilia = scanner.nextInt();
            opcaoFamilia = opcaoFamilia - 1;
            validarEntradaCriacao(opcaoFamilia, valoresValidos, descricoes);

            System.out.println("Voce digitou: " + (opcaoFamilia + 1) + " - " + familiasAnimais[opcaoFamilia].name());

        } catch (Exception e) {
            // Exceç?o genérica para qualquer erro
            System.out.println("Erro: " + e.getMessage());
            // Lançar uma exceç?o personalizada
            throw new RuntimeException("Erro no processamento de entrada", e);
        } finally {
            // Garantir que o Scanner seja fechado
            try {
                if (scanner.equals(null)) {
                    throw new Exception("Erro ao fechar o scanner!");
                } else {
                    scanner.close();
                }
            } catch (Exception e) {
                Logger.getLogger(SeuTamagotchi.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
}
