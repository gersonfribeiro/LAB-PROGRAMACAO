/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamagotchi;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class SeuTamagotchi extends Animal {

    public SeuTamagotchi() {}

//  nascer: pergunta os dados do animal (nome, classe e fam�lia). O animal recebe 10 de for�a e caloria, 0 na idade e true como estado;
    @Override
    Animal nascer(String nome, ClassesAnimal classe, FamiliasAnimal familia) {
        Animal tamagochi = new SeuTamagotchi();
        tamagochi.setNome(nome);
        tamagochi.setClasse(classe);
        tamagochi.setFamilia(familia);
        tamagochi.setCalorias(10);
        tamagochi.setForca(10);
        tamagochi.setIdade(0);
        tamagochi.setEstado(Boolean.TRUE);

        return tamagochi;
    }

//  morrer: coloca 0 na for�a e false como estado;
    @Override
    void morrer(Animal animal) {
        animal.setForca(0);
        animal.setEstado(Boolean.FALSE);
    }

//  comer: caso o animal n?o esteja cheio e/ou morto, insere 10 no estado caloria e retira 2 de for�a
    @Override
    void comer(Animal animal) {
        ExceptionsGenericas.validarAnimalVivo(animal);
        try {
            if (animal.getCalorias() >= 100) {
                throw new Exception(String.format("%s est� cheio!", animal.getNome()));
            } else {
                Integer novasCalorias = animal.getCalorias() + 10;
                if (novasCalorias <= 100) {
                    animal.setCalorias(novasCalorias);
                } else {
                    animal.setCalorias(100);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(SeuTamagotchi.class.getName()).log(Level.SEVERE, null, e);
        }
    }

//  correr: caso o animal n?o esteja morto ou exausto (caloria = 0), retira 5 do estado for�a e 5 do estado caloria;
    @Override
    void correr(Animal animal) {
        ExceptionsGenericas.validarAnimalVivo(animal);
        try {
            if (animal.getCalorias().equals(0)) {
                throw new Exception(String.format("%s est� exausto!", animal.getNome()));
            } else {
                animal.setForca(animal.getForca() - 5);
                animal.setCalorias(animal.getCalorias() - 5);
            }
        } catch (Exception e) {
            Logger.getLogger(SeuTamagotchi.class.getName()).log(Level.SEVERE, null, e);
        }
    }

//  dormir: caso o animal n?o esteja morto, insere 10 no estado for�a e retira 2 do estado caloria.
    @Override
    void dormir(Animal animal) {
        ExceptionsGenericas.validarAnimalVivo(animal);
        try {
            animal.setForca(animal.getForca() + 10);
            animal.setCalorias(animal.getCalorias() - 2);
        } catch (Exception e) {
            Logger.getLogger(SeuTamagotchi.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
