package com.example.statepattern;

public class FirstApprovalStage implements State {
    
    public FirstApprovalStage() {
        
    }
    
    public void approve(Approval approval) {
        System.out.println("Move it to the second approval stage");
        approval.setState(new SecondApprovalStage());
    }
    
    public void reject(Approval approval) {
        System.out.println("Approval request is cancelled");
    }

}
