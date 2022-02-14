create table CUSTOMERORDERMANAGEMENT_ADDRESS (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    STREET_NAME varchar(255),
    CITY varchar(255),
    STATE varchar(255),
    POSTCODE varchar(255),
    COUNTRY varchar(255),
    CUSTOMER_ID varchar(32) not null,
    --
    primary key (ID)
);