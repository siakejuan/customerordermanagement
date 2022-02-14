-- begin CUSTOMERORDERMANAGEMENT_ADDRESS
alter table CUSTOMERORDERMANAGEMENT_ADDRESS add constraint FK_CUSTOMERORDERMANAGEMENT_ADDRESS_ON_CUSTOMER foreign key (CUSTOMER_ID) references CUSTOMERORDERMANAGEMENT_CUSTOMER(ID)^
create index IDX_CUSTOMERORDERMANAGEMENT_ADDRESS_ON_CUSTOMER on CUSTOMERORDERMANAGEMENT_ADDRESS (CUSTOMER_ID)^
-- end CUSTOMERORDERMANAGEMENT_ADDRESS
-- begin CUSTOMERORDERMANAGEMENT_LINE_ITEM
alter table CUSTOMERORDERMANAGEMENT_LINE_ITEM add constraint FK_CUSTOMERORDERMANAGEMENT_LINE_ITEM_ON_PRODUCT foreign key (PRODUCT_ID) references CUSTOMERORDERMANAGEMENT_PRODUCT(ID)^
alter table CUSTOMERORDERMANAGEMENT_LINE_ITEM add constraint FK_CUSTOMERORDERMANAGEMENT_LINE_ITEM_ON_ORDER foreign key (ORDER_ID) references CUSTOMERORDERMANAGEMENT_ORDER(ID)^
create index IDX_CUSTOMERORDERMANAGEMENT_LINE_ITEM_ON_PRODUCT on CUSTOMERORDERMANAGEMENT_LINE_ITEM (PRODUCT_ID)^
create index IDX_CUSTOMERORDERMANAGEMENT_LINE_ITEM_ON_ORDER on CUSTOMERORDERMANAGEMENT_LINE_ITEM (ORDER_ID)^
-- end CUSTOMERORDERMANAGEMENT_LINE_ITEM
-- begin CUSTOMERORDERMANAGEMENT_ORDER
alter table CUSTOMERORDERMANAGEMENT_ORDER add constraint FK_CUSTOMERORDERMANAGEMENT_ORDER_ON_CUSTOMER foreign key (CUSTOMER_ID) references CUSTOMERORDERMANAGEMENT_CUSTOMER(ID)^
create index IDX_CUSTOMERORDERMANAGEMENT_ORDER_ON_CUSTOMER on CUSTOMERORDERMANAGEMENT_ORDER (CUSTOMER_ID)^
-- end CUSTOMERORDERMANAGEMENT_ORDER
-- begin CUSTOMERORDERMANAGEMENT_DOCUMENT
alter table CUSTOMERORDERMANAGEMENT_DOCUMENT add constraint FK_CUSTOMERORDERMANAGEMENT_DOCUMENT_ON_FILE foreign key (FILE_ID) references SYS_FILE(ID)^
alter table CUSTOMERORDERMANAGEMENT_DOCUMENT add constraint FK_CUSTOMERORDERMANAGEMENT_DOCUMENT_ON_ORDER foreign key (ORDER_ID) references CUSTOMERORDERMANAGEMENT_ORDER(ID)^
create index IDX_CUSTOMERORDERMANAGEMENT_DOCUMENT_ON_FILE on CUSTOMERORDERMANAGEMENT_DOCUMENT (FILE_ID)^
create index IDX_CUSTOMERORDERMANAGEMENT_DOCUMENT_ON_ORDER on CUSTOMERORDERMANAGEMENT_DOCUMENT (ORDER_ID)^
-- end CUSTOMERORDERMANAGEMENT_DOCUMENT
-- begin CUSTOMERORDERMANAGEMENT_REQUEST_LINE
alter table CUSTOMERORDERMANAGEMENT_REQUEST_LINE add constraint FK_CUSTOMERORDERMANAGEMENT_REQUEST_LINE_ON_CONTAINER foreign key (CONTAINER_ID) references CUSTOMERORDERMANAGEMENT_CONTAINER(ID)^
alter table CUSTOMERORDERMANAGEMENT_REQUEST_LINE add constraint FK_CUSTOMERORDERMANAGEMENT_REQUEST_LINE_ON_REQUEST foreign key (REQUEST_ID) references CUSTOMERORDERMANAGEMENT_REQUEST(ID)^
create index IDX_CUSTOMERORDERMANAGEMENT_REQUEST_LINE_ON_CONTAINER on CUSTOMERORDERMANAGEMENT_REQUEST_LINE (CONTAINER_ID)^
create index IDX_CUSTOMERORDERMANAGEMENT_REQUEST_LINE_ON_REQUEST on CUSTOMERORDERMANAGEMENT_REQUEST_LINE (REQUEST_ID)^
-- end CUSTOMERORDERMANAGEMENT_REQUEST_LINE
-- begin CUSTOMERORDERMANAGEMENT_CONTAINER
alter table CUSTOMERORDERMANAGEMENT_CONTAINER add constraint FK_CUSTOMERORDERMANAGEMENT_CONTAINER_ON_REQUEST_LINE foreign key (REQUEST_LINE_ID) references CUSTOMERORDERMANAGEMENT_REQUEST_LINE(ID)^
create index IDX_CUSTOMERORDERMANAGEMENT_CONTAINER_ON_REQUEST_LINE on CUSTOMERORDERMANAGEMENT_CONTAINER (REQUEST_LINE_ID)^
-- end CUSTOMERORDERMANAGEMENT_CONTAINER
