/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pc2;

/**
 *
 * @author nagar
 */
public class Pc2 {

    public static int add(int t){
        int even=0;
        int odd=0;
        int r,s,sum=0;
        s=t;
        for(int i=0;i<4;i++){
           r=s%10;
           if(r%2==0){
              even+=r;   
           }
           else{
               odd+=r;
           }
            s=s/10;
        }
        
        return even;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int a=5678,b=5943,c=3974,d=6783,e=34;
        int r=0;
        
        if(e%2==0){
           
        }
        
        System.out.println(r);
        
    }
}
