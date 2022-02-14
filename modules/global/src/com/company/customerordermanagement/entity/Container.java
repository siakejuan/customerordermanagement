package com.company.customerordermanagement.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "CUSTOMERORDERMANAGEMENT_CONTAINER")
@Entity(name = "customerordermanagement_Container")
@NamePattern("%s|containerNumber")
public class Container extends StandardEntity {
    private static final long serialVersionUID = -3841772968384188006L;

    @Column(name = "CONTAINER")
    private String containerNumber;

    @Column(name = "CONTAINER_TYPE")
    private String containerType;

    @Column(name = "STATUS")
    private String status;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REQUEST_LINE_ID")
    private RequestLine requestLine;

    public RequestLine getRequestLine() {
        return requestLine;
    }

    public void setRequestLine(RequestLine requestLine) {
        this.requestLine = requestLine;
    }

    public void setContainerType(ContainerType containerType) {
        this.containerType = containerType == null ? null : containerType.getId();
    }

    public ContainerType getContainerType() {
        return containerType == null ? null : ContainerType.fromId(containerType);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContainerNumber() {
        return containerNumber;
    }

    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }
}