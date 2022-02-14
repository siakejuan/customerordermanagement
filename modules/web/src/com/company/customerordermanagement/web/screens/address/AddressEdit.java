package com.company.customerordermanagement.web.screens.address;

import com.haulmont.cuba.gui.screen.*;
import com.company.customerordermanagement.entity.Address;

@UiController("customerordermanagement_Address.edit")
@UiDescriptor("address-edit.xml")
@EditedEntityContainer("addressDc")
@LoadDataBeforeShow
public class AddressEdit extends StandardEditor<Address> {
}