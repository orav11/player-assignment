
drop table if exists player;

CREATE table PLAYER(
    player_id VARCHAR(255) PRIMARY KEY,
    birth_year INT,
    birth_month INT,
    birth_day INT,
    birth_country VARCHAR(50),
    birth_state VARCHAR(50),
    birth_city VARCHAR(50),
    death_year INT,
    death_month INT,
    death_day INT,
    death_country VARCHAR(50),
    death_state VARCHAR(50),
    death_city VARCHAR(50),
    name_first VARCHAR(50),
    name_last VARCHAR(50),
    name_given VARCHAR(100),
    weight INT,
    height INT,
    bats VARCHAR(1),
    throws VARCHAR(1),
    debut DATE,
    final_game DATE,
    retro_id VARCHAR(255),
    bbref_id VARCHAR(255)
);

-- Load data from CSV into Player table
INSERT INTO Player (
    player_id, birth_year, birth_month, birth_day, birth_country, birth_state, birth_city,
    death_year, death_month, death_day, death_country, death_state, death_city,
    name_first, name_last, name_given, weight, height, bats, throws, debut, final_game,
    retro_id, bbref_id
)
SELECT * FROM CSVREAD('classpath:/static/player.csv');
