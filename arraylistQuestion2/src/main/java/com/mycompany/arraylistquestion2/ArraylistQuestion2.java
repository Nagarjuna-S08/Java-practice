/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylistquestion2;
import java.util.ArrayList;
import java.util.Collections.*;
import java.util.Scanner;
public class ArraylistQuestion2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");int i=2,c;
        ArrayList<String> obj=new ArrayList<String>();
        Scanner a=new Scanner(System.in);
        Scanner aa=new Scanner(System.in);
        do{
            System.out.println("enter your choice:");
            c=a.nextInt();
            switch(c){
                case 1:
                    System.out.println("Enter element:");
                    String e=aa.nextLine();
                    obj.add(e);
                    break;
                case 2:
                    System.out.println("Enter position to insert :");
                    int p=a.nextInt();
                    System.out.println("Enter element:");
                    e=aa.nextLine();
                    obj.add(p,e);
                    break;
                case 3:
                    System.out.print(obj+"\n");
                    break;
                case 4:
                    System.out.println("Enter to search word :");
                    e=aa.nextLine();
                    int j=obj.indexOf(e);
                    if(j==-1){
                       System.out.print("the element not found");
                    }
                    else{
                       System.out.print("the element found at :");
                    }
                    break;
                case 5:
                    System.out.println("Enter to starting letters to search word :");
                    e=aa.nextLine();
                    for(int jj=0;jj<obj.size();jj++){
                       String str=obj.get(jj);
                       if(str.startsWith(e)){
                           System.out.println("the elemnt found at "+str.indexOf(str));
                           break;
                       }
                    }
                    break; 
            }
        }while(i==2);
    }
}
