/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class SeuTamagotchi extends Animal {

    public SeuTamagotchi() {}

//  nascer: pergunta os dados do animal (nome, classe e famÃ­lia). O animal recebe 10 de forÃ§a e caloria, 0 na idade e true como estado;
    @Override
    void nascer(Scanner scanner) {        
        solicitarDados(scanner);
        this.setCalorias(10);
        this.setForca(10);
        this.setIdade(0);
        this.setEstado(Boolean.TRUE);
        
        System.out.println(this.toString());

    }

//  morrer: coloca 0 na forÃ§a e false como estado;
    @Override
    void morrer() {
        this.setForca(0);
        this.setEstado(Boolean.FALSE);
        
        System.out.println(this.toString());
    }

//  comer: caso o animal n?o esteja cheio e/ou morto, insere 10 no estado caloria e retira 2 de forÃ§a
    @Override
    void comer() {
        ExceptionsGenericas.validarAnimalVivo(this);
        try {
            if (this.getCalorias() >= 100) {
                throw new Exception(String.format("%s esta cheio!", this.getNome()));
            } else {
                Integer novasCalorias = this.getCalorias() + 10;
                if (novasCalorias <= 100) {
                    this.setCalorias(novasCalorias);
                } else {
                    this.setCalorias(100);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(SeuTamagotchi.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            System.out.println(this.toString());
        }
    }

//  correr: caso o animal n?o esteja morto ou exausto (caloria = 0), retira 5 do estado forÃ§a e 5 do estado caloria;
    @Override
    void correr() {
        ExceptionsGenericas.validarAnimalVivo(this);
        try {
            if (this.getCalorias().equals(0)) {
                throw new Exception(String.format("%s esta exausto!", this.getNome()));
            } else {
                this.setForca(Math.max(this.getForca() - 5, 0));
                this.setCalorias(Math.max(this.getCalorias() - 5, 0));
            }
        } catch (Exception e) {
            Logger.getLogger(SeuTamagotchi.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            System.out.println(this.toString());
        }
    }

//  dormir: caso o animal n?o esteja morto, insere 10 no estado forÃ§a e retira 2 do estado caloria.
    @Override
    void dormir() {
        ExceptionsGenericas.validarAnimalVivo(this);
        try {
            this.setForca(this.getForca() + 10);
            this.setCalorias(Math.max(this.getCalorias() - 2, 0));
        } catch (Exception e) {
            Logger.getLogger(SeuTamagotchi.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            System.out.println(this.toString());
        }
    }
    
    public void solicitarDados(Scanner scanner) {
        // Declaraç?o do Scanner
        String nomeTamagotchi = "";
        Boolean controladoraValidacao = Boolean.FALSE;
        int opcaoClasse = 0;
        int opcaoFamilia = 0;
        
        try {
            // Solicitar ao usuário as informaç?es para o tamagotchi nascer - NOME
            System.out.println("Primeiro de um nome ao seu Tamagotchi: ");
            nomeTamagotchi = scanner.nextLine();
            System.out.println(String.format("Nome do seu Tamagotchi: %s", nomeTamagotchi));
            this.setNome(nomeTamagotchi);
            
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
            
            while (!controladoraValidacao) {
                opcaoClasse = scanner.nextInt();
                opcaoClasse = opcaoClasse - 1;
                controladoraValidacao = validarEntradaCriacao(opcaoClasse, valoresValidos, descricoes);
            }
            
            System.out.println("Voce digitou: " + (opcaoClasse + 1) + " - " + classesAnimais[opcaoClasse].name());
            this.setClasse(classesAnimais[opcaoClasse]);
            
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
            
            controladoraValidacao = Boolean.FALSE;
            while (!controladoraValidacao) {
                opcaoFamilia = scanner.nextInt();
                opcaoFamilia = opcaoFamilia - 1;
                controladoraValidacao = validarEntradaCriacao(opcaoFamilia, valoresValidos, descricoes);
            }
            
            System.out.println("Voce digitou: " + (opcaoFamilia + 1) + " - " + familiasAnimais[opcaoFamilia].name());
            this.setFamilia(familiasAnimais[opcaoFamilia]);

        } catch (Exception e) {
            // Exceç?o genérica para qualquer erro
            System.out.println("Erro: " + e.getMessage());
            // Lançar uma exceç?o personalizada
            throw new RuntimeException("Erro no processamento de entrada", e);
        }
    }

    @Override
    public String toString() {
        return String.format(
                "TAMAGOTCHI: \nNome: %s\nClasse: %s\nFamilia: %s\nIdade: %d\nCalorias: %d\nForça: %d",
                this.getNome(),
                this.getClasse().name(),
                this.getFamilia().name(),
                this.getIdade(),
                this.getCalorias(),
                this.getForca()
        );
    }
}
