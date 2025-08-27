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
                throw new Exception(String.format("%s está morto!", animal.getNome()));
            }
        } catch (Exception e) {
            Logger.getLogger(SeuTamagotchi.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public static void validarEntradaCriacao(Integer opcao, ArrayList<Integer> valoresValidos, ArrayList<String> descricoes) {
        try {
            Boolean validar = Boolean.FALSE;
            for (int i = 0; i < valoresValidos.size(); i++) {
                if (opcao.equals(valoresValidos.get(i))) {
                    validar = Boolean.TRUE;
                    break;
                }
            }
            if (!validar) {
                String mensagemErro = String.format("%d N?o é um valor válido!\nSelecione entre: \n", opcao);
                for (int i = 0; i < valoresValidos.size(); i++) {
                    mensagemErro += String.format("%d - %s\n", i + 1, descricoes.get(i));
                }
                throw new Exception(mensagemErro);
            }
        } catch (Exception e) {
            Logger.getLogger(SeuTamagotchi.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
