Insert into category_tbl (category_name) VALUES ( 'Adventure');
Insert into category_tbl (category_name) VALUES ('Romance');
Insert into category_tbl (category_name) VALUES ('Drama');
Insert into category_tbl (category_name) VALUES ('Action');
Insert into category_tbl (category_name) VALUES ('Horror');
Insert into role_tbl (role_name) Values ('Admin');
Insert into role_tbl (role_name) Values ('Member');

Insert into user_tbl (user_name, password_hash, email, role_Id)
Values ('Joey', '$2b$12$HmONHfvXynBViyzwxZ8pf.d9zxnJzkmEQK/muoPUldLRsDpT5UGnG', 'joey.abouharb@gmail.com', 1);


 Insert into review_tbl (author, article, rating, review_date) VALUES
 ('Joey Abouharb', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur elementum mauris nec purus feugiat rutrum vitae vitae turpis. Donec non elit urna. Nam dignissim dui aliquam ex fringilla, ac vehicula dolor lobortis. Nunc consectetur, tortor ut rutrum faucibus,
  lorem sapien cursus erat, id tincidunt mauris nibh at augue.
   Vivamus laoreet ipsum libero, at vulputate neque viverra nec.
   Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur elementum mauris nec purus feugiat rutrum vitae vitae turpis. Donec non elit urna. Nam dignissim dui aliquam ex fringilla, ac vehicula dolor lobortis. Nunc consectetur, tortor ut rutrum faucibus,
  lorem sapien cursus erat, id tincidunt mauris nibh at augue.
   Vivamus laoreet ipsum libero, at vulputate neque viverra nec.', 5, '2018-01-01');

   Insert into review_tbl (author, article, rating, review_date) VALUES
 ('Joey Abouharb', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur elementum mauris nec purus feugiat rutrum vitae vitae turpis. Donec non elit urna. Nam dignissim dui aliquam ex fringilla, ac vehicula dolor lobortis. Nunc consectetur, tortor ut rutrum faucibus,
  lorem sapien cursus erat, id tincidunt mauris nibh at augue.
   Vivamus laoreet ipsum libero, at vulputate neque viverra nec.
   Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur elementum mauris nec purus feugiat rutrum vitae vitae turpis. Donec non elit urna. Nam dignissim dui aliquam ex fringilla, ac vehicula dolor lobortis. Nunc consectetur, tortor ut rutrum faucibus,
  lorem sapien cursus erat, id tincidunt mauris nibh at augue.
   Vivamus laoreet ipsum libero, at vulputate neque viverra nec.', 5, '2018-01-02');

Insert into film_tbl (film_name, director, details, release_date, category_Id, review_Id)
Values
('Bird Man',
 'Alejandro G. Inarritu','gfdgfgd' , '2014-10-17', 3, 1);

Insert into film_tbl (film_name, director, details, release_date, category_Id, Review_Id)
Values
('Get Out',
 'Jordan Peele','Now that Chris (Daniel Kaluuya) and his girlfriend, Rose (Allison Williams), have reached the meet-the-parents milestone of dating, she invites him for a weekend getaway upstate with Missy and Dean. At first, Chris reads the familys overly accommodating behavior as nervous attempts to deal with their daughter''s interracial relationship, but as the weekend progresse''s, a series of increasingly disturbing discoveries lead him to a truth that he never could have imagined.'  , '2014-02-24', 5, 2);
