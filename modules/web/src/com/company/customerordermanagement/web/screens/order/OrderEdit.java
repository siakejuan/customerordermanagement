package com.company.customerordermanagement.web.screens.order;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.screen.*;
import com.company.customerordermanagement.entity.Order;

import javax.inject.Inject;

@UiController("customerordermanagement_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {

    @Inject
    private DataContext dataContext;

    @Inject
    private ScreenValidation screenValidation;
    @Inject
    private Notifications notifications;

    @Subscribe(target = Target.DATA_CONTEXT)
    protected void onPreCommit(DataContext.PreCommitEvent event) {
        if (getEditedEntity().getDeliveryDate().before(getEditedEntity().getOrderDate())) {
            throw new RuntimeException("check your date..");
        }
    }

}