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
('Γιατρός','Γιατρός','1234','doctor@hotmail.com','Όνομα','Επώνυμο','1984-4-6','Τηλέφωνο 0','Τηλέφωνο 1','Νοταρα 2','2018-4-1'),
('Γιατρός','nikos','1234','nikos@hotmail.com','Νίκος','Νικολάου','1978-2-3','6911111111','-','Παπαφλέσσα 34','2017-4-1'),
('Γιατρός','john','1234','john@hotmail.com','Γιάννης','Γιαννόπουλος','1979-5-6','6922222222','-','Καραισκάκη 65','2018-4-1'),
('Γιατρός','aris','1234','aris@hotmail.com','Άρης','Αλεξίου','1976-4-7','6933333333','-','Ηπείρου 43','2014-4-1'),
('Γιατρός','marios','1234','marios@hotmail.com','Μάριος','Ευαγγέλου','1938-3-3','6944444444','-','Βορείου Ηπείρου 3','2012-4-1'),
('Γιατρός','vaggelis','1234','vaggelis@hotmail.com','Βαγγέλης','Νικολάου','1987-10-11','6955555555','-','Νόρμαν 82','2012-2-19'),
('Γιατρός','kostas','1234','kostas@hotmail.com','Κώστας','Παναγιώτου','1974-12-18','6966666666','-','Κανακάρη 36','2010-1-18'),
('Γιατρός','giorgos','1234','giorgos@hotmail.com','Γιώργος','Γεωργόπουλος','1964-9-14','6977777777','-','Λυκούργου 67','2009-1-15'),
('Γιατρός','aristotelis','1234','aristotelis@hotmail.com','Αριστοτέλης','Πάνου','1974-5-8','6988888888','-','Ελλήνως Στρατιώτου 54','2008-9-1'),
('Γιατρός','giannis','1234','giannis@hotmail.com','Γιάννης','Αγγελόπουλος','1982-11-18','6999999999','-','Νοταρά 98','2015-8-1'),
('Γιατρός','aggelos','1234','aggelos@hotmail.com','Άγγελος','Αστερής','1985-1-6','6900000000','-','Πανεπιστημίου 28','2014-4-1'),

('Νοσηλευτής','Νοσηλευτής','1234','nurse@hotmail.com','Όνομα','Επώνυμο','1983-6-25','Τηλέφωνο 0','Τηλέφωνο 1','Διεύθυνση','2019-4-1'),
('Νοσηλευτής','maria','1234','maria@hotmail.com','Μαρία','Αγγελοπούλου','1988-2-3','6901000000','-','Παπαφλέσσα 34','2017-4-1'),
('Νοσηλευτής','sofia','1234','sofia@hotmail.com','Σοφία','Παππά','1982-5-6','6901111111','-','Νοταρά 44','2014-10-28'),
('Νοσηλευτής','anastasia','1234','anastasia@hotmail.com','Αναστασία','Τσαφογιάννη','1986-4-7','6901222222','-','Καραισκάκη 25','2017-7-26'),
('Νοσηλευτής','andreas','1234','andreas@hotmail.com','Αντρέας','Νικολάου','1981-3-3','6901333333','-','Λυκούργου 77','2012-2-11'),
('Νοσηλευτής','giwta','1234','giwta@hotmail.com','Γιώτα','Κλοκώνη','1989-8-20','6901444444','-','Παπαφλέσσα 04','2018-4-12'),
('Νοσηλευτής','aggeliki','1234','aggeliki@hotmail.com','Αγγελική','Νικολακοπούλου','1978-8-3','6901555555','-','Πανεπιστημίου 17','2018-2-24'),
('Νοσηλευτής','ilia','1234','ilia@hotmail.com','Ήλια','Γεωργιοπούλου','1987-12-9','6901666666','-','Ηπείρου 84','2017-5-7'),
('Νοσηλευτής','gewrgia','1234','gewrgia@hotmail.com','Γεωργία','Σερασκέρη','1990-4-21','6901777777','-','Νόρμαν 56','2014-5-12'),
('Νοσηλευτής','konstantina','1234','konstantina@hotmail.com','Κωνσταντίνα','Αθανασοπούλου','1985-7-22','6901888888','-','Κανακάρη 69','2011-11-11'),
('Νοσηλευτής','marianna','1234','marianna@hotmail.com','Μαριάννα','Βαλογιάννη','1986-10-14','6901999999','-','Κολοκοτρώνη 78 34','2010-9-24'),

('Γραμματέας','Γραμματέας','1234','secretary@hotmail.com','Όνομα','Επώνυμο','1979-1-20','Τηλέφωνο 0','Τηλέφωνο 1','Διεύθυνση','2019-4-1'),
('Γραμματέας','pagwna','1234','pagwna@hotmail.com','Παγώνα','Αντωνοπούλου','1982-4-25','6903000000','-','Παπαφλέσσα 39','2015-8-12'),
('Γραμματέας','antonia','1234','antonia@hotmail.com','Αντωνία','Αλεξοπούλου','1981-8-24','6903111111','-','Νόρμαν 104','2014-12-10'),
('Γραμματέας','thodoris','1234','thodoris@hotmail.com','Θοδωρής','Σμυρνιός','1978-3-22','6903333333','-','Κανακάρη 82','2012-11-15'),
('Γραμματέας','theodwra','1234','theodwra@hotmail.com','Θεοδώρα','Κουρνέτα','1985-8-14','6903444444','-','Πανεπιστημίου 14','2010-4-8'),
('Γραμματέας','vasilis','1234','vasilis@hotmail.com','Βαίλης','Κατσανιώτης','1983-6-25','6903555555','-','Κολοκοτρώνη 28','2014-3-12'),


('Αποθηκάριος','Αποθηκάριος','1234','apothecary@hotmail.com','Όνομα','Επώνυμο','1986-12-5','Τηλέφωνο 0','Τηλέφωνο 1','Διεύθυνση','2019-4-1'),
('Αποθηκάριος','antonis','1234','antonis@hotmail.com','Αντώνης','Αντωνακόπουλος','1978-2-3','6902000000','-','Νόρμαν 24','2016-12-10'),
('Αποθηκάριος','nikolas','1234','niikolas@hotmail.com','Νίκος','Αλεξάνδρου','1974-12-11','6902111111','-','Κανακάρη 12','2012-8-9'),
('Αποθηκάριος','mairi','1234','mairi@hotmail.com','Μαίρη','Αλεξοπούλου','1981-8-11','6902222222','-','Παπαφλέσσα 34','2015-3-12'),

('Διευθυντής','Διευθυντής','1234','manager@hotmail.com','Όνομα','Επώνυμο','1970-10-31','Τηλέφωνο 0','Τηλέφωνο 1','Διεύθυνση','2019-4-1'),
('Διευθυντής','admin','1234','admin@hotmail.com','Γιώργος','Γερωγίου','1970-10-31','6923458713','-','Κολοκοτρώνη 45','2005-3-1');


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

INSERT INTO patient VALUES 
('Γιάννης','Παπαδημούλης','6900000000','000000','0','000000','Άνδρας','80'),
('Γιώργος','Παπαδημούλης','6911111111','111111','1','111111','Άνδρας','22'),
('Ανδρέας','Κωνσταντίνου','6922222222','222222','2','222222','Άνδρας','32'),
('Λευτέρης','Ράπτης','6933333333','333333','3','333333','Άνδρας','76'),
('Μαρίνα','Ανδρέου','6944444444','444444','4','444444','Γυναίκα','38'),
('Γεωργία','Αντωνοπούλου','6955555555','555555','5','555555','Γυναίκα','59'),
('Αντώνης','Δράκος','6966666666','666666','6','666666','Άνδρας','36'),
('Αλέξης','Αλεξίου','6977777777','777777','7','777777','Άνδρας','50'),
('Παναγιώτης','Ντίνος','6988888888','888888','8','888888','Άνδρας','56'),
('Νικόλαος','Παπαντωνίου','6999999999','999999','9','999999','Άνδρας','45');

CREATE TABLE patient_room(
  AMKA VARCHAR(25) NOT NULL,
  room SMALLINT(3),
  PRIMARY KEY(AMKA,room),
  CONSTRAINT PATIENTROOM FOREIGN KEY (AMKA) REFERENCES patient(AMKA) ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;

INSERT INTO patient_room VALUES 
('000000','0'),
('111111','1'),
('222222','2'),
('333333','3'),
('444444','4'),
('555555','5'),
('666666','6'),
('777777','7'),
('888888','8'),
('999999','9');


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

INSERT INTO patient_treatment VALUES 
('000000','Πόνος στο στομάχι','Παρκολούθηση και εξετάσεις','Lipitor','10:00:00','0','50','20','0','09:50:00'),
('111111','Πόνος στο στομάχι','Παρκολούθηση και εξετάσεις','Lipitor','10:00:00','0','50','20','0','09:50:00'),
('222222','Διάστρεμμα','Δέσιμο και ακινησία','Vicodin','11:00:00','0','60','22','0','10:46:00'),
('333333','Ζαλάδα','Παρακολούθηση και εξετάσεις','Norco','11:00:00','0','55','12','0','16:10:00'),
('444444','Τραύμα απο σφαίρα','Χειρουργείο','Xodol','09:00:00','0','150','100','0','12:45:00'),
('555555','Πόνος στην κοιλιά','Παρακολούθηση και εξετάσεις','Levoxyl','10:00:00','0','20','07','0','13:49:00'),
('666666','Σπασμένα πλευρά','Ακινησία και εξετάσεις','Delasone','08:00:00','0','25','15','0','08:50:00'),
('777777','Μετατραυματικό στρες','Ψυχολογική αξιολόγηση','Zofran','13:00:00','0','78','40','0','18:35:00'),
('888888','Τροχαίο','Εισαγωγή εξετάσεις και ορό','Motrin','10:00:00','0','64','31','0','14:22:00'),
('999999','Κομμένο δάχτυλο','Σταματάμε το αίμα και χειρουργείο','Xodol','11:00:00','0','40','24','0','11:31:00');



CREATE TABLE patient_appointment(
  AMKA VARCHAR(25) NOT NULL,
  doc_user VARCHAR(25),
  date DATE,
  time TIME,
  PRIMARY KEY(AMKA,date,time),
  CONSTRAINT PATIENTAPPOINTMENT FOREIGN KEY (AMKA) REFERENCES patient(AMKA) ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;

INSERT INTO patient_appointment VALUES 
('000000','nikos','2019-12-01','13:00:00'),
('111111','nikos','2019-12-01','14:00:00'),
('222222','john','2019-12-02','13:00:00'),
('333333','john','2019-12-02','14:00:00'),
('444444','aris','2019-12-01','13:00:00'),
('555555','aris','2019-12-01','14:00:00');


CREATE TABLE worker_schedule(
  username VARCHAR(25),
  date DATE,
  time TIME,
  PRIMARY KEY(username,date,time),
  CONSTRAINT worker_id FOREIGN KEY (username) REFERENCES users(username) ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;

INSERT INTO worker_schedule VALUES 
('nikos','2019-12-01','13:00:00'),
('nikos','2019-12-01','14:00:00'),
('john','2019-12-02','13:00:00'),
('john','2019-12-02','14:00:00'),
('aris','2019-12-01','13:00:00'),
('aris','2019-12-01','14:00:00');


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

INSERT INTO patient_history VALUES
('Γιάννης','Παπαδημούλης','6900000000','000000','0','000000','Άνδρας','80','Κοιλιακή διαταραχή','Εξετάσεις εισαγωγή και ορό','Amoxil','25','10','2017-01-08 12:22:00'),
('Λευτέρης','Ράπτης','6933333333','333333','3','333333','Άνδρας','76','Ζαλάδα','Παρακολούθηση και εξετάσεις','Norco','64','18','2015-07-15 09:52:00');

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
('nikos',2500),
('john',2189),
('aris',3015),
('marios',1985),
('vaggelis',2000),
('kostas',2956),
('giorgos',3000),
('aristotelis',2547),
('giannis',1500),
('aggelos',2156),

('Νοσηλευτής',1500),
('sofia',1500),
('andreas',1500),
('maria',1500),
('marianna',1500),
('konstantina',1500),
('aggeliki',1500),
('gewrgia',1500),
('giwta',1500),
('ilia',1500),
('anastasia',1500),

('Γραμματέας',1300),
('thodoris',1300),
('pagwna',1300),
('vasilis',1300),
('antonia',1300),
('theodwra',1300),

('Αποθηκάριος',1000),
('antonis',1000),
('nikolas',1000),
('mairi',1000),

('Διευθυντής',5000),
('admin',5000);	