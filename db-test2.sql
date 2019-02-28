
/* Drop Tables */

DROP TABLE USER_INFO CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE USER_INFO
(
	UI_NUM number(10,0),
	UI_NAME varchar2(100) NOT NULL,
	UI_AGE number(3,0) NOT NULL
);

INSERT INTO BOARD (UI_NUM,UI_NAME,UI_AGE)
VALUES(1,'홍길동',20);

