package com.DomaciIzWeba.Web;

import com.DomaciIzWeba.Web.entity.Employee;
import com.DomaciIzWeba.Web.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class WebApplication implements CommandLineRunner {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) {

		// kreiramo novi objekat klase Employee
		Employee employee = new Employee();
		employee.setFirstName("Jovanka");
		employee.setLastName("Jovkić");
		employee.setPosition("radnik");

		// čuvamo objekat u bazi
		this.employeeRepository.save(employee);

		List<Employee> employees = this.employeeRepository.findAll();
//		List<Employee> employees = this.employeeRepository.findAllByPositionOrderByFirstName("radnik");
//		List<Employee> employees = this.employeeRepository.findByFirstNameOrLastName("Aleksandar", "Milić");
//		List<Employee> employees = this.employeeRepository.findByFirstNameIgnoreCase("jovanka");
//		List<Employee> employees = this.employeeRepository.findByDepartmentName("Menadžment");

		for (Employee e : employees){
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

}
