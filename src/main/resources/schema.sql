create table role_tbl
(
Role_ID int not null auto_increment primary key,
Role_Name varchar(10) not null
);

create table user_tbl
(
User_ID int not null auto_increment primary key,
User_Name varchar(30) not null,
Password_Hash CHAR(76) not null,
email varchar(30) not null,
Role_ID int not null,
);

create table category_tbl
(
Category_ID int not null auto_increment primary key,
CategoryName varchar(50) not null
);

create table review_tbl
(
Review_ID int not null auto_increment primary key,
Author varchar(50) not null,
article text not null,
rating int not null
);

create table film_tbl
(
Film_ID int not null auto_increment primary key,
Film_Name varchar(50) not null,
Director varchar(50) not null,
Details text not null,
Category_ID int not null,
Review_ID int null
);

create table comment_tbl
(
Comment_ID int not null auto_increment primary key,
User_Comment text,
Review_ID int not null,
User_ID int not null
);

Alter table user_tbl add foreign key (Role_ID) REFERENCES role_tbl (Role_ID);
Alter table film_tbl add FOREIGN key (Category_ID) REFERENCES category_tbl (Category_ID);
ALTER TABLE film_tbl add FOREIGN key (Review_ID) REFERENCES review_tbl (Review_ID);
ALTER table comment_tbl add FOREIGN key (User_ID) REFERENCES user_tbl (User_ID);
ALTER TABLE comment_tbl add FOREIGN KEY (Review_ID) REFERENCES review_tbl (Review_ID);