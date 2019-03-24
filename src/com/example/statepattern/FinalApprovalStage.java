package com.example.statepattern;

public class FinalApprovalStage implements State {
    
    public FinalApprovalStage() {
        
    }
    
    public void approve(Approval approval) {
        System.out.println("Approve request is finally confirmed");
    }
    
    public void reject(Approval approval) {
        System.out.println("Approval request is back to the second approve stage");
        approval.setState(new SecondApprovalStage());
    }

}
