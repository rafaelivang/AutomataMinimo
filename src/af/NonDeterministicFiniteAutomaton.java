/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package af;

import java.util.List;

/**
 *
 * @author m
 */
public class NonDeterministicFiniteAutomaton {
    private String initialState = null;
    private String[] alphabet = null;
    private String[] states = null;
    private String[] transitions = null;
    private String[] acceptationStates = null;
    
    private final String VOID_TRANSITION = "ε";
    
    public NonDeterministicFiniteAutomaton(String initialState, String[] alphabet, String[] states, String[] transitions, String[] acceptationStates){
        this.initialState = initialState;
        this.alphabet = alphabet;
        this.states = states;
        this.transitions = transitions;
        this.acceptationStates = acceptationStates;
    }
    
    /**
     * A string array containing [alphabet, initialState, states, transitions, acceptationStates]
     * @return A string array containing [alphabet, initialState, states, transitions, acceptationStates]
     */
    public List[] getDeterministicAutomaton(){
        
        if (containsVoidTransitions()) {
            // TODO
        }
        
        // TODO
        return null;
    }
    
    private boolean containsVoidTransitions(){
        for (String sTmp : transitions) {
            return sTmp.contains(VOID_TRANSITION);
        }
        
        return false;
    }
    
    
}
