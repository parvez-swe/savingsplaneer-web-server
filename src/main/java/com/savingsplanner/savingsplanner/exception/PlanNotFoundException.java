package com.savingsplanner.savingsplanner.exception;

public class PlanNotFoundException extends RuntimeException {

    public PlanNotFoundException(Long id){
        super("Could not found the plan with the id "+ id) ;
    }
}
