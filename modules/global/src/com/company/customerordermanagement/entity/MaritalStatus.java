package com.company.customerordermanagement.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum MaritalStatus implements EnumClass<String> {

    MARRIED("MARRIED"),
    SINGLE("SINGLE"),
    DIVORCED("DIVORCED");

    private String id;

    MaritalStatus(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static MaritalStatus fromId(String id) {
        for (MaritalStatus at : MaritalStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}