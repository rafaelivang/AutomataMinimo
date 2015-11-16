/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package af;

import static util.FiniteAutomatonUtil.getLetterPosition;

/**
 *
 * @author m
 */
public class FiniteAutomaton {
    
    private String initialState = null;
    private String[] alphabet = null;
    private String[] states = null;
    private String[] transitions = null;
    private String[] acceptationStates = null;
    
    private final String VOID_TRANSITION = "ε";
    
    public FiniteAutomaton(String initialState, String[] alphabet, String[] states, String[] transitions, String[] acceptationStates){
        this.initialState = initialState;
        this.alphabet = alphabet;
        this.states = states;
        this.transitions = transitions;
        this.acceptationStates = acceptationStates;
    }
    
    /**
     * δ table
     * @return δ table
     */
    private String[][] getFirstTable(){
        String[][] firstTable = new String[states.length][alphabet.length];
        
        for (int idx = 0; idx < states.length; idx++) {
            String state = states[idx];
            for (String trans : transitions) {
                String[] sTns = trans.split(",");
                if (sTns[0].equals(state)) {
                    int letPos = getLetterPosition(sTns[1], alphabet);
                    if (firstTable[idx][letPos] == null || firstTable[idx][letPos].isEmpty()) {
                        
                    }
                    firstTable[idx][letPos] = sTns[2];
                }
            }
        }
        return null;
//        return firstTable;
    }
    
}
