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
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Message messageObj=new Message();
        messageObj.simpleMessage();
        messageObj.simpleMessage1();
        messageObj.simpleMessage2();
        messageObj.simpleMessage3();
        
    }
    
}
