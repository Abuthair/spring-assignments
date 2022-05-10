package com.course.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Trainer {
    @Id
    @GeneratedValue(generator = "trainer_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "trainer_gen",sequenceName = "trainer_sequence",initialValue = 100,allocationSize = 1)
    @ToString.Exclude
    private Integer trainerId;
    @Column(length = 30)
    private String trainerName;
    private double ratings;
    private int experience;
    @Column(length = 30)
    private String techStack;
    private LocalDate joiningDate;
    @ToString.Exclude
    @ManyToMany(mappedBy = "trainers")//mapped by owner

    private Set<Course> courses ;

    public Trainer(String trainerName, double ratings, int experience, String techStack, LocalDate joiningDate) {
        this.trainerName = trainerName;
        this.ratings = ratings;
        this.experience = experience;
        this.techStack = techStack;
        this.joiningDate = joiningDate;
    }
}
