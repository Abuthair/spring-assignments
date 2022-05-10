package com.sportsapp.training;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
@Component
public class Cricket  implements  ISport{
    @Override
    public List<String> showPlayers() {
       List<String>  players = Arrays.asList("Virat","ABD","Dhoni","Suresh Raina","Clark");
        return players;
    }
}
