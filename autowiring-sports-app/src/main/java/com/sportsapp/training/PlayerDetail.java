package com.sportsapp.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class PlayerDetail {

    ISport iSport;
    @Autowired
    ISport cricket;

    @Autowired
    ISport basketball;

    @Autowired
    ISport football;

    List<String> printDetails(String choice) {
        System.out.println("show Details");
        if (choice.equalsIgnoreCase("cricket"))
            return cricket.showPlayers();
        if (choice.equalsIgnoreCase("BasketBall"))
            return  basketball.showPlayers();
        if(choice.equalsIgnoreCase("football"))
            return football.showPlayers();

        return null;
    }
}