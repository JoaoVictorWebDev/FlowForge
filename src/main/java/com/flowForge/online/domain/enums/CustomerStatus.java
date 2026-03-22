package com.flowForge.online.domain.enums;

public enum CustomerStatus {


    NEW("NEW"),
    ACTIVE("ACTIVE"),
    UNDER_REVIEW("UNDER REVIEW"),
    BLOCKED("BLOCKED"),
    INACTIVE("INACTIVE"),
    CLOSED("CLOSED"),
    UNKNOWN("UNKNOWN")
    ;


    private final String label;

    private CustomerStatus(String label){
        this.label = label;
    }

    public static CustomerStatus valueOfLabel(String label){
        for(CustomerStatus cs : values()){

            if(java.util.Objects.equals(cs.label, label))

                return cs;
        }
        return CustomerStatus.UNKNOWN;
    }
}
