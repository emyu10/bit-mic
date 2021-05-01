create table user (
    id int not null auto_increment primary key,
    username varchar(20) not null unique,
    fullname varchar(255) not null,
    password varchar(32) not null default '81dc9bdb52d04dc20036dbd8313ed055',
    active int(1) not null default 1,
    admin int(1) not null default 0,
    addedon timestamp default current_timestamp
);