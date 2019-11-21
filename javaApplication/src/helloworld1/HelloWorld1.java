/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld1;
import java.awt.Point;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author santoshji
 */
public class HelloWorld1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //byte age=30;
        //long viewsCount=3_123_456_789L;
        //float price=10.99f;
        //char letter='A';
        //boolean isEligible=false;
        //System.out.println("MY age is:::"+age);
        //Date now=new Date();
        //System.out.println(now);
        //Point x = null;
        //Point y=null;
        //Point point1=new Point(2, 4);
        //Point point2=point1;
        //point1.x=3;
        //boolean pout2 = false;
        //System.out.println(pout2);
        
// Single dimensional Array
        int[] numbers=new int[3];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=23;
        System.out.println(Arrays.toString(numbers));
        //System.out.println(numbers);
// Multiple dimensional Array

        int[][] numbers1=new int[3][2];
        numbers1[0][0]=1;
        numbers1[0][1]=2;
        numbers1[1][0]=23;
        numbers1[1][1]=23;
        System.out.println(Arrays.deepToString(numbers1));
        //System.out.println(numbers1);
        
// Single dimensional Array
        int[] numbers2={23,34,56,65,65};
        System.out.println(Arrays.toString(numbers2));
        //System.out.println(numbers2);
// Multiple dimensional Array

        int[][] numbers3={{23,34,44},{34,34,21}};
        System.out.println(Arrays.deepToString(numbers3));
        //System.out.println(numbers3);      
        
        String x="1";
        int y = Integer.parseInt(x)+23;
        System.out.println(" The explcit typecasting value is:::"+y);
        
        
    }
    
}
