/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.generictofindmaxmin;
class tofind<T extends Comparable<T>>{
      T a[];
      tofind(T o[]){
         a=o;
      }
      public T max(){
         T v=a[0];
         for(int i=0;i<a.length;i++){
            if(a[i].compareTo(v)>0){
               v=a[i];
            } 
         }
         return v;
      }
      public T min(){
          T v=a[0];
         for(int i=0;i<a.length;i++){
            if(a[i].compareTo(v)<0){
               v=a[i];
            } 
         }
         return v;
      }
      
}
public class GenericToFindMaxMIn {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Integer arr[]={1,3,4,6,4,36,7,3,6,32,4,5,667};
        Double arrdouble[]={53.56,5.67,56.56,66.8,67.56,89.9};
        String arrstring[]={"naga","ärjun","herish","kanna"};
        tofind<String> so=new tofind<String>(arrstring);
        tofind<Integer> io=new tofind<Integer>(arr);
        tofind<Double> doo=new tofind<Double>(arrdouble);
       
        System.out.println(so.min());
        System.out.println(so.max());
        System.out.println(io.min());
        System.out.println(io.max());
        System.out.println(doo.max()); 
        System.out.println(doo.min());
             
             
    }
}
