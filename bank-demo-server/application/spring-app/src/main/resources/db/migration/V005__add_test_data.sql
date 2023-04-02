--Create 1 000 test clients
INSERT INTO CLIENT_TEST
SELECT id
FROM pg_catalog.generate_series(1, 1000) id;
--Create 2 000 test accounts, every client has 2 test account
INSERT INTO ACCOUNT_1 (NUMBER, CLIENT_ID)
SELECT md5(random()::text), id FROM pg_catalog.generate_series(1, 2), pg_catalog.generate_series(1, 1000) id;
--Create 2 000 test accounts, every client has 2 test account
INSERT INTO ACCOUNT_2 (NUMBER, CLIENT_ID)
SELECT md5(random()::text), id FROM pg_catalog.generate_series(1, 2), pg_catalog.generate_series(1, 1000) id;
--Create 2 000 test accounts, every client has 2 test account
INSERT INTO ACCOUNT_3 (NUMBER, CLIENT_ID)
SELECT md5(random()::text), id FROM pg_catalog.generate_series(1, 2), pg_catalog.generate_series(1, 1000) id;
--Create 2 000 test accounts, every client has 2 test account
INSERT INTO ACCOUNT_4 (NUMBER, CLIENT_ID)
SELECT md5(random()::text), id FROM pg_catalog.generate_series(1, 2), pg_catalog.generate_series(1, 1000) id;
--Create 2 000 test accounts, every client has 2 test account
INSERT INTO ACCOUNT_5 (NUMBER, CLIENT_ID)
SELECT md5(random()::text), id FROM pg_catalog.generate_series(1, 2), pg_catalog.generate_series(1, 1000) id;
--Create 2 000 test accounts, every client has 2 test account
INSERT INTO ACCOUNT_6 (NUMBER, CLIENT_ID)
SELECT md5(random()::text), id FROM pg_catalog.generate_series(1, 2), pg_catalog.generate_series(1, 1000) id;
--Create 2 000 test accounts, every client has 2 test account
INSERT INTO ACCOUNT_7 (NUMBER, CLIENT_ID)
SELECT md5(random()::text), id FROM pg_catalog.generate_series(1, 2), pg_catalog.generate_series(1, 1000) id;
--Create 2 000 test accounts, every client has 2 test account
INSERT INTO ACCOUNT_8 (NUMBER, CLIENT_ID)
SELECT md5(random()::text), id FROM pg_catalog.generate_series(1, 2), pg_catalog.generate_series(1, 1000) id;
--Create 2 000 test accounts, every client has 2 test account
INSERT INTO ACCOUNT_9 (NUMBER, CLIENT_ID)
SELECT md5(random()::text), id FROM pg_catalog.generate_series(1, 2), pg_catalog.generate_series(1, 1000) id;
--Create 2 000 test accounts, every client has 2 test account
INSERT INTO ACCOUNT_10 (NUMBER, CLIENT_ID)
SELECT md5(random()::text), id FROM pg_catalog.generate_series(1, 2), pg_catalog.generate_series(1, 1000) id;
--Create 2 000 test accounts, every client has 2 test account
INSERT INTO ACCOUNT_11 (NUMBER, CLIENT_ID)
SELECT md5(random()::text), id FROM pg_catalog.generate_series(1, 2), pg_catalog.generate_series(1, 1000) id;
--Create 2 000 test accounts, every client has 2 test account
INSERT INTO ACCOUNT_12 (NUMBER, CLIENT_ID)
SELECT md5(random()::text), id FROM pg_catalog.generate_series(1, 2), pg_catalog.generate_series(1, 1000) id;
--Create 2 000 test accounts, every client has 2 test account
INSERT INTO ACCOUNT_13 (NUMBER, CLIENT_ID)
SELECT md5(random()::text), id FROM pg_catalog.generate_series(1, 2), pg_catalog.generate_series(1, 1000) id;
--Create 2 000 test accounts, every client has 2 test account
INSERT INTO ACCOUNT_14 (NUMBER, CLIENT_ID)
SELECT md5(random()::text), id FROM pg_catalog.generate_series(1, 2), pg_catalog.generate_series(1, 1000) id;
--Create 2 000 test accounts, every client has 2 test account
INSERT INTO ACCOUNT_15 (NUMBER, CLIENT_ID)
SELECT md5(random()::text), id FROM pg_catalog.generate_series(1, 2), pg_catalog.generate_series(1, 1000) id;
--Create 2 000 test accounts, every client has 2 test account
INSERT INTO ACCOUNT_16 (NUMBER, CLIENT_ID)
SELECT md5(random()::text), id FROM pg_catalog.generate_series(1, 2), pg_catalog.generate_series(1, 1000) id;
--Create 2 000 test accounts, every client has 2 test account
INSERT INTO ACCOUNT_17 (NUMBER, CLIENT_ID)
SELECT md5(random()::text), id FROM pg_catalog.generate_series(1, 2), pg_catalog.generate_series(1, 1000) id;
--Create 2 000 test accounts, every client has 2 test account
INSERT INTO ACCOUNT_18 (NUMBER, CLIENT_ID)
SELECT md5(random()::text), id FROM pg_catalog.generate_series(1, 2), pg_catalog.generate_series(1, 1000) id;
--Create 2 000 test accounts, every client has 2 test account
INSERT INTO ACCOUNT_19 (NUMBER, CLIENT_ID)
SELECT md5(random()::text), id FROM pg_catalog.generate_series(1, 2), pg_catalog.generate_series(1, 1000) id;
--Create 2 000 test accounts, every client has 2 test account
INSERT INTO ACCOUNT_20 (NUMBER, CLIENT_ID)
SELECT md5(random()::text), id FROM pg_catalog.generate_series(1, 2), pg_catalog.generate_series(1, 1000) id;