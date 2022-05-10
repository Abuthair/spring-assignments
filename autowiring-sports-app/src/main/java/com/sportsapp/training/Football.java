package com.sportsapp.training;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component("football")
public class Football implements ISport{
    @Override
    public List<String> showPlayers() {
        List<String> stringList = Arrays.asList("Ramos","Benzema","Vini","Kroos","Pogba");
        return stringList;
    }
}
