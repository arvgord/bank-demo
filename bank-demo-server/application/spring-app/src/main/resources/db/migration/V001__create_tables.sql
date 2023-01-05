CREATE TABLE CLIENT
(
    ID                 bigserial UNIQUE NOT NULL,
    CLIENT_FIRST_NAME  text,
    CLIENT_MIDDLE_NAME text,
    CLIENT_LAST_NAME   text,
    ADDRESS_CITY       text,
    ADDRESS_STREET     text,
    ADDRESS_HOUSE      text,
    ADDRESS_FLAT       text
);

CREATE TABLE ACCOUNT
(
    ID        bigserial UNIQUE NOT NULL,
    AMOUNT    decimal,
    NUMBER    text,
    CLIENT_ID bigint REFERENCES CLIENT (ID)
);

CREATE TABLE DEPOSIT
(
    ID        bigserial UNIQUE NOT NULL,
    AMOUNT    decimal,
    RATE      decimal,
    CLIENT_ID bigint REFERENCES CLIENT (ID)
);

CREATE TABLE LOAN
(
    ID        bigserial UNIQUE NOT NULL,
    AMOUNT    decimal,
    RATE      decimal,
    CLIENT_ID bigint REFERENCES CLIENT (ID)
);

CREATE TABLE ACCOUNT_TRANSFER
(
    ID              bigserial UNIQUE NOT NULL,
    TRANSFER_AMOUNT decimal,
    FROM_ACCOUNT    text,
    TO_ACCOUNT      text,
    CLIENT_ID       bigint REFERENCES CLIENT (ID)
);