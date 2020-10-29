package com.string.calculator.StringCalculator;

import com.string.calculator.exception.NegativeNumberException;

/**
 * @author Bhavika
 *  
 *  calculating sum of numbers provided as string separated by delimiter
 *
 */
public class StringCalculator {

	public int Add(String numbers) throws NegativeNumberException{
		     if(numbers.equals("")){
		      System.out.println("Sum of Numbers = "+ 0);
		      return 0;
		    }else{
		      int sum=0;
		      String delimiter=",";
		      int index=0;
		      if(numbers.startsWith("//")){
		        index=numbers.indexOf("\n");
		        delimiter=numbers.substring(2,index);
		        index=index+1;
		        numbers=numbers.substring(index);
		         System.out.println(delimiter);
		        System.out.println(numbers);
		      }
		       numbers=numbers.replaceAll("\n",delimiter);
		      String[] numberArray=numbers.split(delimiter);
		      for(int i=0;i<numberArray.length;i++){
		        int number=Integer.parseInt(numberArray[i]);
		        if(number<0){
		          
		          throw new NegativeNumberException("Negative Number","Negatives not allowed");
		        }
		        if(number>1000){
		          number=0;
		        }
		        sum+=number;
		      }
		      System.out.println("Sum of Numbers = "+ sum);
		      return sum;
		      
		    }
		  }
		}
