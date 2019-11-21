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
public class TestOverloadingConstructor {
    public TestOverloadingConstructor(String name){
        System.out.println(" This first constructor Mr/Ms. "+name);
    }
    public TestOverloadingConstructor(String name, byte age){
        System.out.println("This is second constructor Mr/Ms. "+name+" of Age "+age);
    }
    
    
}
