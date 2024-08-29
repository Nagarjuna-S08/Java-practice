/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstracteg;

abstract class hello{
    abstract public void twonum(int i,int e);
    abstract void threenum(int i,int e,int g);
}
class toimplement extends hello{
       public void twonum(int i,int e){
        System.out.println("answer :"+(i+e));
    }
     void threenum(int i,int e,int g){
          System.out.println("answer :"+(i+e+g));
     }

}
class naga extends toimplement {
     
    public static int threenuma(int i,int e,int g){
          System.out.println("answer :"+(i+e+g));
          return 0;
     }

}
public class Abstracteg extends naga{
   
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int i=89,g=68,e=45;
        toimplement aa=new toimplement();
        aa.threenum(i,e,g);
        aa.twonum(i,g);
        threenuma(i,e,g);
    }
}
