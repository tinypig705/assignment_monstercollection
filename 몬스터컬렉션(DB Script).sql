CREATE TABLE MC_MONSTER (
MONSTER_CODE NUMBER CONSTRAINT PK_MST_CODE PRIMARY KEY,
MONSTER_NAME VARCHAR2(20) CONSTRAINT UN_MST_NAME UNIQUE,
MONSTER_TYPE VARCHAR2(20),
CATEGORY_CODE NUMBER NOT NULL,
CONSTRAINT FK_CATEGORY_CODE FOREIGN KEY (CATEGORY_CODE) REFERENCES MC_CATEGORY(CATEGORY_CODE) ON DELETE SET NULL,
MONSTER_FEATURE VARCHAR2(60)
);

CREATE TABLE MC_CATEGORY (
CATEGORY_CODE NUMBER CONSTRAINT PK_CATEGORY_NO PRIMARY KEY,
CATEGORY_NAME VARCHAR2(20) CONSTRAINT UN_NAME_NAME UNIQUE
);

CREATE SEQUENCE SEQ_MONSTER_NO
START WITH 1
INCREMENT BY 1
MAXVALUE 99999
NOCYCLE
NOCACHE;

INSERT
  INTO MC_CATEGORY
     (
        CATEGORY_CODE
       ,CATEGORY_NAME
       )
       VALUES
       (
       
       '1'
     , '���ϸ�'
     );
     
INSERT
  INTO MC_CATEGORY
     (
        CATEGORY_CODE
       ,CATEGORY_NAME
       
       )
       VALUES
       (
    
       '2'
     , '������'
     );    
     
INSERT
  INTO MC_CATEGORY
    (
       CATEGORY_CODE
      ,CATEGORY_NAME
      )
      VALUES
      (
       '3'
     , '�����ý��丮'
      );
INSERT
  INTO MC_CATEGORY
    (
       CATEGORY_CODE
      ,CATEGORY_NAME
      )
      VALUES
      (
       '4'
     , '��Ÿ'
       );
       
INSERT
  INTO MC_MONSTER
       ( 
          MONSTER_CODE
        , MONSTER_NAME
        , MONSTER_TYPE
        , CATEGORY_CODE
        , MONSTER_FEATURE
        )
        VALUES
        (
          SEQ_MONSTER_CODE.NEXTVAL
         ,'��ī��' 
         ,'����Ӽ�'
         ,'1'
         ,'�Ϳ���'
         );

INSERT
  INTO MC_MONSTER
       ( 
          MONSTER_CODE
        , MONSTER_NAME
        , MONSTER_TYPE
        , CATEGORY_CODE
        , MONSTER_FEATURE
        )
        VALUES
        (
          SEQ_MONSTER_CODE.NEXTVAL
         ,'���̸�' 
         ,'�ҼӼ�'
         ,'1'
         ,'�߰ſ�'
         );
         
         INSERT
  INTO MC_MONSTER
       ( 
          MONSTER_CODE
        , MONSTER_NAME
        , MONSTER_TYPE
        , CATEGORY_CODE
        , MONSTER_FEATURE
        )
        VALUES
        (
          SEQ_MONSTER_CODE.NEXTVAL
         ,'���α�' 
         ,'���Ӽ�'
         ,'1'
         ,'������'
         );
         
         INSERT
  INTO MC_MONSTER
       ( 
          MONSTER_CODE
        , MONSTER_NAME
        , MONSTER_TYPE
        , CATEGORY_CODE
        , MONSTER_FEATURE
        )
        VALUES
        (
          SEQ_MONSTER_CODE.NEXTVAL
         ,'�Ʊ���' 
         ,'�ҼӼ�'
         ,'2'
         ,'�Ʊ����'
         );
         
         INSERT
  INTO MC_MONSTER
       ( 
          MONSTER_CODE
        , MONSTER_NAME
        , MONSTER_TYPE
        , CATEGORY_CODE
        , MONSTER_FEATURE
        )
        VALUES
        (
          SEQ_MONSTER_CODE.NEXTVAL
         ,'��Ÿ��' 
         ,'����Ӽ�'
         ,'2'
         ,'ǳ���̴���'
         );
         INSERT
  INTO MC_MONSTER
       ( 
          MONSTER_CODE
        , MONSTER_NAME
        , MONSTER_TYPE
        , CATEGORY_CODE
        , MONSTER_FEATURE
        )
        VALUES
        (
          SEQ_MONSTER_CODE.NEXTVAL
         ,'���׷��̸�' 
         ,'�ΰ���'
         ,'2'
         ,'�Ʊ��� ������ȭ'
         );
         
         INSERT
  INTO MC_MONSTER
       ( 
          MONSTER_CODE
        , MONSTER_NAME
        , MONSTER_TYPE
        , CATEGORY_CODE
        , MONSTER_FEATURE
        )
        VALUES
        (
          SEQ_MONSTER_CODE.NEXTVAL
         ,'������' 
         ,'��ü��'
         ,'3'
         ,'������'
         );
         INSERT
  INTO MC_MONSTER
       ( 
          MONSTER_CODE
        , MONSTER_NAME
        , MONSTER_TYPE
        , CATEGORY_CODE
        , MONSTER_FEATURE
        )
        VALUES
        (
          SEQ_MONSTER_CODE.NEXTVAL
         ,'��Ȳ����' 
         ,'�Ĺ���'
         ,'3'
         ,'�Ϳ���'
         );
         INSERT
  INTO MC_MONSTER
       ( 
          MONSTER_CODE
        , MONSTER_NAME
        , MONSTER_TYPE
        , CATEGORY_CODE
        , MONSTER_FEATURE
        )
        VALUES
        (
          SEQ_MONSTER_CODE.NEXTVAL
         ,'���ϵ庸��' 
         ,'������'
         ,'3'
         ,'����������...'
         );
         
         INSERT
  INTO MC_MONSTER
       ( 
          MONSTER_CODE
        , MONSTER_NAME
        , MONSTER_TYPE
        , CATEGORY_CODE
        , MONSTER_FEATURE
        )
        VALUES
        (
          SEQ_MONSTER_CODE.NEXTVAL
         ,'��ȫ��' 
         ,'�ΰ���'
         ,'4'
         ,'�ڵ�����'
         );


 
 
 
