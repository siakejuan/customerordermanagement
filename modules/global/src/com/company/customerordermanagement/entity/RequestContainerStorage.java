package com.company.customerordermanagement.entity;

import javax.persistence.Entity;

@javax.persistence.DiscriminatorValue("S")
@Entity(name = "customerordermanagement_RequestContainerStorage")
public class RequestContainerStorage extends Request {
    private static final long serialVersionUID = -7541616389819796206L;
}