alter session set nls_date_format = 'dd.mm.yyyy hh24:mi:ss';

drop table platos cascade constraints;
drop table composicion cascade constraints;

create table platos (codpp varchar2(3), nomp varchar2(15), primary key (codpp));
insert into platos values('p1','platocarnico1');
insert into platos values('p2','platocarnico2');

create table composicion(codp varchar2(3),nomc varchar2(7),graxa integer, primary key (codp,nomc));
insert into composicion values ('p1','vacuno',5);
insert into composicion values ('p1','ovino',10);
insert into composicion values ('p2','ovino',8);
insert into composicion values ('p2','avicola',10);
insert into composicion values ('p2','vacuno',5);
insert into composicion values ('p3','vacuno',10);
insert into composicion values ('p3','ovino',15);
insert into composicion values ('p4','vacuno',5);
insert into composicion values ('p4','avicola',10);


commit;
select * from platos;

select * from composicion;



