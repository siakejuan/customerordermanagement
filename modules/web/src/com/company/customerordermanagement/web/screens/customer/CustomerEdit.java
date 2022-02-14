package com.company.customerordermanagement.web.screens.customer;

import com.company.customerordermanagement.entity.MaritalStatus;
import com.company.customerordermanagement.entity.Order;
import com.company.customerordermanagement.web.screens.order.OrderEdit;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.WindowManager.OpenType;
import com.haulmont.cuba.gui.actions.list.ViewAction;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.actions.CreateAction;
import com.haulmont.cuba.gui.components.actions.EditAction;
import com.haulmont.cuba.gui.screen.*;
import com.company.customerordermanagement.entity.Customer;
import org.apache.poi.ss.formula.functions.Even;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.*;

@UiController("customerordermanagement_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {

//    @Named("ordersTable.edit")
//    public EditAction orderTableCreate;
//
//    @Subscribe
//    public void onInit(InitEvent event) {
//        orderTableCreate.setOpenType(OpenType.DIALOG);
//        orderTableCreate.setScreenClass(OrderEdit.class);
//    }

    @Inject
    private OptionsGroup<Integer, Integer> numberOfChildrenField;

    @Inject
    private ScreenBuilders screenBuilders;
    @Inject
    private Table<Order> ordersTable;

    @Inject
    private TextField<String> spouseName;

    @Subscribe("ordersTable.create")
    public void onOrdersTableCreate(Action.ActionPerformedEvent event) {
        screenBuilders.editor(ordersTable)
                .withOpenMode(OpenMode.DIALOG)
                .newEntity()
                .withScreenClass(OrderEdit.class)
                .build()
                .show();
    }

    @Subscribe("ordersTable.edit")
    public void onOrdersTableEdit(Action.ActionPerformedEvent event) {
        screenBuilders.editor(ordersTable)
                .withOpenMode(OpenMode.DIALOG)
                .withScreenClass(OrderEdit.class)
                .build()
                .show();
    }

    @Subscribe
    protected void onInit(InitEvent event) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        numberOfChildrenField.setOptionsList(list);
    }

    @Subscribe("maritalStatusField")
    public void onChangeEvent1(HasValue.ValueChangeEvent event) {
        if (event.getValue() == MaritalStatus.fromId("MARRIED")) {
            spouseName.setVisible(true);
        }
        else {
            spouseName.setVisible(false);
        }
    }
    
}