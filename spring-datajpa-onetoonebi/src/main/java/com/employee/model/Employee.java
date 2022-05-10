package com.employee.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@ToString
public class Employee {
    @Id
    @GeneratedValue(generator = "emp_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "emp_gen",sequenceName = "emp_sequence",initialValue = 1,allocationSize = 1)

    private Integer employeeId;
    @Column(length = 30)
    private String name;
    @Column(length = 20)
    private String department;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private BiAddress biAddress;

    public Employee(String name, String department, BiAddress biAddress) {
        this.name = name;
        this.department = department;
        this.biAddress = biAddress;
    }
}
