/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriestask1;

import java.util.Scanner;

/**
 *
 * @author DIVYA
 */
public class SeriesTask1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("enter 3 values::");
        Scanner s=new Scanner(System.in);
        int value1=s.nextInt();
        int value2=s.nextInt();
        int value3=s.nextInt();
        System.out.println("Output - "+(value1+value3)*value2);
        
    }
    
}
