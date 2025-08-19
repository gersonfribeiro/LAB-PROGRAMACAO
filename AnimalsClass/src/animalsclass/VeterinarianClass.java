/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalsclass;

import java.util.List;

/**
 *
 * @author Aluno
 */
public class VeterinarianClass {
    private List<AnimalsClass> cart;

    public VeterinarianClass() {}

    public List<AnimalsClass> getCart() {
        return cart;
    }

    public void setCart(List<AnimalsClass> cart) {
        this.cart = cart;
    }
    
    public void insertInCart(List<AnimalsClass> animals) {
        animals.forEach((animal) -> {
            System.out.println(String.format("The vet took %s and put it in the cart!", animal.getName()));
            System.out.println(String.format("%s", animal.emitSong()));
        });
        
        this.setCart(animals);
    }
    
}
