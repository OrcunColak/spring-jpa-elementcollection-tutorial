package com.colak.springjpaembedded.tutorial.jpa.embeddable;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable

@Getter
@Setter
public class PhoneNumber {

    private String number;

}
