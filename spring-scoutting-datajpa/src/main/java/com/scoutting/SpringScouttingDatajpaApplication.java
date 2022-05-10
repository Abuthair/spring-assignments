package com.scoutting;

import com.scoutting.model.Hander;
import com.scoutting.model.Scoutting;
import com.scoutting.model.Specialist;
import com.scoutting.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringScouttingDatajpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringScouttingDatajpaApplication.class, args);
	}
@Autowired
	IPlayerService iPlayerService;
	@Override
	public void run(String... args) throws Exception {
		Scoutting scoutting = new Scoutting("Abuthair","Poland", Hander.LEFT, Specialist.BATSMAN,1500);
//	iPlayerService.addPlayer(scoutting);
//iPlayerService.getByCountry("India").forEach(System.out::println);
//		iPlayerService.deletePlayer(104);
	//iPlayerService.getByHander(Hander.RIGHT).forEach(System.out::println);
//		iPlayerService.getBySpecialist(Specialist.BATSMAN).forEach(System.out::println);
//	iPlayerService.getByName("Abuthair").forEach(System.out::println);
//  iPlayerService.getByRangePrice(1000,2500).forEach(System.out::println);
//		iPlayerService.getByCountryAndHander("India",Hander.RIGHT).forEach(System.out::println);
//		iPlayerService.getBySpecialistAndCountry(Specialist.BATSMAN,"India").forEach(System.out::println);
//  iPlayerService.getByNameAndCountry("Abuthair","Poland").forEach(System.out::println);
	}
}
