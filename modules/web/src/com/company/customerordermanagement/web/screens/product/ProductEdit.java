package com.company.customerordermanagement.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.customerordermanagement.entity.Product;

@UiController("customerordermanagement_Product.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
@LoadDataBeforeShow
public class ProductEdit extends StandardEditor<Product> {
}