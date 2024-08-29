/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ownexception;

import java.util.Scanner;

class ownex extends Exception{
 ownex(String a){
     super(a);
     System.out.println("yu cant divide with 0 pla check and try again");
  
 }
}
public class Ownexception {

    public static void main(String[] args) throws ownex {
        int a=10,b;
        Scanner s=new Scanner(System.in);
        System.out.print("Emter data to divide :");
        b=s.nextInt();
        try{
        if(b==0){
          throw new ownex("cannot accept zero");
        }
        else{
            System.out.print("\n"+a/b+"\n");
        }
        }
        catch(ownex e){
          System.out.print(e.getMessage());
        }
    }
}
