package com.sportsapp.training;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component("basketball")

public class BasketBall implements  ISport{
    @Override
    public List<String> showPlayers() {
       List<String>  list = Arrays.asList("Kobi","Curry","James","Jordon","O'Neal");
       return  list;
    }
}
