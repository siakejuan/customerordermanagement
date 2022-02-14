package com.company.customerordermanagement.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum RequestStatus implements EnumClass<String> {

    SUBMITTED("SUBMITTED"),
    IN_PROGRESS("IN PROGRESS"),
    COMPLETE("COMPLETE"),
    PENDING_ENDORSEMENT("PENDING ENDORSEMENT "),
    SENT("SENT");

    private String id;

    RequestStatus(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static RequestStatus fromId(String id) {
        for (RequestStatus at : RequestStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}