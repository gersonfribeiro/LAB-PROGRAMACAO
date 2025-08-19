/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animalsclass;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HorseClass flash = new HorseClass();
        flash.setName("Flash");
        flash.setSong("Relincho");
         
        
        CatClass garfield = new CatClass();
        garfield.setName("Garfield");
        garfield.setSong("Miado");
        System.out.println(String.format("%s", garfield.emitSong()));
        
        DogClass max = new DogClass();
        max.setName("Max");
        max.setSong("Latido");
        System.out.println(String.format("%s", max.emitSong()));
        
        System.out.println(String.format("%s", flash.alterSong("Miado")));
        System.out.println(String.format("%s", garfield.alterSong("Choro de criança")));
        System.out.println(String.format("%s", max.alterSong("Grito de velho")));    
        
        VeterinarianClass veterinarian = new VeterinarianClass();
        List<AnimalsClass> animals = new ArrayList<>();
        
        animals.add(flash);
        animals.add(garfield);
        animals.add(max);
        
        veterinarian.insertInCart(animals);
        
        System.out.println(String.format("Cart: ", veterinarian.getCart()));
    }
    
}
