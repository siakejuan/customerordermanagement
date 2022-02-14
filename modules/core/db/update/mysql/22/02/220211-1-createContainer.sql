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
);