/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zigzagpattern;

/**
 *
 * @author nagar
 */
public class ZigzagPattern {

    public static void main(String[] args) {
        int num=1,val=num,n=20,col,minus;
        
        for(int i=0;i<n;i++){
            val+=i;
            col=val;
            System.out.printf("%5d",val);
            minus=1;
            for(int j=2;j<=n;j++){
                if(i+j<=n){
                    col+=i+j;
                    System.out.printf("%5d",col);
                }
                else{
//                    if(i+j == n+1){
//                        System.out.printf("%3d",col);
//                    }
                      col+=i+j-minus;
                      minus+=2;
                      System.out.printf("%5d",col);
                }
                
            }
            System.out.println();
        }
    }
}
