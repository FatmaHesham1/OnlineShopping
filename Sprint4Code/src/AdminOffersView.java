
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
public class AdminOffersView {

    public AdminOffersView() {
    }
    
    
    public String[] offers(){
    
           System.out.println("Enter the percentage you want to apply on products : ");
            Scanner input4 = new Scanner(System.in);
            String offer = input4.next();

            System.out.println("Enter the new price after offer : ");
            Scanner input5 = new Scanner(System.in);
            String price = input5.next();

            String offers[]={offer,price};
      return offers;
    }
    
    
    public void FinishAdding(){
    
    
     System.out.println("offers are added successfully  ");
    }
    
    public void UnfinishAdding(){
    
     System.out.println("Sorry you've entered wrong product ");
    
    }
}



