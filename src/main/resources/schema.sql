CREATE TABLE news(
id int primary key auto_increment,
imgUrl varchar(40),
title varchar(30),
addTime varchar(30),
click int,
content text
);
create table newsComments(
  id       int primary key auto_increment,
  newsId   int,
  userName varchar(30),
  cTime    varchar(30),
  content  varchar(150)
);
create table photos(
  id        int primary key auto_increment,
  category  int,
  imgUrl    varchar(400),
  title     varchar(30),
  content   varchar(200),
  cTime     varchar(30),
  click     int
);
create table goods(
 id          int primary key auto_increment,
 imgs        varchar(200),
 title       varchar(60),
 marketPrice double,
 sellPrice   double,
 stock       int,
 goodsNo     int,
 addTime     varchar(30),
 desc        varchar(150)
);