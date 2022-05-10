package com.sportsapp.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.naming.Context;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.sportsapp.training");
        PlayerDetail playerDetail = context.getBean("playerDetail",PlayerDetail.class);
        System.out.println(playerDetail.printDetails("cricket"));

        System.out.println(playerDetail.printDetails("basketball"));

        System.out.println(playerDetail.printDetails("football"));


    }
}
