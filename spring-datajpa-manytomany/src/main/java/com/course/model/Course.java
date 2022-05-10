package com.course.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;


@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
public class Course {
    @Id
    @GeneratedValue(generator = "course_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "course_gen",sequenceName = "course_sequence",initialValue = 1,allocationSize = 1)
    @ToString.Exclude
    private  Integer courseId;
    @Column(length = 60)
    private String courseName;
    @Column(length = 30)
    private String category;

    private  double fees;

    private int durationInDays;
    @ToString.Exclude
    @ManyToMany(cascade = {CascadeType.MERGE})
    @JoinTable(
            name = "course_trainer",
            joinColumns ={
                    @JoinColumn(name = "course_id")//refers to the primary key of the owner entity
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "trainer_id")//refers to primary key with other entity
            }
    )
    private Set<Trainer> trainers;

    public Course(String courseName, double fees, int durationInDays,String category) {
        this.courseName = courseName;
        this.fees = fees;
        this.durationInDays = durationInDays;
        this.category=category;
    }
}
