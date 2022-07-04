CREATE TABLE test_table (
    id int auto_increment,
    name varchar(255),
    primary key (id)
);


INSERT INTO test_table(name)
values ('name_1'),
       ('name_2'),
       ('name_3'),
       ('name_4');
