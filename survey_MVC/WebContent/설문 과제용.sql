drop table "SURVEY_MAIN";
select max(NUM) from "SURVEY_ENV";
delete from "SURVEY_ENV";
delete from "SURVEY_MAIN";
drop sequence "ENV_SEQ";
select * from "SURVEY_ENV" where "GENDER"=0;
select * from "SURVEY_MAIN" where "NUM"=1 or "NUM"=3;

create table "SURVEY_ENV" (
    "NUM" number primary key,  
    "GENDER" number not null,   -- 0:남자, 1:여자
    "AGE" number not null,      
    "HOUSE" number not null,    -- 7~1 자가, 전세, 월세, 기타
    "SCHOOL" number not null,   -- 1:대줄, 2:고졸, 3:중졸, 4:초졸, 5:기타
    "MARRY" number not null     -- 0:미혼, 1:기혼
    );
    
create sequence "ENV_SEQ"
start with 1
increment by 1
maxvalue 99999
nocache
noorder
nocycle;
    
create table "SURVEY_MAIN" (
    "NUM" number primary key,
    "S1" number not null,
    "S2" number not null,
    "S3" number not null,
    "S4" number not null,
    "S5" number not null,
    "S6" number not null,
    "S7" number not null,
    "S8" number not null,
    "S9" number not null,
    "S10" number not null
);
