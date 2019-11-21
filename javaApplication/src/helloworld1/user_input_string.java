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
public class user_input_string {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your full Name::");
        String full_name=scanner.nextLine().trim();
        System.out.println("Your are Mr/Ms "+full_name);
    }
    
}
