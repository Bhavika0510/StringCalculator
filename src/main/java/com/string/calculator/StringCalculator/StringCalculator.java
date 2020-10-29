package com.string.calculator.StringCalculator;

import java.util.ArrayList;

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
		     // String delimiterStr="";
		      ArrayList<String>	 delimiterList=new ArrayList<String>();
		      int index=0;
		      if(numbers.startsWith("//")){
		        index=numbers.indexOf("\n");
		        delimiter=numbers.substring(2,index);
		        if(delimiter.startsWith("[") && delimiter.endsWith("]")) {
		        	delimiter=delimiter.substring(1,delimiter.length()-1);
		        	delimiter=delimiter.replaceAll("\\]","");
		        	delimiter=delimiter.replaceAll("\\[","|");
	//	        	delimiter=delimiter.replaceAll("\\*","\\\\*");
//		        	for(int k=0;k<delimiterArr.length;k++) {
//		        		delimiterList.add(delimiterArr[k]);
//		        	}
		        }
		       
		        System.out.println(delimiter);
		        index=index+1;
		        numbers=numbers.substring(index);
		         System.out.println(delimiter);
		        System.out.println(numbers);
		      }
		       numbers=numbers.replaceAll("\n",delimiter);
		     
		      String[] numberArray=numbers.split(delimiter);
		      System.out.println(numberArray[0]);
		      for(int i=0;i<numberArray.length;i++){
		    	  System.out.println(numberArray[i]);
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
