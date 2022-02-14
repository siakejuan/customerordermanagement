package com.company.customerordermanagement.web.screens.request;

import com.haulmont.cuba.gui.screen.*;
import com.company.customerordermanagement.entity.Request;

@UiController("customerordermanagement_Request.browse")
@UiDescriptor("request-browse.xml")
@LookupComponent("requestsTable")
@LoadDataBeforeShow
public class RequestBrowse extends StandardLookup<Request> {
}