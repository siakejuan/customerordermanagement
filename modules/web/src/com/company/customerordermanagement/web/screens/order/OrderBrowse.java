package com.company.customerordermanagement.web.screens.order;

import com.haulmont.cuba.core.global.Messages;
import com.haulmont.cuba.gui.screen.*;
import com.company.customerordermanagement.entity.Order;

import javax.inject.Inject;

@UiController("customerordermanagement_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {

}