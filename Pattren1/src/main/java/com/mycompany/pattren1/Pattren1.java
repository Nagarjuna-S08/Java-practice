/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pattren1;

/**
 *
 * @author nagar
 */
public class Pattren1 {

    public static void main(String[] args) {
        pattern(4);
    }
    public static void pattern(int n){
        int dup=n;
        for(int row=1;row<n*2;row++){
            dup=n;
            int val= row<=n ? (n+1)-row : (n*2)-row;
            for(int col=1;col<=n;col++){
                System.out.print(dup);
                dup=dup-1 >= val ? dup-1 : dup ;
            }
//            for(int i=1;i<n;i++){
//                val= val<n? val+1 : val ;
//                System.out.print(val);
//            }
            System.out.println();
        }
    }
}
