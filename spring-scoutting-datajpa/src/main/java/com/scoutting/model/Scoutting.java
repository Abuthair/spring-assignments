package com.scoutting.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity


public class Scoutting {
    @Column(name = "player_Name",length = 30)
    private  String name;
    @Id
    @GeneratedValue(generator = "player_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "player_gen",sequenceName = "player_sequence",allocationSize =1,initialValue = 100)
    private  Integer playerId;
    @Column(name = "player_Country",length = 30)
    private  String country;
    @Enumerated(EnumType.STRING)
    private Hander hander;
    @Enumerated(EnumType.STRING)
    private Specialist specialist;
    @Column(name = "basePrice")
    private double basePrice;

    public Scoutting(String name, String country, Hander hander,Specialist specialist, double basePrice) {
        this.name = name;
        this.country = country;
        this.hander = hander;
        this.specialist = specialist;
        this.basePrice = basePrice;
    }
}

