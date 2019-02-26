Insert into category_tbl (CategoryName) VALUES ( 'Adventure');
Insert into category_tbl (CategoryName) VALUES ('Romance');
Insert into category_tbl (CategoryName) VALUES ('Drama');
Insert into category_tbl (CategoryName) VALUES ('Action');

Insert into role_tbl (Role_Name) Values ('Admin');
Insert into role_tbl (Role_Name) Values ('Member');

Insert into user_tbl (User_Name, Password_Hash, email, Role_ID)
Values ('Joey', '$2b$12$HmONHfvXynBViyzwxZ8pf.d9zxnJzkmEQK/muoPUldLRsDpT5UGnG', 'joey.abouharb@gmail.com', 1);


 Insert into review_tbl (Author, Article, Rating) VALUES
 ('Joey Abouharb', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur elementum mauris nec purus feugiat rutrum vitae vitae turpis. Donec non elit urna. Nam dignissim dui aliquam ex fringilla, ac vehicula dolor lobortis. Nunc consectetur, tortor ut rutrum faucibus,
  lorem sapien cursus erat, id tincidunt mauris nibh at augue.
   Vivamus laoreet ipsum libero, at vulputate neque viverra nec.
   Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur elementum mauris nec purus feugiat rutrum vitae vitae turpis. Donec non elit urna. Nam dignissim dui aliquam ex fringilla, ac vehicula dolor lobortis. Nunc consectetur, tortor ut rutrum faucibus,
  lorem sapien cursus erat, id tincidunt mauris nibh at augue.
   Vivamus laoreet ipsum libero, at vulputate neque viverra nec.', 5);

Insert into film_tbl (Film_Name, Director, Details, Category_ID, Review_ID)
Values
('Bird Man',
 'Alejandro G. Inarritu','gfdgfgd' , 3, 1);
