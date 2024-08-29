/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package currencyConverter;
import java.util.*;
/**
 *
 * @author nagar
 */
public class currency {
    Scanner s=new Scanner(System.in);
    public void inrtousd(){
        System.out.println("Enter indian to convert intio usd :");
        int i=s.nextInt();
        double usd=i/83.5;
        System.out.println("USD :"+ usd);
    }
    
}
