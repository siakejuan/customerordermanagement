package com.company.customerordermanagement.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "CUSTOMERORDERMANAGEMENT_DOCUMENT")
@Entity(name = "customerordermanagement_Document")
@NamePattern("%s|name")
public class Document extends StandardEntity {
    private static final long serialVersionUID = -3771765964934551521L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FILE_ID")
    private FileDescriptor file;

    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "DOCUMENT_TYPE")
    private String documentType;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ORDER_ID")
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public DocumentType getDocumentType() {
        return documentType == null ? null : DocumentType.fromId(documentType);
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType == null ? null : documentType.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FileDescriptor getFile() {
        return file;
    }

    public void setFile(FileDescriptor file) {
        this.file = file;
    }
}