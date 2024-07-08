CREATE SEQUENCE member_seq
    START WITH 1
    INCREMENT BY 1
    NOCACHE;

CREATE TABLE MEMBER(
    MEMBERNO NUMBER(4),
    ID       VARCHAR2(10),
    NAME     VARCHAR2(20)
    );
    
INSERT INTO MEMBER VALUES(member_seq.NEXTVAL, 'tjoeun', '더조은');
INSERT INTO MEMBER VALUES(member_seq.NEXTVAL, 'academy', '학원');
INSERT INTO MEMBER VALUES(member_seq.NEXTVAL, 'lee', '이순신');
INSERT INTO MEMBER VALUES(member_seq.NEXTVAL, 'kim', '김유신');
INSERT INTO MEMBER VALUES(member_seq.NEXTVAL, 'yoo', '유관순');

SELECT * FROM MEMBER;

commit;