create table PIZZA_DELIVERY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COURIER_ID uuid not null,
    CLIENT_NAME varchar(100) not null,
    PHONE_NUMBER varchar(30) not null,
    EMAIL varchar(255) not null,
    ADDRES varchar(255) not null,
    COMMENT_ text,
    --
    primary key (ID)
);