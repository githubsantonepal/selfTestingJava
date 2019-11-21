/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calling_class_from_main;

import java.util.Scanner;

/**
 *
 * @author santoshji
 */
public class TestArgumentInstanceVar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Object for getting user input
        Scanner scannerObj=new Scanner(System.in);
        
        //creating object for user-defined class
        MessageArgumentInstanceVar messageObj=new MessageArgumentInstanceVar();
        System.out.print("Enter your full Name of your Girlfriend--->>>");
        String temp=scannerObj.nextLine();
        messageObj.copyName(temp);
        messageObj.saying();
    }
    
}
