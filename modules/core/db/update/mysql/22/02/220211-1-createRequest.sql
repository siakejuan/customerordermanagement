create table CUSTOMERORDERMANAGEMENT_REQUEST (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    CUSTOMER varchar(255) not null,
    DATE_ date,
    TIME_ time(3),
    LOCATION varchar(255),
    REQUEST_NUMBER varchar(255),
    STATUS varchar(50),
    --
    primary key (ID)
);