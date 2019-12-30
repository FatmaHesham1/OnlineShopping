
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class DeleteItems {




 DatabaseListing databaselist=new DatabaseListing();
 CommittingChange commitchange=new CommittingChange();
 ListingView listview=new ListingView();

  Scanner input = new Scanner(System.in);
  List < ProductDetails > itemList = null;
 
    public void delete() throws IOException{
         File file2=new File("Sproducts.txt");
   listview.listviewProductDetails(file2);

    
    List < ProductDetails > soldItems = databaselist.listAllProducts(file2);
    
   System.out.print("Select product index you wanna delete  :");
    int index = input.nextInt();
    if (index<0 || index>=soldItems.size()){
        System.out.print("INVALID INPUT !!!!!");
        

    }else {
    
    soldItems.remove(index);
    commitchange.commitChange(soldItems);

    
    }
    }}
