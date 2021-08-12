-- begin PIZZA_PIZZA
create table PIZZA_PIZZA (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    SIZE_ varchar(50) not null,
    CALORIES integer,
    PRICE integer not null,
    DESCRIPTION text,
    --
    primary key (ID)
)^
-- end PIZZA_PIZZA
-- begin PIZZA_PAYMENT
create table PIZZA_PAYMENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDER_ID uuid not null,
    PIZZA_ID uuid not null,
    QUANTITY integer not null,
    --
    primary key (ID)
)^
-- end PIZZA_PAYMENT
-- begin PIZZA_INGREDIENT
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
)^
-- end PIZZA_INGREDIENT
-- begin PIZZA_DELIVERY
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
)^
-- end PIZZA_DELIVERY
-- begin PIZZA_TOPPING
create table PIZZA_TOPPING (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(80) not null,
    SPICY boolean,
    INGREDIENT_ID uuid,
    --
    primary key (ID)
)^
-- end PIZZA_TOPPING
-- begin PIZZA_ORDER_ITEM
create table PIZZA_ORDER_ITEM (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end PIZZA_ORDER_ITEM
-- begin PIZZA_ORDER
create table PIZZA_ORDER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_ integer not null,
    DATE_ date not null,
    STATUS varchar(50) not null,
    COST decimal(19, 2) not null,
    ORDER_ITEMS varchar(255),
    DELIVER_ID uuid not null,
    --
    primary key (ID)
)^
-- end PIZZA_ORDER
