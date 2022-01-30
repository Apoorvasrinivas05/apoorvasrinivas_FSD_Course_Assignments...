
SQL

```sql
CREATE DATABASE pets;
create user 'springuser'@'%' identified by 'ThePassword'; -- Creates the user springuser
grant all on pets.* to 'springuser'@'%'; -- Gives all privileges to the new user on the newly created database
```

```sql
CREATE TABLE pets.products (
id  int(11) AUTO_INCREMENT,
name VARCHAR(256),
color VARCHAR(256),
price DECIMAL(19,2),
PRIMARY KEY (`id`)
);

INSERT INTO pets.products (name,color,price) VALUES ("Bird", "Chartreuse", 200.00);
INSERT INTO pets.products (name,color,price) VALUES ("Hamster", "Brown", 30.00);
INSERT INTO pets.products (name,color,price) VALUES ("Cayman", "Neon Pink", 500.00);
INSERT INTO pets.products (name,color,price) VALUES ("Tarantula", "Red", 100.00);
```
