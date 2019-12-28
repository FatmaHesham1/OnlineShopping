
 import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.*;
import java.util.*;
public class CollaboratorController {
   public CollaboratorController() {
    }
    
    
 UserDetails userdetail=new UserDetails();
 String user = userdetail.getUsername();
 String pass = userdetail.getPassword();
 String stat = userdetail.getLogin_stat();
 
 UserAccounts useracc=new UserAccounts();
AddingCollaborator addcoll=new AddingCollaborator();

 ListingSoldProducts Stowner = new ListingSoldProducts();
 ListingAllProducts listproduct=new  ListingAllProducts();
 HeadersView headerview=new  HeadersView();
 CommittingChange commitchange=new CommittingChange();
 public void Collaborator_Controller() throws IOException {

  Scanner input = new Scanner(System.in);
  List < ProductDetails > itemList = null;


  int choice = 0;
  do {
   System.out.println(" Collaborator menu.... \n");
   System.out.println("1.) Add collaborator : \n");
   System.out.println("2.) Listing history : \n");
   System.out.println("3.) Delete product : \n ");
   System.out.println("4.) Exit \n ");

   System.out.print("\nEnter Your Menu Choice: ");

   choice = input.nextInt();


  switch (choice) {

   case 1:

    System.out.println("please re-enter information to be checked : \n ");
    String test = useracc.login_verify(user, pass, stat);
    if (test.equalsIgnoreCase("storeowner")) {
     addcoll.Add_collaborator();
    System.out.println("Collaborator is added ! ");
    } else if (test.equalsIgnoreCase("collaborator"))
     System.out.println("This functionality can be used only by StoreOwner . ");
    break;

   case 2:
   if (itemList==null)
    itemList = listproduct.listAllProducts();
    // print current item in stock 
    System.out.println("************************************************* INVENTORY ********************s***************************");
    headerview.printInvoiceHeader();
    itemList.forEach(ProductDetails::printInvoice);

    // print sold item 
    List < ProductDetails > soldItems = Stowner.listSoldProducts();
    if (soldItems.size()>0){
        System.out.println("\n\n\n************************************************ SOLD PRODUCTS *********************************************");

    headerview.printSoldItemsHeader();
    soldItems.forEach(ProductDetails::printInvoice);
}
    break;

  


   case 3:
   if (itemList==null)
   itemList = listproduct.listAllProducts();
   System.out.print("Select product index you wanna delete  :");
    int index = input.nextInt();
    if (index<0 || index>=itemList.size()){
        System.out.print("INVALID INPUT !!!!!");
        break;

    }
    itemList.remove(index);
    commitchange.commitChange(itemList);
    break;


   case 4:
    System.out.println("Exiting Program...");
    System.exit(0);
    break;
  }

}

while (choice > 5);

 }



 
}
