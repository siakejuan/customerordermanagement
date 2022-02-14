-- begin CUSTOMERORDERMANAGEMENT_CUSTOMER
create table CUSTOMERORDERMANAGEMENT_CUSTOMER (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    BIRTH_DATE date,
    MARITAL_STATUS varchar(50),
    SPOUSE_NAME varchar(255),
    EMAIL varchar(255),
    --
    primary key (ID)
)^
-- end CUSTOMERORDERMANAGEMENT_CUSTOMER
-- begin CUSTOMERORDERMANAGEMENT_ADDRESS
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
)^
-- end CUSTOMERORDERMANAGEMENT_ADDRESS
-- begin CUSTOMERORDERMANAGEMENT_PRODUCT
create table CUSTOMERORDERMANAGEMENT_PRODUCT (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CODE integer,
    --
    primary key (ID)
)^
-- end CUSTOMERORDERMANAGEMENT_PRODUCT
-- begin CUSTOMERORDERMANAGEMENT_LINE_ITEM
create table CUSTOMERORDERMANAGEMENT_LINE_ITEM (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    PRODUCT_ID varchar(32) not null,
    PRICE decimal(19, 2),
    QUANTITY integer,
    ORDER_ID varchar(32) not null,
    --
    primary key (ID)
)^
-- end CUSTOMERORDERMANAGEMENT_LINE_ITEM
-- begin CUSTOMERORDERMANAGEMENT_ORDER
create table CUSTOMERORDERMANAGEMENT_ORDER (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    CUSTOMER_ID varchar(32) not null,
    ORDER_ID bigint,
    ORDER_DATE date not null,
    DELIVERY_DATE date not null,
    --
    primary key (ID)
)^
-- end CUSTOMERORDERMANAGEMENT_ORDER
-- begin CUSTOMERORDERMANAGEMENT_DOCUMENT
create table CUSTOMERORDERMANAGEMENT_DOCUMENT (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    FILE_ID varchar(32),
    NAME varchar(255) not null,
    DOCUMENT_TYPE varchar(50),
    ORDER_ID varchar(32) not null,
    --
    primary key (ID)
)^
-- end CUSTOMERORDERMANAGEMENT_DOCUMENT
-- begin CUSTOMERORDERMANAGEMENT_REQUEST
create table CUSTOMERORDERMANAGEMENT_REQUEST (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    DTYPE varchar(31),
    --
    CUSTOMER varchar(255),
    DATE_ datetime(3),
    LOCATION varchar(255),
    REQUEST_NUMBER varchar(255),
    STATUS varchar(50),
    --
    primary key (ID)
)^
-- end CUSTOMERORDERMANAGEMENT_REQUEST
-- begin CUSTOMERORDERMANAGEMENT_REQUEST_LINE
create table CUSTOMERORDERMANAGEMENT_REQUEST_LINE (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    CONTAINER_NUMBER varchar(255),
    CONTAINER_ID varchar(32),
    PLUG_ON boolean,
    PLUG_OFF boolean,
    REMARKS varchar(255),
    REQUEST_ID varchar(32),
    LOT_NUMBER varchar(255),
    CABLING_ON_VESSEL varchar(255),
    FOUR_CORE varchar(255),
    TEMPERATURE_READING integer,
    TEMPERATURE_START integer,
    --
    primary key (ID)
)^
-- end CUSTOMERORDERMANAGEMENT_REQUEST_LINE
-- begin CUSTOMERORDERMANAGEMENT_CONTAINER
create table CUSTOMERORDERMANAGEMENT_CONTAINER (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    CONTAINER varchar(255),
    CONTAINER_TYPE varchar(50),
    STATUS varchar(255),
    REQUEST_LINE_ID varchar(32),
    --
    primary key (ID)
)^
-- end CUSTOMERORDERMANAGEMENT_CONTAINER
