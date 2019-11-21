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
public class MessageArgumentInstanceVar {
    private String girlName;
    public void copyName(String name){
        girlName=name;
    }
    public String getName(){
        return girlName;
    }
    public void saying(){
        System.out.println("Your First Girlfriend is "+getName().trim());
    }
    
    
}
