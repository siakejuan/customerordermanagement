alter table CUSTOMERORDERMANAGEMENT_REQUEST_LINE add constraint FK_CUSTOMERORDERMANAGEMENT_REQUEST_LINE_ON_REQUEST foreign key (REQUEST_ID) references CUSTOMERORDERMANAGEMENT_REQUEST(ID);
create index IDX_CUSTOMERORDERMANAGEMENT_REQUEST_LINE_ON_REQUEST on CUSTOMERORDERMANAGEMENT_REQUEST_LINE (REQUEST_ID);
