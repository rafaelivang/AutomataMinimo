/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package af;

/**
 *
 * @author m
 */
public class DeterministicFiniteAutomaton {
    private String initialState = null;
    private String[] alphabet = null;
    private String[] states = null;
    private String[] transitions = null;
    private String[] acceptationStates = null;
    
    public DeterministicFiniteAutomaton(String initialState, String[] alphabet, String[] states, String[] transitions, String[] acceptationStates){
        this.initialState = initialState;
        this.alphabet = alphabet;
        this.states = states;
        this.transitions = transitions;
        this.acceptationStates = acceptationStates;
    }
    
    public String[] getMinimizedAutomaton(){
        // TODO
        return null;
    }
    
}
