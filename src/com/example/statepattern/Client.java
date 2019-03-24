package com.example.statepattern;

public class Client {

    public static void main(String[] args) {
        // Initial stage is FirstApprovalStage
        Approval approval = new Approval(new FirstApprovalStage());
        
        // Get rejected at FirstApprovalStage
        approval.reject();
        // Get approved at FirstApprovalStage, move to SecondApprovalStage
        approval.approve();
        // Get rejected at SecondApprovalStage
        approval.reject();
        // Get approved at FirstApprovalStage, move to SecondApprovalStage
        approval.approve();
        // Get approved at SecondApprovalStage, move to FinalApprovalStage
        approval.approve();
        // Get rejected at FianlApprovalStage
        approval.reject();
        // Get approved at SecondApprovalStage, move to FinalApprovalStage
        approval.approve();
        // Get approved at FianlApprovalStage
        approval.approve();
        
    }

}
