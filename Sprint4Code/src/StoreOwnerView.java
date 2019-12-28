
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class StoreOwnerView {

    public StoreOwnerView() {
    }
    
    
    public String[] Addview(){
    
     System.out.println("Product Name");
        Scanner input1 = new Scanner(System.in);
      String  ProductName = input1.next();
        System.out.println("Product category");
        Scanner input2 = new Scanner(System.in);
       String Category = input2.next();
        System.out.println("Product price");
        Scanner input3 = new Scanner(System.in);
       String price = input3.next();
       
       String ItemsInfo[]={ProductName,Category,price};
       
       return ItemsInfo;

    
    }
    
     public void verifyAdding(){
    
    System.out.println("Product Is Added Successfuly");
    }
    
    public void RejectAdding(){
      System.out.println("product didn't get verified yet");
    }
}
