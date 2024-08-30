/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.binarysearchin2dmatinascendingorder;

import java.util.Arrays;

/**
 *
 * @author nagar
 */
public class BinarySearchIn2DmatinascendingOrder {

    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target=16;
        System.out.println(Arrays.toString(binarySearch(matrix,target)));
        System.out.print("HELLO");
    }
//    static int[] binarySearchSIngle();
    static int[] binarySearch(int[][] mat,int target){
        int rowend=mat.length-1;
        int c=mat[0].length-1;
        
        int midcol = c/2;
        int rowstart=0;
        while(rowstart < rowend-1){
            System.out.println(rowstart+" "+rowend);
            int midrow= rowstart + (rowend-rowstart)/2;
            
            if(mat[midrow][midcol]==target){
                return new int[]{midrow,midcol};
            }
            if(mat[midrow][midcol] < target){
                rowstart=midrow;
            }
            else{
                rowend=midrow;
            }
        }
        
        if(mat[rowstart][midcol]==target){
            return new int[]{rowstart,midcol};
        }
        if(mat[rowstart+1][midcol]==target){
           return new int[]{rowstart+1,midcol}; 
        }
        
        
        
        if(target <= mat[rowstart][midcol-1]){
           return oneDarrayBinarySearch(mat,target,0,midcol-1,rowstart);
        }
        
        
         if(target >= mat[rowend][midcol+1]){
            return oneDarrayBinarySearch(mat,target,midcol+1,c,rowend);
        }
        
        if(target <= mat[rowend][midcol-1]&& target >= mat[rowend][0]){
            return oneDarrayBinarySearch(mat,target,0,midcol-1,rowend);
        }
       
        if(target >= mat[rowstart][midcol+1]){
           return oneDarrayBinarySearch(mat,target,midcol+1,c,rowstart);
        }
        
        
        
        
        return new int[]{-1,-1};
    }
    
    static int[] oneDarrayBinarySearch(int[][] mat,int target,int start,int end,int rowindex){
        
        while(start<=end){
            int mid=start + (end-start)/2;
            
            if(mat[rowindex][mid]==target){
                return new int[]{rowindex,mid};
            }
            if(mat[rowindex][mid] < target ){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}
