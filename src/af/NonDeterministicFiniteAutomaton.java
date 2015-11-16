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
    List<State> states;
    
    private final String VOID_TRANSITION = "ε";
    
    public NonDeterministicFiniteAutomaton(List<State> states){
        this.states = states;
    }
    
    /**
     * A string array containing [alphabet, initialState, states, transitions, acceptationStates]
     * @return A string array containing [alphabet, initialState, states, transitions, acceptationStates]
     */
    public List[] getDeterministicAutomaton(){
        
        // TODO
//        if (containsVoidTransitions()) {
//            // TODO
//        }
        
        // TODO
        return null;
    }    
}
