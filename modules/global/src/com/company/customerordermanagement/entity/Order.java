package com.company.customerordermanagement.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.*;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@PublishEntityChangedEvents
@Table(name = "CUSTOMERORDERMANAGEMENT_ORDER")
@Entity(name = "customerordermanagement_Order")
@Listeners("customerordermanagement_OrderIdCreator")
@NamePattern("%s %s|orderId,lineItems")
public class Order extends StandardEntity {
    private static final long serialVersionUID = 374883523442179954L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUSTOMER_ID")
    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    private Customer customer;

    @Column(name = "ORDER_ID")
    private Long orderId;

    @Column(name = "ORDER_DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date orderDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "DELIVERY_DATE", nullable = false)
    @NotNull
    private Date deliveryDate;

    @OneToMany(mappedBy = "order")
    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    private List<LineItem> lineItems;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "order")
    private List<Document> documents;

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}