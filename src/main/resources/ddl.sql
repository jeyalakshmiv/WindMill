DROP TABLE IF EXISTS WINDMILL_DETAILS;
DROP TABLE IF EXISTS WINDMILL_ENERGY_DETAILS;
DROP TABLE IF EXISTS WINDMILL_AVG_DETAILS;

CREATE TABLE IF NOT EXISTS WINDMILL_DETAILS (
    UNIQUE_ID       VARCHAR2(50) NOT NULL,
    NAME   VARCHAR2(200),
   	ADDRESS VARCHAR2(300),
    LATITUDE             VARCHAR2(30),
    LONGITUDE            VARCHAR2(30),
    REGISTERED_DATE DATETIME,
    CONSTRAINT PK_WINDMILL_DETAILS PRIMARY KEY (UNIQUE_ID)
    
    
);

CREATE TABLE IF NOT EXISTS WINDMILL_ENERGY_DETAILS (
   UNIQUE_ID       VARCHAR2(50) NOT NULL,
    ENERGY_PRODUCED        INT,
    ENERGY_DATE	DATE,
    ENERGY_TIME Time
    
    
);

CREATE TABLE IF NOT EXISTS WINDMILL_AVG_DETAILS (
    UNIQUE_ID       VARCHAR2(50) NOT NULL,
    SUM DOUBLE,
    MIN DOUBLE,
    MAX DOUBLE,
    AVG DOUBLE,
   	AVG_DATE  DATE,
   FOREIGN KEY (UNIQUE_ID) REFERENCES WINDMILL_DETAILS(UNIQUE_ID)
);

