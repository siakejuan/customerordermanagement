package com.company.customerordermanagement.web.screens.requestcontainerstorage;

import com.haulmont.cuba.gui.screen.*;
import com.company.customerordermanagement.entity.RequestContainerStorage;

@UiController("customerordermanagement_RequestContainerStorage.edit")
@UiDescriptor("request-container-storage-edit.xml")
@EditedEntityContainer("requestContainerStorageDc")
@LoadDataBeforeShow
public class RequestContainerStorageEdit extends StandardEditor<RequestContainerStorage> {
}