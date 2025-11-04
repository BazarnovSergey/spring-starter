--liquibase formatted sql

--changeset s.bazarnov:1
ALTER TABLE users
ADD COLUMN image VARCHAR(64)

--changeset s.bazarnov:2
ALTER TABLE users_aud
    ADD COLUMN image VARCHAR(64)