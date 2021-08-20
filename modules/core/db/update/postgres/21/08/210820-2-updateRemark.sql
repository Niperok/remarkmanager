update REMARKMANAGER_REMARK set REMARK_DATE = current_timestamp where REMARK_DATE is null ;
alter table REMARKMANAGER_REMARK alter column REMARK_DATE set not null ;
