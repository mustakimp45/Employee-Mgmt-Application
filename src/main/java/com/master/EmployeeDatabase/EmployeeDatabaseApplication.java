package com.master.EmployeeDatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Scanner;

@SpringBootApplication

public class EmployeeDatabaseApplication {

	public static void main(String[] args) {

//		Scanner sc=new Scanner(System.in);
//		System.out.println("Please enter your name...");
		SpringApplication.run(EmployeeDatabaseApplication.class, args);
//		System.out.println("My name is Mustakim");

	}

}
