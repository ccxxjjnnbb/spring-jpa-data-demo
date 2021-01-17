package io.github.ccxxjjnnbb.jpa.demo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class School {
    @Id
    private String number;
    private String name;
    @OneToMany(mappedBy = "school")
    private List<Student> students;
}
