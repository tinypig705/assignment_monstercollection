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
     , '포켓몬'
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
     , '디지몬'
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
     , '메이플스토리'
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
     , '기타'
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
         ,'피카츄' 
         ,'전기속성'
         ,'1'
         ,'귀여움'
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
         ,'파이리' 
         ,'불속성'
         ,'1'
         ,'뜨거움'
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
         ,'꼬부기' 
         ,'물속성'
         ,'1'
         ,'차가움'
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
         ,'아구몬' 
         ,'불속성'
         ,'2'
         ,'아기공룡'
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
         ,'텐타몬' 
         ,'전기속성'
         ,'2'
         ,'풍뎅이닮음'
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
         ,'워그레이몬' 
         ,'인간형'
         ,'2'
         ,'아구몬 최종진화'
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
         ,'슬라임' 
         ,'액체형'
         ,'3'
         ,'말랑함'
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
         ,'주황버섯' 
         ,'식물형'
         ,'3'
         ,'귀여움'
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
         ,'와일드보어' 
         ,'동물형'
         ,'3'
         ,'구워먹으면...'
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
         ,'준홍몬' 
         ,'인간형'
         ,'4'
         ,'코딩못함'
         );


 
 
 
