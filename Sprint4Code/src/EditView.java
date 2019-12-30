
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
public class EditView {
   	
    ArrayList<String> edit = new ArrayList<String>();
 //   ListingAllProducts listproduct=new ListingAllProducts();
    DatabaseListing databaselist=new DatabaseListing();
    List < ProductDetails > itemList = null;
     List < Products > itemLists = null;
    HeadersView headerview=new HeadersView();
    DatabaseReading database=new DatabaseReading();
    Listing list=new Listing();
    
	public ArrayList<String> Edit() throws IOException {
          

         File file=new File("Sproducts.txt");
        		if (itemList==null){
    itemList = databaselist.listAllProducts(file);
    // print current item in stock 
    System.out.println("************************************************* SotreOwnerProducts ***********************************************");
    headerview.printInvoiceHeader();
    itemList.forEach(ProductDetails::printInvoice);}
                 
                
		System.out.println("\n Choose a product to be edited : ");
		Scanner x1 = new Scanner(System.in);
		String edited = x1.next();
		System.out.println(" What is the new product name ? ");
		Scanner x2 = new Scanner(System.in);
		String edited2 = x2.next();
                System.out.println("what is the new product price ? ");
		Scanner x3 = new Scanner(System.in);
		String edited3 = x3.next();
                System.out.println("what is the new product category ");
		Scanner x4 = new Scanner(System.in);
		String edited4 = x4.next();
		edit.add(0, edited);
		edit.add(1,edited2);
                edit.add(2, edited3);
		edit.add(3,edited4);
                
		return edit;
                
	} 
        
        public void Finish(){
        System.out.println("Product Is Updated Successfuly..Thanks");
        }
        
        public void Before(){
            File file=new File("SproductsBackup.txt");
        		if (itemLists==null){
    itemLists = list.listAllProducts(file);
    // print current item in stock 
    System.out.println("************************************************* SotreOwnerProducts before Edit ***********************************************");
    headerview.printInvoiceHeader();
    itemLists.forEach(Products::printInvoice);
 
                 }
        
        }
        public  void After(){
        
            File file=new File("Sproducts.txt");
            	if (itemList==null){
    itemList = databaselist.listAllProducts(file);
    // print current item in stock 
    System.out.println("************************************************* SotreOwnerProducts ***********************************************");
    headerview.printInvoiceHeader();
    itemList.forEach(ProductDetails::printInvoice);
 
                 }
        }
}
