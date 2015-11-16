/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import af.State;
import java.util.List;
import java.util.Map;
import static util.FiniteAutomatonConstants.VOID_TRANSITION;

/**
 *
 * @author m
 */
public class FiniteAutomatonUtil {
    
    public static boolean isNonDeterministic(List<State> states){
        for (State st : states) {
            Map<String, List<State>> trans = st.getTransitions();
            
            for (String key : trans.keySet()) {
                if (key.equals(VOID_TRANSITION) || trans.get(key).size() > 1) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    
    /**
     * TODO remove. Think this is not necessary anymore, leaving it for a moment just in case.
     * @param let
     * @param alphabet
     * @return 
     */
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
