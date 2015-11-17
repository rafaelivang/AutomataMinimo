/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package af;

import java.util.List;
import static util.FiniteAutomatonUtil.isVoidTransitionPresent;

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
     * A list of <code>State</code> containing a Deterministic Automaton
     * @return A string array containing [alphabet, initialState, states, transitions, acceptationStates]
     */
    public List<State> getDeterministicAutomaton(){
        if (isVoidTransitionPresent(nonDeterministicStates)) {
            // TODO get allep zero table
        }
        
        // TODO  get delta table
        // TODO  Create AFD
        
        return null;
    }    
}
