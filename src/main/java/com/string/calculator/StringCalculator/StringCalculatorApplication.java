package com.string.calculator.StringCalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.string.calculator.exception.NegativeNumberException;

@SpringBootApplication
public class StringCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringCalculatorApplication.class, args);
		StringCalculator strCal=new StringCalculator();
		try {
			strCal.Add("//[aa][b]\n1aa2b15");
		}catch(NegativeNumberException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
