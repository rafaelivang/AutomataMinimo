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
    
    public static boolean isVoidTransitionPresent(List<State> nonDeterministicStates){
        for (State st : nonDeterministicStates) {
            Map<String, List<State>> trans = st.getTransitions();
            
            for (String key : trans.keySet()) {
                if (key.equals(VOID_TRANSITION) && !isEmpty(trans.get(key))) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    /**
     * Validates if the <code>List</code> is null or empty.
     * @param list
     * @return <code>True</code> if <code>List</code> is empty or null; otherwise <code>False</code>.
     */
    public static boolean isEmpty(List list){
        return list == null || list.isEmpty();
    }
    
    /**
     * Validates if the <code>String</code> is null or empty.
     * @param str
     * @return <code>True</code> if <code>String</code> is empty or null; otherwise <code>False</code>.
     */
    public static boolean isEmpty(String str){
        return str == null || str.isEmpty();
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
