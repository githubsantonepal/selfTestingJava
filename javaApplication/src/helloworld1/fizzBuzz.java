/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld1;

import java.util.Scanner;

/**
 *
 * @author santoshji
 */
public class fizzBuzz {
    public static void main(String [] args){
        final byte VALUE_FIVE=5;
        final byte VALUE_THREE=3;
        Scanner scanner =new Scanner(System.in);
        System.out.print("Please Enter the number--->> ");
        int valueDivisibleCheck=scanner.nextInt();
        if((valueDivisibleCheck%VALUE_FIVE==0) && (valueDivisibleCheck%VALUE_THREE==0)){
            System.out.println("FIZZBUZZ");
        }
        else if(valueDivisibleCheck%VALUE_FIVE==0){
            System.out.println("FIZZ");
        }
        else if(valueDivisibleCheck%VALUE_THREE==0){
            System.out.println("BUZZ");
        }
        else {
            System.out.println("The number is "+valueDivisibleCheck);
        }
        
    }
}
