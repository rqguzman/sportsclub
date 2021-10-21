-- TEMPLATE CLIENT
INSERT INTO tb_client (first_name, last_name, date_of_birth) VALUES ('Rafael', 'Guzmán', '1973-05-02');
INSERT INTO tb_client (first_name, last_name, date_of_birth) VALUES ('Daniel', 'Queiroz', '1974-12-12');
INSERT INTO tb_client (first_name, last_name, date_of_birth) VALUES ('Pedro', 'Torres', '1973-01-11');

-- TEMPLATE SPORTS
INSERT INTO tb_sport (description) VALUES ('Natação');
INSERT INTO tb_sport (description) VALUES ('Jiu-Jitsu');
INSERT INTO tb_sport (description) VALUES ('Karatê');
INSERT INTO tb_sport (description) VALUES ('Basquete');
INSERT INTO tb_sport (description) VALUES ('Futebol');

-- TEMPLATE CONTACT
INSERT INTO tb_contact (client_id, address, email, phone) VALUES ('1', 'Rua das Laranjeiras, 15', 'rafael@email.com', '(21) 1234-5678');
INSERT INTO tb_contact (client_id, address, email, phone) VALUES ('2', 'Avenida do Senado, 573', 'daniel@email.com', '(21) 5678-1234');
INSERT INTO tb_contact (client_id, address, email, phone) VALUES ('3', 'Praça das Goiabeiras, 485', 'pedro@email.com', '(21) 4321-8756');

-- TEMPLATE ENROLLMENTS
INSERT INTO tb_enrollment (client_id, sport_id, enroll_moment, last_payment, active) VALUES (1, 1, TIMESTAMP WITH TIME
ZONE '2021-10-20T17:50:00Z', '2021-10-20', true);
INSERT INTO tb_enrollment (client_id, sport_id, enroll_moment, last_payment, active) VALUES (1, 2, TIMESTAMP WITH TIME
ZONE
'2021-03-20T15:30:00Z', '2021-10-20', true);
INSERT INTO tb_enrollment (client_id, sport_id, enroll_moment, last_payment, active) VALUES (1, 3, TIMESTAMP WITH TIME
ZONE
'2021-07-20T13:27:00Z', '2021-10-20', true);
INSERT INTO tb_enrollment (client_id, sport_id, enroll_moment, last_payment, active) VALUES (1, 4, TIMESTAMP WITH TIME
ZONE
'2021-05-20T20:46:00Z', '2021-10-20', true);
INSERT INTO tb_enrollment (client_id, sport_id, enroll_moment, last_payment, active) VALUES (2, 1, TIMESTAMP WITH TIME
ZONE
'2021-01-20T21:39:00Z', '2021-10-20', true);
INSERT INTO tb_enrollment (client_id, sport_id, enroll_moment, last_payment, active) VALUES (2, 5, TIMESTAMP WITH TIME
ZONE
'2021-04-20T10:11:00Z', '2021-10-20', true);
INSERT INTO tb_enrollment (client_id, sport_id, enroll_moment, last_payment, active) VALUES (3, 1, TIMESTAMP WITH TIME
ZONE
'2021-06-20T12:15:00Z', '2021-10-20', true);
INSERT INTO tb_enrollment (client_id, sport_id, enroll_moment, last_payment, active) VALUES (3, 5, TIMESTAMP WITH TIME
ZONE
'2021-09-20T14:54:00Z', '2021-10-20', true);