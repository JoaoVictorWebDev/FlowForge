package com.flowforge.online.domain.enums;

import jakarta.persistence.Column;

public enum AccountStatus {
    PENDING("Pending"),
    ACTIVE("Active"),
    BLOCKED("Blocked"),
    SUSPENDED("Suspended"),
    CLOSED("Closed"),
    UNKNOWN("UNKNOWN");

    private String label;

    private AccountStatus(String label){
        this.label = label;
    }


    private static AccountStatus valueOfLabel(String label ){
        for(AccountStatus as : values()){

            if(java.util.Objects.equals(as.label, label)){
                return as;
            }

        }
        return AccountStatus.UNKNOWN;
    }
}
