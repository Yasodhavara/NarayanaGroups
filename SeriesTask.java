/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriestask;

import java.util.Scanner;

/**
 *
 * @author DIVYA
 */
public class SeriesTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number1=1,number2;
        number1=1;
        Scanner s=new Scanner(System.in);
        int inputvalue=s.nextInt();
        
        System.out.print("series : "+ number1+" ");
        
        
        for(int i=2;i<=inputvalue;i++)
        {
            number2=number1*2+2;
            System.out.print(number2+" ");
            number1=number2;
            
        }
        System.out.println("Output:"+number1);
        
    }
    
}
