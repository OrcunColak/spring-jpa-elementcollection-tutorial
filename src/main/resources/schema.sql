-- ElementCollection example
CREATE TABLE IF NOT EXISTS employee (
  id BIGINT NOT NULL,
  name VARCHAR(255),
  primary key (id)
  );

CREATE TABLE IF NOT EXISTS employee_phone_numbers (
  employee_id BIGINT NOT NULL,
  phone_numbers VARCHAR(255)
);

ALTER TABLE IF EXISTS employee_phone_numbers ADD CONSTRAINT employee_phone_numbers_fk FOREIGN KEY (employee_id) REFERENCES employee;

CREATE TABLE IF NOT EXISTS employee_contacts (
  employee_id bigint not null,
  contact_details varchar(255),
  contact_type varchar(255) not null,
  primary key (employee_id, contact_type)
);

ALTER TABLE IF EXISTS employee_contacts ADD CONSTRAINT employee_contacts_fk FOREIGN KEY (employee_id) REFERENCES employee;

-- Embeddable ElementCollection example
CREATE TABLE IF NOT EXISTS person (
  id BIGINT NOT NULL,
  name VARCHAR(255),
  primary key (id)
);

CREATE TABLE IF NOT EXISTS person_phone_numbers (
  person_id BIGINT NOT NULL,
  number VARCHAR(255)
);

ALTER TABLE IF EXISTS person_phone_numbers ADD CONSTRAINT person_phone_numbers_fk FOREIGN KEY (person_id) REFERENCES person;
