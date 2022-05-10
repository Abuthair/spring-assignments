package com.employee.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "Biaddress")
public class BiAddress {
    @Id
    @GeneratedValue(generator ="address_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "address_gen",sequenceName = "address_sequence",allocationSize = 1,initialValue = 1)
    private Integer addressId;
    @Column(length = 30)
    private String city;
    @Column(length = 20)
    private String state;
    private long zipcode;
//mappedBy is used to tell which class is the owner of this relationship
    //in our case its employee which has biAddress
    //
    @OneToOne(mappedBy = "biAddress")
    private  Employee employee;

    public BiAddress(String city, String state, long zipcode) {
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;

    }

    @Override
    public String toString() {
        return "BiAddress{" +
                "addressId=" + addressId +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
