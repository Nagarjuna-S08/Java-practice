/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pc1;

/**
 *
 * @author nagar
 */
public class Pc1 {

    public static void main(String[] args) {
      String a="hello";
      String b="naga";
      a=a+b;
      
      b=a.substring(0, a.length()-b.length());
      a=a.substring(b.length());
      System.out.println("a="+a+" b="+b);
      
      
    }
}
