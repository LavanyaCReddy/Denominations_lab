package com.greatlearning;

import java.util.Scanner;


public class DriverMain {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        Denominations d1 = new Denominations();
	        System.out.println("Enter the size of currency denominations:");
	        int numDenominations = in.nextInt();
	        d1.denominations =new int[numDenominations];
	        System.out.println("Enter the currency denominations value:");
	        for(int i=0;i<numDenominations;i++){
	            d1.denominations[i]= in.nextInt();
	            if(d1.denominations[i]==0){
	                throw new java.lang.RuntimeException("Denomination cannot be zero");
	            }
	        }
	        System.out.println("Enter the amount you want to pay:");
	        d1.amount = in.nextInt();
	        d1.index = numDenominations-1;
	        System.out.println("Your payment approach in order to give min no of notes will be:");
	        d1.sortDenominations();
	        d1.printDenominations();
	    }
	}






