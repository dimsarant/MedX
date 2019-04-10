drop database MedX;
create database MedX;
use MedX;


CREATE TABLE users(
  job ENUM('Γιατρός','Νοσηλευτής','Γραμματέας','Αποθηκάριος','Διευθυντής') NOT NULL,
  username VARCHAR(25) NOT NULL,
  password VARCHAR (50) NOT NULL,
  email VARCHAR(50) NOT NULL,
  name VARCHAR(25) NOT NULL,
  lastname VARCHAR(25) NOT NULL,
  birth_date DATE NOT NULL,
  tel_0 VARCHAR(10),
  tel_1 VARCHAR(10),
  address VARCHAR(25) NOT NULL,
  start_date DATE,
  PRIMARY KEY(username)
)ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


DELIMITER $$
CREATE TRIGGER `default_date` BEFORE INSERT ON `users` FOR EACH ROW
if ( isnull(new.start_date) ) then
 set new.start_date=curdate();
end if;
$$
delimiter ;

INSERT INTO users VALUES 
('Γιατρός','Γιατρός','1234','doctor@hotmail.com','Όνομα','Επώνυμο','1984-5-6','Τηλέφωνο 0','Τηλέφωνο 1','Διεύθυνση','2019-4-1'),
('Νοσηλευτής','Νοσηλευτής','1234','nurse@hotmail.com','Όνομα','Επώνυμο','1983-6-25','Τηλέφωνο 0','Τηλέφωνο 1','Διεύθυνση','2019-4-1'),
('Γραμματέας','Γραμματέας','1234','secretary@hotmail.com','Όνομα','Επώνυμο','1979-1-20','Τηλέφωνο 0','Τηλέφωνο 1','Διεύθυνση','2019-4-1'),
('Αποθηκάριος','Αποθηκάριος','1234','apothecary@hotmail.com','Όνομα','Επώνυμο','1986-12-5','Τηλέφωνο 0','Τηλέφωνο 1','Διεύθυνση','2019-4-1'),
('Διευθυντής','Διευθυντής','1234','manager@hotmail.com','Όνομα','Επώνυμο','1970-10-31','Τηλέφωνο 0','Τηλέφωνο 1','Διεύθυνση','2019-4-1');


CREATE TABLE temp_users(
  system_id VARCHAR(25) NOT NULL,
  username VARCHAR(25),
  remember_me ENUM('0', '1'),
  auto_login ENUM('0', '1'),
  PRIMARY KEY(system_id)
)ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;  


CREATE TABLE patient(
  patient_name VARCHAR(25) NOT NULL,
  patient_lastname VARCHAR(25) NOT NULL,
  tel VARCHAR(10),
  AFM VARCHAR(25) NOT NULL,
  ID_NUM VARCHAR(25) NOT NULL,
  AMKA VARCHAR(25) NOT NULL,
  gender ENUM('Άνδρας', 'Γυναίκα') NOT NULL,
  age TINYINT  NOT NULL,
  PRIMARY KEY(AMKA)
)ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


CREATE TABLE patient_room(
  AMKA VARCHAR(25) NOT NULL,
  room SMALLINT(3),
  PRIMARY KEY(AMKA,room),
  CONSTRAINT PATIENTROOM FOREIGN KEY (AMKA) REFERENCES patient(AMKA) ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


CREATE TABLE patient_treatment(
  AMKA VARCHAR(25) NOT NULL,
  reason TEXT,
  treatment TEXT,
  medicine TEXT,
  medicine_time TIME,
  treated ENUM('0','1') DEFAULT '0',
  cost SMALLINT DEFAULT 0,
  medicine_cost SMALLINT DEFAULT 0,
  check_out ENUM('0','1') DEFAULT '0',
  check_time TIME,
  PRIMARY KEY(AMKA),
  CONSTRAINT PATIENTTREATMENT FOREIGN KEY (AMKA) REFERENCES patient(AMKA) ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


CREATE TABLE patient_appointment(
  AMKA VARCHAR(25) NOT NULL,
  doc_user VARCHAR(25),
  date DATE,
  time TIME,
  PRIMARY KEY(AMKA,date,time),
  CONSTRAINT PATIENTAPPOINTMENT FOREIGN KEY (AMKA) REFERENCES patient(AMKA) ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


CREATE TABLE worker_schedule(
  username VARCHAR(25),
  date DATE,
  time TIME,
  PRIMARY KEY(username,date,time),
  CONSTRAINT worker_id FOREIGN KEY (username) REFERENCES users(username) ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


CREATE TABLE patient_history(
  patient_name VARCHAR(25) NOT NULL,
  patient_lastname VARCHAR(25) NOT NULL,
  tel VARCHAR(10),
  AFM VARCHAR(25) NOT NULL,
  ID_NUM VARCHAR(25) NOT NULL,
  AMKA VARCHAR(25) NOT NULL,
  gender ENUM('Άνδρας', 'Γυναίκα') NOT NULL,
  age TINYINT NOT NULL,
  reason TEXT,
  treatment TEXT,
  medicine TEXT,
  cost SMALLINT DEFAULT 0,
  medicine_cost SMALLINT DEFAULT 0,
  check_date DATETIME DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY(AMKA,check_date)
)ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


DELIMITER $$
CREATE TRIGGER patient_deleted BEFORE DELETE ON patient
FOR EACH ROW
BEGIN
  INSERT INTO patient_history(patient_name,patient_lastname,tel,AFM,ID_NUM,AMKA,gender,age,reason,treatment,medicine,cost,medicine_cost)
  SELECT patient_name,patient_lastname,tel,AFM,ID_NUM,patient.AMKA,gender,age,reason,treatment,medicine,cost,medicine_cost
  FROM patient inner join patient_treatment on patient.AMKA=patient_treatment.AMKA
  WHERE patient.AMKA=old.AMKA;
END$$
DELIMITER ;


CREATE TABLE messages(
  sender VARCHAR(25) NOT NULL,
  receiver VARCHAR(25) NOT NULL,
  owner VARCHAR(25) NOT NULL,
  message TEXT,
  date_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP(),
  PRIMARY KEY(owner,date_time)
)ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


CREATE TABLE misc(
  name VARCHAR(50) NOT NULL,
  quantity SMALLINT DEFAULT 0,
  buy_price SMALLINT(5),
  PRIMARY KEY(name)
)ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;

INSERT INTO misc VALUES
('Χαρτί Υγείας',100,3),
('Γάζες',100,5),
('Ενέσεις',100,2),
('Παντόφλες',100,1),
('CPR Μάσκα',100,6),
('Συσκευή Κλύσματος',100,5),
('Χειρουργική Μάσκα',100,2),
('Αυτοκόλλητα Ράμματα',100,1),
('Πάπια',100,4);


CREATE TABLE medicine(
  name VARCHAR(50) NOT NULL,
  quantity SMALLINT DEFAULT 0,
  buy_price SMALLINT(5),
  sell_price SMALLINT(5),
  PRIMARY KEY(name)
)ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;
INSERT INTO medicine VALUES

('Vicodin',100,7,14),
('Norco',100,7,14),
('Xodol',100,7,14),
('Synthroid ',100,5,11),
('Levoxyl',100,5,11),
('Unithroid',100,5,11),
('Delasone',100,2,5),
('Sterapred',100,2,5),
('Amoxil',100,4,9),
('Neurontin',100,6,13),
('Prinivil',100,3,7),
('Zestril',100,3,7),
('Lipitor',100,6,12),
('Glucophage',100,4,8),
('Zofran',100,6,13),
('Motrin',100,6,12);


CREATE TABLE salaries(
  username VARCHAR(25) NOT NULL,
  salary INT(5) NOT NULL,
  PRIMARY KEY(username),
  CONSTRAINT USERSALARY FOREIGN KEY (username) REFERENCES users(username) ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


CREATE TABLE income(
  year INT(4) not null,
  month INT(2) not null,
  patients_income INT default 0,
  medicine_income INT default 0,
  PRIMARY KEY(year,month)
)ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;
INSERT INTO income (year,month) VALUES (year(curdate()),month(curdate()));


CREATE TABLE outcome(
  year INT(4) not null,
  month INT(2) not null,
  salaries_sum INT default 0,
  medicine_costs INT default 0,
  hospital_costs INT default 0,
  PRIMARY KEY(year,month)
)ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;
INSERT INTO outcome (year,month) VALUES (year(curdate()),month(curdate()));

DELIMITER $$
CREATE TRIGGER salaries_inserted AFTER INSERT ON salaries
FOR EACH ROW
BEGIN
  UPDATE outcome o,(SELECT sum(salary) as sum from salaries) as s
  SET o.salaries_sum=s.sum where o.year=year(curdate()) and o.month=month(curdate());
END$$
DELIMITER ;

DELIMITER $$
CREATE TRIGGER salaries_updated AFTER UPDATE ON salaries
FOR EACH ROW
BEGIN
  UPDATE outcome o,(SELECT sum(salary) as sum from salaries) as s
  SET o.salaries_sum=s.sum where o.year=year(curdate()) and o.month=month(curdate());
END$$
DELIMITER ;

DELIMITER $$
CREATE TRIGGER salaries_deleted AFTER DELETE ON salaries
FOR EACH ROW
BEGIN
  UPDATE outcome o,(SELECT sum(salary) as sum from salaries) as s
  SET o.salaries_sum=s.sum where o.year=year(curdate()) and o.month=month(curdate());
END$$
DELIMITER ;

INSERT INTO salaries VALUES
('Γιατρός',3000),
('Νοσηλευτής',1500),
('Γραμματέας',1300),
('Αποθηκάριος',1000),
('Διευθυντής',5000);	