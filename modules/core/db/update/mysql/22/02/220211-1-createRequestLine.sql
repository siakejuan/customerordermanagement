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
    PLUG_ON boolean,
    PLUG_OFF boolean,
    REMARKS varchar(255),
    REQUEST_ID varchar(32),
    --
    primary key (ID)
);