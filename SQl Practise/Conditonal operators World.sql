USE world;
SELECT * FROM city;
SELECT DISTINCT * FROM city;
SELECT DISTINCT country_id FROM city;
SELECT * FROM city WHERE country_id=22;
SELECT * FROM city WHERE country_id<15;
SELECT * FROM city WHERE country_id is NULL;