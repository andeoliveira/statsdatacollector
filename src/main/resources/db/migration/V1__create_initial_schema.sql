CREATE TABLE "public".country (
    id BIGINT NOT NULL,
    code VARCHAR(2),
    flag VARCHAR,
    name VARCHAR(120) NOT NULL,
    CONSTRAINT pk_country PRIMARY KEY (id)
);

CREATE TABLE "public".season (
    id BIGINT NOT NULL,
    year INT NOT NULL,
    CONSTRAINT pk_season PRIMARY KEY (id)
);

CREATE TABLE "public".league (
    id BIGINT NOT NULL,
    name VARCHAR NOT NULL,
    type VARCHAR NOT NULL,
    logo VARCHAR NOT NULL,
    CONSTRAINT pk_league PRIMARY KEY (id)
);

CREATE SEQUENCE "public".country_seq
    INCREMENT BY 1
    START 1;

CREATE SEQUENCE "public".season_seq
    INCREMENT BY 1
    START 1;

CREATE SEQUENCE "public".league_seq
    INCREMENT BY 1
    START 1;
