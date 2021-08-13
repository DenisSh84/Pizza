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
    DELIVER_ENTITY_ID uuid,
    DELIVER_STRING_ENTITY_ID varchar(255),
    DELIVER_INT_ENTITY_ID integer,
    DELIVER_LONG_ENTITY_ID bigint,
    --
    NUMBER_ integer not null,
    DATE_ date not null,
    STATUS varchar(50) not null,
    COST decimal(19, 2) not null,
    --
    primary key (ID)
);