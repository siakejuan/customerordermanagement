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
);