package com.company.customerordermanagement.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.customerordermanagement.entity.Product;

@UiController("customerordermanagement_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
@LoadDataBeforeShow
public class ProductBrowse extends StandardLookup<Product> {
}