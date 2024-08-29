/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rotatematrix;

import java.util.Arrays;

/**
 *
 * @author nagar
 */
public class RotateMatrix {

    public static void main(String[] args) {
        int[][] a={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int start=0;
        int end=a.length-1;
        System.out.println(Arrays.deepToString(a));
        for(int i=0;i<a.length/2;i++){
            for(int j=0;j<a[i].length;j++){
                int t=a[start][j];
                a[start][j]=a[end][j];
                a[end][j]=t;
            }
            end--;
            start++;
        }
        
        System.out.println(Arrays.deepToString(a));
        
        for(int y=0;y<a.length;y++){
            int onearr=0,oneend=a[y].length-1;
            for(int k=0;k<a[y].length/2;k++){
                int t=a[y][onearr];
                a[y][onearr]=a[y][oneend];
                a[y][oneend]=t;
                onearr++;
                oneend--;
            }
           
        }
         System.out.println(Arrays.deepToString(a));
    }
}
