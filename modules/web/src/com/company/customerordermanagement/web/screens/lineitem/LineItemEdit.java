package com.company.customerordermanagement.web.screens.lineitem;

import com.haulmont.cuba.gui.screen.*;
import com.company.customerordermanagement.entity.LineItem;

@UiController("customerordermanagement_LineItem.edit")
@UiDescriptor("line-item-edit.xml")
@EditedEntityContainer("lineItemDc")
@LoadDataBeforeShow
public class LineItemEdit extends StandardEditor<LineItem> {


}