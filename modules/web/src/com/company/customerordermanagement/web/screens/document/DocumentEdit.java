package com.company.customerordermanagement.web.screens.document;

import com.haulmont.cuba.gui.screen.*;
import com.company.customerordermanagement.entity.Document;

@UiController("customerordermanagement_Document.edit")
@UiDescriptor("document-edit.xml")
@EditedEntityContainer("documentDc")
@LoadDataBeforeShow
public class DocumentEdit extends StandardEditor<Document> {
}