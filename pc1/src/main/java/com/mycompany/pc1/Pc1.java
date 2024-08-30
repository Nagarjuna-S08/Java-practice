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
      
      System.out.println(isPerfectSquare(2147483647));
      
    }
    
    public static boolean isPerfectSquare(int num) {
        int str=1,end=num/2;

        while(str <= end){
            int mid= str+(end-str)/2;

            if(mid*mid==num){
                return true;
            }
            if(mid*mid > num){
                end=mid-1;
            }
            else{
                str=mid+1;
            }
        }
        return false;
    }
}
