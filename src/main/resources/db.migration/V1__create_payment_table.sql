CREATE TABLE payment (
 id bigint(20) NOT NULL AUTO_INCREMENT,
 payment_value decimal(19,2) NOT NULL,
 user_name varchar(100) DEFAULT NULL,
 card_number varchar(19) DEFAULT NULL,
 expiration_date varchar(7) DEFAULT NULL,
 security_code varchar(3) DEFAULT NULL,
 status varchar(255) NOT NULL,
 order_id bigint(20) NOT NULL,
 payment_method_id bigint(20) NOT NULL,
PRIMARY KEY (id)
);