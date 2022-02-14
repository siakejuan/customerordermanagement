package com.company.customerordermanagement.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Table(name = "CUSTOMERORDERMANAGEMENT_REQUEST")
@Entity(name = "customerordermanagement_Request")
public class Request extends StandardEntity {
    private static final long serialVersionUID = -2734069336312992496L;

    @JoinColumn(name = "CUSTOMER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull
    private Customer customer;

    @Column(name = "DATE_")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "REQUEST_NUMBER")
    private String ticketNumber;

    @Column(name = "STATUS")
    private String status;

    @OneToMany(mappedBy = "request")
    private List<RequestLine> requestLine;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<RequestLine> getRequestLine() {
        return requestLine;
    }

    public void setRequestLine(List<RequestLine> requestLine) {
        this.requestLine = requestLine;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public RequestStatus getStatus() {
        return status == null ? null : RequestStatus.fromId(status);
    }

    public void setStatus(RequestStatus status) {
        this.status = status == null ? null : status.getId();
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}