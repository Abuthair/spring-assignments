package com.employee;

import com.employee.model.BiAddress;
import com.employee.model.Employee;
import com.employee.service.IBiAddressService;
import com.employee.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDatajpaOnetoonebiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetoonebiApplication.class, args);
	}
@Autowired
	//IEmployeeService iEmployeeService;
	IBiAddressService iBiAddressService;
	@Override
	public void run(String... args) throws Exception {
		BiAddress biAddress = new BiAddress("Chennai","TamilNadu",60005);
		Employee employee = new Employee("Abuthair","Devoloper",biAddress);
		BiAddress biAddress1 = new BiAddress("Madurai","TamilNadu",20006);
		Employee employee1 = new Employee("Balajee","Testing",biAddress1);
		BiAddress biAddress2 = new BiAddress("Bangalore","Karnataka",30005);
	//	Employee employee2 = new Employee("Awadhesh","ProjectManager",biAddress2);
		//iEmployeeService.addEmployee(employee);
//		iEmployeeService.addEmployee(employee1);
		//iEmployeeService.addEmployee(employee2);

	//	iEmployeeService.getAll().forEach(System.out::println);
		//	iEmployeeService.getByDepartAndCity("ProjectManager","Bangalore").forEach(System.out::println);
		//iEmployeeService.getByCity("Chennai").forEach(System.out::println);
		//iEmployeeService.getByState("TamilNadu").forEach(System.out::println);

//		iBiAddressService.getByCity("Madurai").forEach(System.out::println);
//		iBiAddressService.getByNameAndZipcode("Abuthair",60005).forEach(System.out::println);
		iBiAddressService.getByNameAndCity("Abuthair","Chennai").forEach(System.out::println);
	}

}
