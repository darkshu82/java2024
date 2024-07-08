CREATE SEQUENCE member_seq
    START WITH 1
    INCREMENT BY 1
    NOCACHE;

CREATE TABLE MEMBER(
    MEMBERNO NUMBER(4),
    ID       VARCHAR2(10),
    NAME     VARCHAR2(20)
    );
    
INSERT INTO MEMBER VALUES(member_seq.NEXTVAL, 'tjoeun', '������');
INSERT INTO MEMBER VALUES(member_seq.NEXTVAL, 'academy', '�п�');
INSERT INTO MEMBER VALUES(member_seq.NEXTVAL, 'lee', '�̼���');
INSERT INTO MEMBER VALUES(member_seq.NEXTVAL, 'kim', '������');
INSERT INTO MEMBER VALUES(member_seq.NEXTVAL, 'yoo', '������');

SELECT * FROM MEMBER;

commit;