/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tamagotchi;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class Tamagotchi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaraç?o do animal
        Integer opcaoMenu = 0;
        Animal tamagotchi = new SeuTamagotchi();
        Scanner scanner = new Scanner(System.in);  
        tamagotchi.nascer(scanner);        
        
        try {
            scanner.reset();
            while (tamagotchi.getEstado().equals(Boolean.TRUE)) {       
                try {
                    System.out.println("Selecione uma das opç?es abaixo:\n1- COMER\n2- CORRER\n3- DORMIR\n4- MORRER e SAIR");
                    opcaoMenu = scanner.nextInt();   
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Por favor, insira um número.");
                    scanner.nextLine();
                    Logger.getLogger(SeuTamagotchi.class.getName()).log(Level.SEVERE, null, e);
                    continue;
                }
                
                switch (opcaoMenu) {
                    case 1: {
                        tamagotchi.comer();
                        break;
                    }
                    case 2: {
                        tamagotchi.correr();
                        break;
                    }
                    case 3: {
                        tamagotchi.dormir();
                        break;
                    }
                    case 4: {
                        tamagotchi.morrer();
                        break;
                    }
                    default: {
                        System.out.println("Opç?o inválida!");
                    }
                }
            }
        } catch (Exception e) {
            Logger.getLogger(SeuTamagotchi.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
