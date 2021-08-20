-- begin REMARKMANAGER_REMARK
alter table REMARKMANAGER_REMARK add constraint FK_REMARKMANAGER_REMARK_ON_INITIATOR foreign key (INITIATOR_ID) references SEC_USER(ID)^
alter table REMARKMANAGER_REMARK add constraint FK_REMARKMANAGER_REMARK_ON_DECISION_AUTOR foreign key (DECISION_AUTOR_ID) references SEC_USER(ID)^
create index IDX_REMARKMANAGER_REMARK_ON_INITIATOR on REMARKMANAGER_REMARK (INITIATOR_ID)^
create index IDX_REMARKMANAGER_REMARK_ON_DECISION_AUTOR on REMARKMANAGER_REMARK (DECISION_AUTOR_ID)^
-- end REMARKMANAGER_REMARK
