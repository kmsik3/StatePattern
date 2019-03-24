package com.example.statepattern;

public class SecondApprovalStage implements State{
    
    public SecondApprovalStage() {
        
    }
        
    public void approve(Approval approval) {
        System.out.println("Move it to the final approval stage");
        approval.setState(new FinalApprovalStage());
    }
    
    public void reject(Approval approval) {
        System.out.println("Approval request is back to the first approval stage");
        approval.setState(new FirstApprovalStage());
    }

}
