--Create 10 000 accounts. Every client has at least one account
INSERT INTO ACCOUNT
SELECT id, floor(random()*10000000+1), md5(random()::text), id
FROM pg_catalog.generate_series(1, 10000) id;
--Create 20 000 additional accounts
INSERT INTO ACCOUNT
SELECT id, floor(random()*10000000+1), md5(random()::text), floor(random()*10000+1)
FROM pg_catalog.generate_series(10001, 20000) id;
--Create 20 000 deposits
INSERT INTO DEPOSIT
SELECT id, floor(random()*10000000+1), floor(random()*15+1), floor(random()*10000+1)
FROM pg_catalog.generate_series(1, 20000) id;
--Create 10 000 loans
INSERT INTO LOAN
SELECT id, floor(random()*10000000+1), floor(random()*15+1), floor(random()*10000+1)
FROM pg_catalog.generate_series(1, 10000) id;
--Create 100 000 transfers
INSERT INTO ACCOUNT_TRANSFER
SELECT id, floor(random()*10000000+1), md5(random()::text), md5(random()::text), floor(random()*10000+1)
FROM pg_catalog.generate_series(1, 100000) id;