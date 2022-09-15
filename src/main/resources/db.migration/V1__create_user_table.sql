CREATE TABLE user (
 id bigint(20) NOT NULL AUTO_INCREMENT,
 name varchar(100) NOT NULL,
 identifier varchar(14) NOT NULL,
 identifier_type varchar(255) NOT NULL,
PRIMARY KEY (id)
);