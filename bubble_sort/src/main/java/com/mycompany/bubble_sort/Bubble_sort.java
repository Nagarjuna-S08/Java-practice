/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bubble_sort;

import java.util.Arrays;

/**
 *
 * @author nagar
 */
/*
time complexcity 1) best case=0(n)  2)worst case= O(n**2)
space complexcity in worst and best case = = = O(1);
*/
public class Bubble_sort {

    public static void main(String[] args) {
        int a[]={1,2,5,8};
        bubble_sort(a);
    }
    public static void bubble_sort(int[] a){
        boolean swap=false;
        for(int i=0;i<a.length;i++){
            swap=false;
            System.out.print(Arrays.toString(a)+"iteration"+i);
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
        System.out.print("arrays:"+Arrays.toString(a));
    }
   
}
