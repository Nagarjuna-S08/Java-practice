/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author nagar
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.println("Enter file name :");
        String filename=s.nextLine();
        File f=new File(filename);
        if(f.exists()){
         System.out.print("File is alive ...");
        }
        else{
           System.out.print("File is noooot alive ..."); 
        }
        if(f.isDirectory()){
           System.out.print("File is directory ..."); 
        }
        else if(f.isFile()){
              System.out.print("File is File ..."); 
        }
        System.out.println("File Size :"+f.length());
    }
}
