/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.selection_sort;
import java.util.Arrays;
/**
 *
 * @author nagar
 */
/*
time complexcity 1) best case=0(n**2)  2)worst case= O(n**2)
space complexcity in worst and best case = = = O(1);
*/


public class Selection_sort {

    public static void main(String[] args) {
        int a[]={6,6,9,2,2,5,1,7,4};
        System.out.print("array:"+a.length);
        selection_sort(a);
        System.out.print("array:"+Arrays.toString(a));
    }
    public static void selection_sort(int[] a){
        for(int i=0;i<a.length;i++){
           int last=a.length-i-1;
           int max= findmax(a,last);
           swap(a,max,last);
           
        }
        
    }
    public static int findmax(int[] a,int end){
        int max=0;
        for(int i=1;i<=end;i++){
            if(a[max]<a[i]){
                max=i;
            }
        }
        return max;
    }
    
    public static void swap(int[] a,int max,int last){
        int t=a[max];
        a[max]=a[last];
        a[last]=t;
    }
}
