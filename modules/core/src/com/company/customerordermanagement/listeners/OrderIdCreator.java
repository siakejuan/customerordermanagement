package com.company.customerordermanagement.listeners;

import com.company.customerordermanagement.entity.Order;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.app.UniqueNumbersAPI;
import com.haulmont.cuba.core.global.Messages;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;

@Component("customerordermanagement_OrderIdCreator")
public class OrderIdCreator implements BeforeInsertEntityListener<Order> {


    @Inject
    private UniqueNumbersAPI uniqueNumbersAPI;

    @Override
    public void onBeforeInsert(Order entity, EntityManager entityManager) {
        entity.setOrderId(uniqueNumbersAPI.getNextNumber("orderId"));
    }
}