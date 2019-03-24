package com.example.statepattern;

public interface State {
    public void approve(Approval approval);
    public void reject(Approval approval);

}
