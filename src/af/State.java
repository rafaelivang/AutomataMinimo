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
    
    public boolean acceptation = false;
    public boolean initialState = false;
    public String state = null;
    public Map<String, List<State>> transitions;
    
    public State(boolean acceptation, boolean initialState, String state, Map<String, List<State>> transitions){
        this.acceptation = acceptation;
        this.initialState = initialState;
        this.state = state;
        this.transitions = transitions;
    }
    
}
