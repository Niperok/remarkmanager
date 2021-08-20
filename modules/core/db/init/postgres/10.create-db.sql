-- begin REMARKMANAGER_REMARK
create table REMARKMANAGER_REMARK (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT varchar(255) not null,
    REMARK_TYPE integer not null,
    DESCRIPTION text,
    INITIATOR_ID uuid not null,
    DECISION text,
    DECISION_AUTOR_ID uuid,
    REMARK_DATE timestamp not null,
    DECISION_DATE timestamp,
    --
    primary key (ID)
)^
-- end REMARKMANAGER_REMARK
