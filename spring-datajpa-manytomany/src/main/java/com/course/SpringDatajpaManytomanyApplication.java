package com.course;

import com.course.model.Category;
import com.course.model.Course;
import com.course.model.TechStack;
import com.course.model.Trainer;
import com.course.service.ICourseService;
import com.course.service.ITrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SpringDatajpaManytomanyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaManytomanyApplication.class, args);
	}
@Autowired
	ITrainerService iTrainerService;

	public void setiTrainerService(ITrainerService iTrainerService) {
		this.iTrainerService = iTrainerService;
	}

	@Autowired
	ICourseService iCourseService;

	public void setiCourseService(ICourseService iCourseService) {
		this.iCourseService = iCourseService;
	}

	@Override
	public void run(String... args) throws Exception {
		Trainer trainer = new Trainer("Madhu",3.5,4, TechStack.FULLSTACK.name(), LocalDate.of(2022,5,22));
		//iTrainerService.addTrainer(trainer);
		//get the trainer by id
		Trainer trainer1 = new Trainer("Odhja",5,12, TechStack.FRONTEND.name(), LocalDate.of(2022,1,11));
		Trainer trainer2 = iTrainerService.getById(100);
		Trainer trainer3= iTrainerService.getById(106);
        Set<Trainer> trainers = new HashSet<>(Arrays.asList(trainer2,trainer3));
		Course course = new Course("Angular in 10 days",15000,30, Category.FRONTEND.name());
		course.setTrainers(trainers);
		//iCourseService.addCourse(course);

		//iCourseService.getAll().forEach(System.out::println);
		//iCourseService.getByNameContaining("Angular").forEach(System.out::println);
		//iCourseService.getByNameAndFees("JAVA in 10 days",6000).forEach(System.out::println);
		//iCourseService.getByNameContaining("Angular").forEach(System.out::println);
	//	iCourseService.getByTrainer("Abuthair").forEach(System.out::println);
 //iTrainerService.getAll().forEach(System.out::println);
		//iTrainerService.getByCourseNamePrice("Angular in 10 days",15000).forEach(System.out::println);
		//iTrainerService.getByNameDuratio("Angular in 10 days",30).forEach(System.out::println);
	}
}
