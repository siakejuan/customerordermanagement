package com.company.customerordermanagement.web.screens.requestline;

import com.company.customerordermanagement.entity.ContainerType;
import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.OptionsGroup;
import com.haulmont.cuba.gui.screen.*;
import com.company.customerordermanagement.entity.RequestLine;
import groovyjarjarcommonscli.OptionGroup;

import javax.inject.Inject;

@UiController("customerordermanagement_RequestLine.edit")
@UiDescriptor("request-line-edit.xml")
@EditedEntityContainer("requestLineDc")
@LoadDataBeforeShow
public class RequestLineEdit extends StandardEditor<RequestLine> {

    @Inject
    private OptionsGroup containerType;
    @Inject
    private CheckBox plugOffField;
    @Inject
    private CheckBox plugOnField;

    @Subscribe("plugOnField")
    public void plugOnFieldChangeEvent(HasValue.ValueChangeEvent<Boolean> event) {
        if (event.getValue() == Boolean.TRUE) {
            containerType.setVisible(true);
            plugOffField.setEnabled(false);
        } else {
            containerType.setVisible(false);
            plugOffField.setEnabled(true);
        }
    }

    @Subscribe("plugOffField")
    public void plugOffFieldChangeEvent(HasValue.ValueChangeEvent<Boolean> event) {
        if (event.getValue() == Boolean.TRUE) {
            plugOnField.setEnabled(false);
        } else {
            plugOnField.setEnabled(true);
        }
    }


}