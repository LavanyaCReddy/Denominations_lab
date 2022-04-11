package com.greatlearning;

import java.util.Arrays;

public class Denominations {
	int [] denominations;
    int [] counter;
    int amount;
    int index;
    public void sortDenominations(){
        Arrays.sort(denominations);
        counter = new int[denominations.length];
    }

    public void minDenominations(){
        if(amount>0){
            if(index<0){
                System.out.println("Not payable");
            }
            else {

                while (denominations[index] > amount) {
                   index--;
                }
                counter[index] = amount/denominations[index];
                amount = amount - denominations[index] * (amount / denominations[index]);
                index--;
                minDenominations();
            }
        }
       
    }
    public void printDenominations(){
        minDenominations();
        if(amount==0) {
            for (int i = 0; i < denominations.length; i++) {
                if (counter[i] > 0) {
                    System.out.println(denominations[i] + ":" + counter[i]);
                }
            }
        }
    }

}


