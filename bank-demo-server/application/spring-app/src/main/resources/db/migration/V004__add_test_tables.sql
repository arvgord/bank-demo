CREATE TABLE CLIENT_TEST
(
    ID bigserial UNIQUE NOT NULL
);

CREATE TABLE ACCOUNT_1
(
    ID        bigserial UNIQUE NOT NULL,
    NUMBER    text,
    CLIENT_ID bigint REFERENCES CLIENT_TEST (ID)
);

CREATE TABLE ACCOUNT_2
(
    ID        bigserial UNIQUE NOT NULL,
    NUMBER    text,
    CLIENT_ID bigint REFERENCES CLIENT_TEST (ID)
);

CREATE TABLE ACCOUNT_3
(
    ID        bigserial UNIQUE NOT NULL,
    NUMBER    text,
    CLIENT_ID bigint REFERENCES CLIENT_TEST (ID)
);

CREATE TABLE ACCOUNT_4
(
    ID        bigserial UNIQUE NOT NULL,
    NUMBER    text,
    CLIENT_ID bigint REFERENCES CLIENT_TEST (ID)
);

CREATE TABLE ACCOUNT_5
(
    ID        bigserial UNIQUE NOT NULL,
    NUMBER    text,
    CLIENT_ID bigint REFERENCES CLIENT_TEST (ID)
);

CREATE TABLE ACCOUNT_6
(
    ID        bigserial UNIQUE NOT NULL,
    NUMBER    text,
    CLIENT_ID bigint REFERENCES CLIENT_TEST (ID)
);

CREATE TABLE ACCOUNT_7
(
    ID        bigserial UNIQUE NOT NULL,
    NUMBER    text,
    CLIENT_ID bigint REFERENCES CLIENT_TEST (ID)
);

CREATE TABLE ACCOUNT_8
(
    ID        bigserial UNIQUE NOT NULL,
    NUMBER    text,
    CLIENT_ID bigint REFERENCES CLIENT_TEST (ID)
);

CREATE TABLE ACCOUNT_9
(
    ID        bigserial UNIQUE NOT NULL,
    NUMBER    text,
    CLIENT_ID bigint REFERENCES CLIENT_TEST (ID)
);

CREATE TABLE ACCOUNT_10
(
    ID        bigserial UNIQUE NOT NULL,
    NUMBER    text,
    CLIENT_ID bigint REFERENCES CLIENT_TEST (ID)
);

CREATE TABLE ACCOUNT_11
(
    ID        bigserial UNIQUE NOT NULL,
    NUMBER    text,
    CLIENT_ID bigint REFERENCES CLIENT_TEST (ID)
);

CREATE TABLE ACCOUNT_12
(
    ID        bigserial UNIQUE NOT NULL,
    NUMBER    text,
    CLIENT_ID bigint REFERENCES CLIENT_TEST (ID)
);

CREATE TABLE ACCOUNT_13
(
    ID        bigserial UNIQUE NOT NULL,
    NUMBER    text,
    CLIENT_ID bigint REFERENCES CLIENT_TEST (ID)
);

CREATE TABLE ACCOUNT_14
(
    ID        bigserial UNIQUE NOT NULL,
    NUMBER    text,
    CLIENT_ID bigint REFERENCES CLIENT_TEST (ID)
);

CREATE TABLE ACCOUNT_15
(
    ID        bigserial UNIQUE NOT NULL,
    NUMBER    text,
    CLIENT_ID bigint REFERENCES CLIENT_TEST (ID)
);

CREATE TABLE ACCOUNT_16
(
    ID        bigserial UNIQUE NOT NULL,
    NUMBER    text,
    CLIENT_ID bigint REFERENCES CLIENT_TEST (ID)
);

CREATE TABLE ACCOUNT_17
(
    ID        bigserial UNIQUE NOT NULL,
    NUMBER    text,
    CLIENT_ID bigint REFERENCES CLIENT_TEST (ID)
);

CREATE TABLE ACCOUNT_18
(
    ID        bigserial UNIQUE NOT NULL,
    NUMBER    text,
    CLIENT_ID bigint REFERENCES CLIENT_TEST (ID)
);

CREATE TABLE ACCOUNT_19
(
    ID        bigserial UNIQUE NOT NULL,
    NUMBER    text,
    CLIENT_ID bigint REFERENCES CLIENT_TEST (ID)
);

CREATE TABLE ACCOUNT_20
(
    ID        bigserial UNIQUE NOT NULL,
    NUMBER    text,
    CLIENT_ID bigint REFERENCES CLIENT_TEST (ID)
);