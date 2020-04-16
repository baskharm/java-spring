package com.sample.Spring;

import java.util.Random;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleWebApplication.class, args);
		int x, y, sum;
	    Scanner myObj = new Scanner(System.in); // Create a Scanner object
	    System.out.println("Type a number:");
	    x = myObj.nextInt(); // Read user input

	    System.out.println("Type another number:");
	    y = myObj.nextInt(); // Read user input

	    sum = x + y;  // Calculate the sum of x + y
	    System.out.println("Sum is: " + sum); 
	}

}
