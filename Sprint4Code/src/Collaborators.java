/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Collaborators {

  
 /**
  * 
  */
 public static final String USER_BASE_PATH = "users.txt";


 
 /**
  * 
  */
 public void Add_collaborator() throws IOException {


  File usersFile = new File(this.USER_BASE_PATH);
  FileWriter writer = new FileWriter(usersFile, true);
  String[] record = this.scanUserInput();

  for (String i: record) {
   writer.write(i);
   writer.write("\n");
  }

  writer.close();

  System.out.println("Collaborator is added ! ");

 }


 /**
  * 
  */
 public String [] scanUserInput() {
  Scanner input = new Scanner(System.in);
  System.out.print("Please Enter your username :  ");
  String Username = input.next();
  System.out.print("Please Enter your Password : ");
  String password = input.next();
  System.out.print("Please Enter your  email : ");
  String email = input.next();
  System.out.println("\n Saving your new accounts....");

  return new String [] {
   Username,
   password,
   "collaborator"
   };
 }

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


 
}