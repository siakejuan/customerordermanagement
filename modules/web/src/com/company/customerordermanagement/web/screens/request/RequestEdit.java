package com.company.customerordermanagement.web.screens.request;

import com.haulmont.cuba.gui.screen.*;
import com.company.customerordermanagement.entity.Request;

@UiController("customerordermanagement_Request.edit")
@UiDescriptor("request-edit.xml")
@EditedEntityContainer("requestDc")
@LoadDataBeforeShow
public class RequestEdit extends StandardEditor<Request> {
}