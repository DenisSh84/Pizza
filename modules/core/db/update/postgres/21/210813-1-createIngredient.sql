create table PIZZA_INGREDIENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PIZZA_ID uuid not null,
    TOPING_ID uuid,
    AMOUNT decimal(19, 2) not null,
    --
    primary key (ID)
);