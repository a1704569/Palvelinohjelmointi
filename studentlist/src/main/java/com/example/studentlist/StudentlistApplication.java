package com.example.studentlist;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.studentlist.domain.Student;
import com.example.studentlist.domain.StudentRepository;

@SpringBootApplication
public class StudentlistApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentlistApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo (StudentRepository repository) {
		return (args)->{
			Student s1= new Student("John", "Johnson");
			Student s2= new Student("Matti", "Mettänen");
			Student s3= new Student("Teme", "Tämmönen");
			repository.save(s1);
			repository.save(s2);
			repository.save(s3);
		};
	}

}
