alter table CUSTOMERORDERMANAGEMENT_LINE_ITEM add constraint FK_CUSTOMERORDERMANAGEMENT_LINE_ITEM_ON_PRODUCT foreign key (PRODUCT_ID) references CUSTOMERORDERMANAGEMENT_PRODUCT(ID);
alter table CUSTOMERORDERMANAGEMENT_LINE_ITEM add constraint FK_CUSTOMERORDERMANAGEMENT_LINE_ITEM_ON_ORDER foreign key (ORDER_ID) references CUSTOMERORDERMANAGEMENT_ORDER(ID);
create index IDX_CUSTOMERORDERMANAGEMENT_LINE_ITEM_ON_PRODUCT on CUSTOMERORDERMANAGEMENT_LINE_ITEM (PRODUCT_ID);
create index IDX_CUSTOMERORDERMANAGEMENT_LINE_ITEM_ON_ORDER on CUSTOMERORDERMANAGEMENT_LINE_ITEM (ORDER_ID);
