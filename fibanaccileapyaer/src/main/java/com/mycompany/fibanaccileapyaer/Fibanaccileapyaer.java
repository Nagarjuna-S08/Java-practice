/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibanaccileapyaer;

import java.util.Scanner;

/**
 *
 * @author nagar
 */
class leapyear{
 int year;
 public void findleap(){
        if((year%4==0)&&(year%100!=0)||year%400==0){
            System.out.println("Hello World! its a leap yaer");  
       }
        else{
            System.out.println("Hello World! its not a leap yaer");
       }
       }
}
class fiba{
public int fibanacci(int n){
        return ((n<=1)?n:fibanacci(n-1)+fibanacci(n-2));
}
}
public class Fibanaccileapyaer {

    public static void main(String[] args) {
        int i=1;
        System.out.println("Hello World!");
        do
        {
        System.out.println("Enter your choice :");
        Scanner s=new Scanner(System.in);
        int c=s.nextInt();
        switch(c){
            case 1:
                System.out.println("Enter how many terms:");
                int m=s.nextInt();
                fiba f=new fiba();
                for(int p=0;p<m;p++){
                System.out.println(f.fibanacci(p)+"   ");
                }
                break;
            case 2:
                 System.out.println("Ente the year :");
                 m=s.nextInt();
                 leapyear a=new leapyear();
                 a.year=m;
                 a.findleap();
                 break;
        }
        }while(i==1);        
    }
}
