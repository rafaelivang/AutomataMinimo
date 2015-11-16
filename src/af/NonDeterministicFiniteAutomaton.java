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
    List<State> nonDeterministicStates;
    
    public NonDeterministicFiniteAutomaton(List<State> nonDeterministicStates){
        this.nonDeterministicStates = nonDeterministicStates;
    }
    
    /**
     * A list of states containing
     * @return A string array containing [alphabet, initialState, states, transitions, acceptationStates]
     */
    public List<State> getDeterministicAutomaton(){
        
        // TODO
//        if (containsVoidTransitions()) {
//            // TODO
//        }
        
        // TODO
        return null;
    }    
}
