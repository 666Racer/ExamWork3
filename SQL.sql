DROP DATABASE IF EXISTS friends_of_human;
CREATE DATABASE IF NOT EXISTS friends_of_human;
USE friends_of_human;

DROP TABLE IF EXISTS animals;
CREATE TABLE animals (
id INT AUTO_INCREMENT PRIMARY KEY,
class VARCHAR(15)
);

INSERT INTO animals (class)
VALUES
("pets"),
("pack_animals");

DROP TABLE IF EXISTS pets;
CREATE TABLE pets (
id INT AUTO_INCREMENT PRIMARY KEY,
type_of_animal VARCHAR(45)
);

INSERT INTO pets (type_of_animal)
VALUES
("dogs"),
("cats"),
("hamsters");

DROP TABLE IF EXISTS pack_animals;
CREATE TABLE pack_animals (
id INT AUTO_INCREMENT PRIMARY KEY,
type_of_animal VARCHAR(45)
);

INSERT INTO pack_animals (type_of_animal)
VALUES
("horses"),
("camels"),
("donkeys");

DROP TABLE IF EXISTS dogs;
CREATE TABLE dogs (
id INT AUTO_INCREMENT PRIMARY KEY,
name_of_animal VARCHAR(45),
date_of_birth DATE,
command VARCHAR(45)
);

INSERT INTO dogs (name_of_animal, date_of_birth, command)
VALUES
("samoed", '2022-02-20', "bark"),
("labrador", '2023-01-10', "bark"),
("husky", '2020-03-30', "bark");

DROP TABLE IF EXISTS cats;
CREATE TABLE cats (
id INT AUTO_INCREMENT PRIMARY KEY,
name_of_animal VARCHAR(45),
date_of_birth DATE,
command VARCHAR(45)
);

INSERT INTO cats (name_of_animal, date_of_birth, command)
VALUES
("persian_cat", '2022-02-20', "meow"),
("suberian_cat", '2023-01-10', "meow"),
("siamese_cat", '2020-03-30', "meow");

DROP TABLE IF EXISTS hamsters;
CREATE TABLE hamsters (
id INT AUTO_INCREMENT PRIMARY KEY,
name_of_animal VARCHAR(45),
date_of_birth DATE,
command VARCHAR(45)
);

INSERT INTO hamsters (name_of_animal, date_of_birth, command)
VALUES
("little_hamster", '2024-01-01', "squeak");


DROP TABLE IF EXISTS horses;
CREATE TABLE horses(
id INT AUTO_INCREMENT PRIMARY KEY,
name_of_animal VARCHAR(45),
date_of_birth DATE,
command VARCHAR(45)
);

INSERT INTO horses (name_of_animal, date_of_birth, command)
VALUES
("horse", '2022-02-20', "neigh"),
("stallion", '2020-03-30', "neigh");

DROP TABLE IF EXISTS camels;
CREATE TABLE camels (
id INT AUTO_INCREMENT PRIMARY KEY,
name_of_animal VARCHAR(45),
date_of_birth DATE,
command VARCHAR(45)
);

INSERT INTO camels (name_of_animal, date_of_birth, command)
VALUES
("dromedary", '2022-02-20', "neigh"),
("bactrian_camel", '2020-03-30', "neigh");

DROP TABLE IF EXISTS donkeys;
CREATE TABLE donkeys (
id INT AUTO_INCREMENT PRIMARY KEY,
name_of_animal VARCHAR(45),
date_of_birth DATE,
command VARCHAR(45)
);

INSERT INTO donkeys (name_of_animal, date_of_birth, command)
VALUES
("little_donkey", '2024-01-01', "bray");

#10. Удалить из таблицы верблюдов, т.к. верблюдов решили перевезти в другой заповедник на зимовку.
#  Объединить таблицы лошади, и ослы в одну таблицу.
DROP TABLE camels;

SELECT h.name_of_animal, h.date_of_birth, h.command
FROM horses AS h
UNION ALL
SELECT d.name_of_animal, d.date_of_birth, d.command
FROM donkeys AS d;

#11.Создать новую таблицу “молодые животные” в которую попадут все
#животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
#до месяца подсчитать возраст животных в новой таблице

CREATE OR REPLACE VIEW young_animals AS
SELECT *, TIMESTAMPDIFF(MONTH, date_of_birth, CURRENT_DATE()) AS 'age' FROM dogs
WHERE TIMESTAMPDIFF(MONTH, date_of_birth, CURDATE()) BETWEEN 12 AND 36
UNION ALL
SELECT *, TIMESTAMPDIFF(MONTH, date_of_birth, CURRENT_DATE()) AS 'age' FROM cats
WHERE TIMESTAMPDIFF(MONTH, date_of_birth, CURDATE()) BETWEEN 12 AND 36
UNION ALL
SELECT *, TIMESTAMPDIFF(MONTH, date_of_birth, CURRENT_DATE()) AS 'age' FROM horses
WHERE TIMESTAMPDIFF(MONTH, date_of_birth, CURRENT_DATE()) BETWEEN 12 AND 36
UNION ALL
SELECT *, TIMESTAMPDIFF(MONTH, date_of_birth, CURRENT_DATE()) AS 'age' FROM donkeys
WHERE TIMESTAMPDIFF(MONTH, date_of_birth, CURRENT_DATE()) BETWEEN 12 AND 36;


#12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
# прошлую принадлежность к старым таблицам.

SELECT dogs.name_of_animal, dogs.date_of_birth, dogs.command
FROM dogs
UNION ALL
SELECT c.name_of_animal, c.date_of_birth, c.command
FROM cats AS c
UNION ALL
SELECT h.name_of_animal, h.date_of_birth, h.command
FROM horses AS h
UNION ALL
SELECT d.name_of_animal, d.date_of_birth, d.command
FROM donkeys AS d;
-- прошлой принадлежности нет, т.к. я специально сделал названия столбцов одинаковыми,
-- чтобы не загромождать итоговую таблицу. UNION ALL в любом случае объединил бы все.







 





