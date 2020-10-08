DROP TABLE IF EXISTS employees;

CREATE TABLE employees (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  surname VARCHAR(250) NOT NULL,
  role VARCHAR(250) NOT NULL,
  salary DOUBLE NOT NULL
);

INSERT INTO employees (name, surname, role, salary) VALUES
  ('Mary','Jones','Director',350000),
  ('James','Martin','Supervisor',100000),
  ('Eric','Thomas','Coordinator',70000),
  ('Raven','Matthews','Staff',30000),
  ('Tim','Lowell','Manager',210000),
  ('Miriam','Haines','Staff',30000);
