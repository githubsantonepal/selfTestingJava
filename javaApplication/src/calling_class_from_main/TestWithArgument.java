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
public class TestWithArgument {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Object for getting user input
        Scanner scannerObj=new Scanner(System.in);
        
        //creating object for user-defined class
        MessageWithArgumentPassing messageObj=new MessageWithArgumentPassing();
        System.out.print("Enter your full Name--->>>");
        String name=scannerObj.nextLine();
        messageObj.simpleMessage(name);
        messageObj.simpleMessage1(name);
        messageObj.simpleMessage2(name);
        messageObj.simpleMessage3(name);
        
    }
    
}
