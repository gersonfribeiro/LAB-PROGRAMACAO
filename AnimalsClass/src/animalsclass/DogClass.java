/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalsclass;

/**
 *
 * @author Aluno
 */
public class DogClass extends AnimalsClass {

    public DogClass() {}

    @Override
    public String emitSong() {
        return  String.format("%s emit: %s", this.getName(), this.getSong());
    }    

    @Override
    public String alterSong(String newSong) {
        System.out.println(String.format("New song emited by: %s", this.getName()));
        this.setSong(newSong);
        return this.emitSong();
    }
    
}
