/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamagotchi;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class ExceptionsGenericas {

    public ExceptionsGenericas() {}
    
    public static void validarAnimalVivo(Animal animal) {
        try {
            if (animal.getEstado().equals(Boolean.FALSE)) {
                throw new Exception(String.format("%s esta morto!", animal.getNome()));
            }
        } catch (Exception e) {
            Logger.getLogger(SeuTamagotchi.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public static Boolean validarEntradaCriacao(Integer opcao, ArrayList<Integer> valoresValidos, ArrayList<String> descricoes) {
        Boolean validar = Boolean.FALSE;
        try {
            for (int i = 0; i < valoresValidos.size(); i++) {
                if (opcao.equals(valoresValidos.get(i))) {
                    validar = Boolean.TRUE;
                    return validar;
                }
            }
            if (!validar) {
                String mensagemErro = String.format("%d nao e um valor valido!\nSelecione entre: \n", opcao + 1);
                for (int i = 0; i < valoresValidos.size(); i++) {
                    mensagemErro += String.format("%d - %s\n", i + 1, descricoes.get(i));
                }
                throw new Exception(mensagemErro);
            }
        } catch (Exception e) {
            Logger.getLogger(SeuTamagotchi.class.getName()).log(Level.SEVERE, null, e);
        }
        return validar;
    }
}
