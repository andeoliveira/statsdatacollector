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
    season_id INT NOT NULL,
    country_id INT NOT NULL,
    name VARCHAR NOT NULL,
    logo VARCHAR NOT NULL,
    CONSTRAINT pk_league PRIMARY KEY (id),
    CONSTRAINT fk_season_league FOREIGN KEY (id) REFERENCES "public".season(id),
    CONSTRAINT fk_country_league FOREIGN KEY (id) REFERENCES "public".country(id)
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
