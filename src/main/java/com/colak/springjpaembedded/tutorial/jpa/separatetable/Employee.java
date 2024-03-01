package com.colak.springjpaembedded.tutorial.jpa.separatetable;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.Set;

@Entity

@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ElementCollection
    // These annotations are optional. If not provided Hibernate will create exactly same annotations
    @CollectionTable(name = "employee_phone_numbers", joinColumns = @JoinColumn(name = "employee_id"))
    @Column(name = "phone_numbers")
    private Set<String> phoneNumbers;

    @ElementCollection
    // These annotations are optional. If not provided Hibernate will create exactly same annotations
    @CollectionTable(name = "employee_contacts", joinColumns = @JoinColumn(name = "employee_id"))
    @MapKeyColumn(name = "contact_type")
    @Column(name = "contact_details")
    private Map<String, String> contacts;

}

