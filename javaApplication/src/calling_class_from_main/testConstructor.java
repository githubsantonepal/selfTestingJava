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
public class testConstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scannerObj=new Scanner(System.in);
        
        System.out.println("Enter your Name and Age");
        String name=scannerObj.nextLine();
        byte age=scannerObj.nextByte();
       
        TestOverloadingConstructor tolcObj= new TestOverloadingConstructor(name);
        TestOverloadingConstructor tolcObj1= new TestOverloadingConstructor(name,age);
    }
    
}
