create user AZ_MANAGER IDENTIFIED by 123400;

create table AZ_MANAGER.MEMBER
(
    ID varchar2(20) primary key,
    PW varchar2(30) not null,
    address varchar(50)
);

create table AZ_MANAGER.ITEMS
(
    iCode varchar2(6) primary key,
    name varchar2(15) not null,
    price number not null check(price >= 0)
);

create table AZ_MANAGER.ORDERS
(
    orderDate Date,
    ID varchar2(20),
    iCode varchar2(6),
    constraint fk_ID foreign key(ID) references AZ_MANAGER.MEMBER(ID) on delete cascade,
    constraint fk_ICODE foreign key(iCode) references AZ_MANAGER.ITEMS(iCode) on delete cascade
);
commit;