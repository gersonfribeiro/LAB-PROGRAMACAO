/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalsclass;

/**
 *
 * @author Aluno
 */
public abstract class AnimalsClass {
    private String name;
    private String song;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public abstract String emitSong();
    
    public abstract String alterSong(String newSong);
    
}
