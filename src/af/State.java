/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package af;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static util.FiniteAutomatonUtil.getLetterPosition;

/**
 *
 * @author m
 */
public class State {
    
    private boolean acceptationState = false;
    private boolean initialState = false;
    private String state = null;
    private Map<String, List<State>> transitions;
    
    public State(boolean acceptationState, boolean initialState, String state, Map<String, List<State>> transitions){
        this.acceptationState = acceptationState;
        this.initialState = initialState;
        this.state = state;
        this.transitions = transitions;
    }

    /**
     * @return the acceptationState
     */
    public boolean isAcceptationState() {
        return acceptationState;
    }

    /**
     * @return the initialState
     */
    public boolean isInitialState() {
        return initialState;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @return the transitions
     */
    public Map<String, List<State>> getTransitions() {
        return transitions;
    }
    
}
