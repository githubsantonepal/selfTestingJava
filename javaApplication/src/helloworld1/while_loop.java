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
public class while_loop {
    public static void main(String [] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("YOU Have Enter quit to Terminate the program");
        String input="";
        while(!input.equals("quit")){
            System.out.print("INPUT");
            input=scanner.next().toLowerCase();
        }
    }
}
