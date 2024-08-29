/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primrnumber;

import java.util.Scanner;

/**
 *
 * @author nagar
 */
public class Primrnumber {

    public static void main(String[] args) {
        int i=2,num;
        System.out.println("Hello World!");
        System.out.println("Ënter a number :");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        while(i<num){
          if(num%i==0)
              break;
          i++;
        }
        if(i==num){
          System.out.println("Hello World! it a primr number");
        }
        else{
              System.out.println("Hello World! it not a primr number");
        }
        
    }
}
