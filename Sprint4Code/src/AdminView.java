
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
public class AdminView {

    public AdminView() {
    }
    
    public String[] ViewAddItems (){

            System.out.println("Product Name");
            Scanner input1 = new Scanner(System.in);
            String productName = input1.next();
            System.out.println("Product category");
            Scanner input2 = new Scanner(System.in);
            String category = input2.next();
            System.out.println("Product price");
            Scanner input3 = new Scanner(System.in);
            String price = input3.next();
            
            String array[]={productName,category,price};
            return array;
}
    
 
}
