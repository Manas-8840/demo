package com.ashok;
import com.ashok.EmpRepository.EmpRepository;
import com.ashok.entity.Address;
import com.ashok.entity.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		EmpRepository empRepo = context.getBean(EmpRepository.class);
		Employee e=new Employee();
		e.setEmpName("mike");
		e.setSalary(4000.0);
		Address add1=new Address();
		add1.setCity("mumbai");
		add1.setState("maharashtra");
		add1.setEmp(e);

		Address add2=new Address();
		add2.setCity("delhi");
		add2.setState("delhi");
		add2.setEmp(e);
		List<Address> list = Arrays.asList(add1, add2);
		e.setAddr(list);
		empRepo.save(e);


	}

	}


