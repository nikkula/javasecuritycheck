package com.example.SampleAdding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleAddingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleAddingApplication.class, args);
		System.out.println("Sum is " + getSum(4,5));
	}

	public static int getSum(int num1, int num2) {
        return num1+num2;

    }
}
