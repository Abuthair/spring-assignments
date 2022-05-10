package com.player.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

public class Player {
    @Id
    @GeneratedValue(generator = "player_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "player_gen",sequenceName = "player_sequence",allocationSize = 1,initialValue = 1)
    private Integer playerId;
    @Column(length = 40)
    private String name;
    @Column(length = 50)
    private String country;
    @Column(length = 60)
    private String batting;
    @Column(length = 60)
    private  String bowling;
    @Column(length = 50)
    private String specialist;
    @Column(length = 50)
    private String stateTeam;
    @Column(length = 80)
    private String iplTeam;
    private double basePrice;

}
