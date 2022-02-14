update CUSTOMERORDERMANAGEMENT_PRODUCT set NAME = '' where NAME is null ;
alter table CUSTOMERORDERMANAGEMENT_PRODUCT modify column NAME varchar(255) not null ;
