/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author santoshji
 */
public class user_input_different_value {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Name, Age and Salary");
        String full_name=scanner.nextLine().trim();
        int age=scanner.nextInt();
        double salary=scanner.nextDouble();
        
        System.out.println("You are Mr/Ms. "+full_name+" of Age "+age+ " earns "+(NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(salary)));
        
        
    }
    
}
