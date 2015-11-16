/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author m
 */
public class FiniteAutomatonUtil {
    
    public static int getLetterPosition(String let, String[] alphabet){
        for (int i = 0; i < alphabet.length; i++) {
            String letter = alphabet[i];
            if (letter.equals(let)) {
                return i;
            }
        }
        
        return -1;
    }
}
