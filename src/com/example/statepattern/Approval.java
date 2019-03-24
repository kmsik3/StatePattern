package com.example.statepattern;

public class Approval {
    private State state;
    
    public Approval(State state) {
        setState(state);
    }
    
    // Set approval stage
    public void setState(State state) {
        this.state = state;
    }
    
    public void approve() {
        state.approve(this);
    }
    
    public void reject() {
        state.reject(this);
    }

}
