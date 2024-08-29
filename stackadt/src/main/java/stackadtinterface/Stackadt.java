/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package stackadtinterface;

import java.util.*;

interface stack{
 public void push(int item);
 public void pop();
}

class runa implements stack{
   int[] s=new int[5];
    int top=-1;
    public void push(int item){
        if(top>=4){
          System.out.println("overflow");
        }
        else{
          top=top+1;
          s[top]=item;
          System.out.println(item+"pushed into the stack");
        }
    }
    public void pop(){
        if(top<=-1){
           System.out.println("underflow");
        }
        else{
           System.out.println(s[top]+" poped elemnet");
           top=top-1;
        }
    }
    public void display(){
        for(int i=0;i<=top;i++){
            System.out.println(s[i]+" ");
        }
    }
}
public class Stackadt{
    
    public static void main(String[] args) {
        int c,item,i=1;
        Scanner a=new Scanner(System.in);
       
        runa r=new runa();
        do{
             System.out.println("Entre your choice :");
             c=a.nextInt();
        switch(c){
            case 1:
                System.out.println("Enter elemnet to insert :");
                item=a.nextInt();
                r.push(item);
                break;
            case 2:
                System.out.println("");
                r.pop();
                break;
            case 3:
                r.display();
                break;
            case 4:
                i=0;
                break;
        }}while(i!=0);
        
    }
}
