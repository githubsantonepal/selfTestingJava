/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calling_class_from_main;

/**
 *
 * @author santoshji
 */
public class MessageWithArgumentPassing {
    public void simpleMessage(String name){
        System.out.println("This is first simpleMessage Method Mr/Ms. "+name.trim());
    }
    public void simpleMessage1(String name){
        System.out.println("This is second simpleMessage Method Mr/Ms. "+name.trim());
    }
    public void simpleMessage2(String name){
        System.out.println("This is third simpleMessage Method Mr/Ms. "+name.trim());
    }
    public void simpleMessage3(String name){
        System.out.println("This is fourth simpleMessage Method Mr/Ms. "+name.trim()) ;
    } 
    
}
