package com.company.customerordermanagement.web.screens.customer;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.RemoveOperation;
import com.haulmont.cuba.gui.screen.*;
import com.company.customerordermanagement.entity.Customer;

import javax.inject.Inject;


@UiController("customerordermanagement_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
    @Inject
    Notifications notification;

    @Install(to = "customersTable.remove", subject = "actionCancelledHandler")
    private void customersTableRemoveActionCancelledHandler(RemoveOperation.ActionCancelledEvent<Customer> actionCancelledEvent) {
        notification.create().withCaption("cancelled delete user " + actionCancelledEvent.getItems().get(0).getName()).show();
    }
}