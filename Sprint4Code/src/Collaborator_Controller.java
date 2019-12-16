/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// Java program to demonstrate working of ArrayList in Java 
import java.io.*;
import java.util.*;

/**
 *
 * @author User
 */
public class Collaborator_Controller {
 User user1 = new User();
 String user = user1.getUsername();
 String pass = user1.getPassword();
 String stat = user1.getLogin_stat();

 Collaborators Stowner = new Collaborators();
 public void Collaborator_Controller() throws IOException {

  Scanner input = new Scanner(System.in);
  List < ProductDetails > itemList = null;


  int choice = 0;
  do {
   System.out.println(" Collaborator menu.... \n");
   System.out.println("1.) Add collaborator : \n");
   System.out.println("2.) Edit history : \n");
   System.out.println("3.) Add product : \n");
   System.out.println("4.) Delete product : \n ");
   System.out.println("5.) Exit \n ");

   System.out.print("\nEnter Your Menu Choice: ");

   choice = input.nextInt();


  switch (choice) {

   case 1:

    System.out.println("please re-enter information to be checked : \n ");
    String test = user1.login_verify(user, pass, stat);
    if (test.equalsIgnoreCase("storeowner")) {
     Stowner.Add_collaborator();
    } else if (test.equalsIgnoreCase("collaborator"))
     System.out.println("This functionality can be used only by StoreOwner . ");


    break;

   case 2:
   if (itemList==null)
    itemList = listAllProducts();
    // print current item in stock 
    System.out.println("************************************************* INVENTORY ********************s***************************");
    ProductDetails.printInvoiceHeader();
    itemList.forEach(ProductDetails::printInvoice);

    // print sold item 
    List < ProductDetails > soldItems = listSoldProducts();
    if (soldItems.size()>0){
        System.out.println("\n\n\n************************************************ SOLD PRODUCTS *********************************************");

    ProductDetails.printSoldItemsHeader();
    soldItems.forEach(ProductDetails::printInvoice);
}
    break;

   case 3:

    break;


   case 4:
   if (itemList==null)
   itemList = listAllProducts();
   System.out.print("Select product index you wanna delete  :");
    int index = input.nextInt();
    if (index<0 || index>=itemList.size()){
        System.out.print("INVALID INPUT !!!!!");
        break;

    }
    itemList.remove(index);
    commitChange(itemList);
    break;


   case 5:
    System.out.println("Exiting Program...");
    System.exit(0);
    break;
  }

}

while (choice != 5);

 }



 public void commitChange(List < ProductDetails > itemList  ) throws IOException
 {

        if (itemList!=null){
                File usersFile = new File("Aproducts.txt");
                FileWriter writer = new FileWriter(usersFile);
                for (ProductDetails record: itemList) {
                        writer.write(record.getProductName()+"\n" +
                        
                        record.getCategory() + "\n" 
                        
                        + record.getPrice() + "\n");
                       }
                    
                       writer.close();
          }
 }

 /**
  * 
  */
 public List < ProductDetails > listAllProducts() {

  BufferedReader bufferedReader;
  List < ProductDetails > itemList = new ArrayList < > ();

  try {
   bufferedReader = new BufferedReader(new FileReader("Aproducts.txt"));
   String line;
   List < String > lines = new ArrayList < String > ();

   bufferedReader.lines().forEach(s -> {
    lines.add(s);

    if (lines.size() == 3) {
     itemList.add(new ProductDetails(lines.get(0), lines.get(1), lines.get(2)));
     lines.clear();
    }

   });

   bufferedReader.close();
  } catch (FileNotFoundException e) {
   e.printStackTrace();

  } catch (IOException e) {
   e.printStackTrace();
  }

  return itemList;
 }


 
 /**
  * 
  */
  public List < ProductDetails > listSoldProducts() {

        BufferedReader bufferedReader;
        List < ProductDetails > itemList = new ArrayList < > ();
      
        try {
         bufferedReader = new BufferedReader(new FileReader("SoldProducts.txt"));
         String line;
         List < String > lines = new ArrayList < String > ();
      
         bufferedReader.lines().forEach(s -> {
          lines.add(s);
      
          if (lines.size() == 3) {
           itemList.add(new ProductDetails(lines.get(1), lines.get(0), lines.get(2)));
           lines.clear();
          }
      
         });
      
         bufferedReader.close();
        } catch (FileNotFoundException e) {
        //  e.printStackTrace();
      
        } catch (IOException e) {
        //  e.printStackTrace();
        }
      
        return itemList;
       }

}