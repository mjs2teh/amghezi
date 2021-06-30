DROP TABLE IF EXISTS Drivers;

CREATE TABLE Drivers (
                               id VARCHAR(200) AUTO_INCREMENT  PRIMARY KEY,
                               name VARCHAR(250) NOT NULL,
                               carNumber VARCHAR(250) NOT NULL
);