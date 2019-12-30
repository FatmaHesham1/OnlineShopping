
import java.io.File;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ListingView {
     List < ProductDetails > itemList = null;
     List < Products > itemLists = null;
     DatabaseListing databaselist=new DatabaseListing();
     HeadersView headerview=new HeadersView();
     Listing list=new Listing();
    public void listviewProductDetails(File file){
              
            	if (itemList==null){
    itemList = databaselist.listAllProducts(file);
    // print current item in stock 
    System.out.println("*************************************************Products***********************************************");
    headerview.printInvoiceHeader();
    itemList.forEach(ProductDetails::printInvoice);
    
    }}
    public void listviewProducts(File file){
        
        		if (itemLists==null){
    itemLists = list.listAllProducts(file);
    // print current item in stock 
    System.out.println("************************************************* SotreOwnerProducts before Edit ***********************************************");
    headerview.printInvoiceHeader();
    itemLists.forEach(Products::printInvoice);
    }
}}
