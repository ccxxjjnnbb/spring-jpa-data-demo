package io.github.ccxxjjnnbb.jpa.demo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Student {
    @Id
    private String number;
    private String name;
    @ManyToOne
    private School school;
}
