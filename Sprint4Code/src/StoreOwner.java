

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.time.Clock.system;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StoreOwner extends User implements Product {

    ProductDetails obj3;
    Database DB = new Database();
    User user1 = new User();

    @Override
    public void Get_product_details() {
        String Category = obj3.getCategory();
        String ProductName = obj3.getProductName();
        String BrandName = obj3.getBrandName();
        String Location = obj3.getLocation();
        String Price = obj3.getPrice();
        String Type = obj3.getType();
        String BrandCategory = obj3.getBrandCategory();
        String StoreName = obj3.getStoreName();
       

    }
    public void viewproduct(File file2) throws FileNotFoundException, IOException {
        DB.view(file2);

    }

    public void viewStore(File file3) throws FileNotFoundException, IOException {

        DB.view(file3);
    }

    @Override
    public void addItems(String ProductName, String Category, String price) {

        try {
            System.out.println("Product Name");
            Scanner input1 = new Scanner(System.in);
            ProductName = input1.next();
            System.out.println("Product category");
            Scanner input2 = new Scanner(System.in);
            Category = input2.next();
            System.out.println("Product price");
            Scanner input3 = new Scanner(System.in);
            price = input3.next();

            Admin admin2 = new Admin();

            if (admin2.verify(Category) == true) {

                File file1 = new File("Sproducts.txt");
                FileWriter writeer = new FileWriter("Sproducts.txt", true);
                String array[] = {ProductName, Category, price};
                DB.Write_to_file(file1, array);

                System.out.println("Product Is Added Successfuly");

            } else {
                System.out.println("product didn't get verified yet");
            }
        } catch (IOException ex) {
            Logger.getLogger(StoreOwner.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void addNewStore(String StoreName, String Location, String Type) throws IOException {

        File file2 = new File("AddStores.txt");
        FileWriter writeer = new FileWriter(file2, true);

        System.out.println("Storename : \n ");
        Scanner input5 = new Scanner(System.in);
        StoreName = input5.next();

        System.out.println("Location : \n ");
        Scanner input6 = new Scanner(System.in);
        Location = input6.next();

        System.out.println("Type : \n ");
        Scanner input7 = new Scanner(System.in);
        Type = input7.next();

        String array[] = {StoreName, Location, Type};
        DB.Write_to_file(file2, array);

        System.out.println(" \n Store is added successfully ! ");

    }
    public void BuyAsAStoreOwner() throws IOException {
        
        
        double totalofbuy ;
        double total_final ;
        double x ; 
        double z ;
        File file1 = new File("Aproducts.txt");
        viewproduct(file1);

        System.out.println("--------------------------------------------------");

        System.out.println("Select the target product : ");
        Scanner 
        input1 = new Scanner(System.in);
        String TargetProduct = input1.next();

        System.out.println("Select the required amount of products : ");
        Scanner input2 = new Scanner(System.in);
        int AmountProduct = input2.nextInt();

        System.out.println("Enter the price : ");
        Scanner input9 = new Scanner(System.in);
        double Price= input9.nextDouble();
        String price2=input9.next(); 
       
          System.out.println("First time to visit US ?");
          Scanner input10 = new Scanner(System.in);
          char letter2=input10.next().charAt(0);
          if(letter2=='Y') {
        	  if (AmountProduct % 2==0 ) {
                  
                  z =  (Price *AmountProduct);
                   x=  ( z * 0.30 )  ;
                               
                    total_final= z - x ;
                    System.out.println("final =" +total_final );
                  total_final=0;
                
               }
        	  else if (AmountProduct ==1 ) {
                  
                  z =  (Price *AmountProduct);  
                  x=  ( z * 0.20 )  ;
                    total_final= z-x  ;
                    System.out.println("final =" +total_final );
                  total_final=0;
                
               }}
        	  else {if (AmountProduct % 2==0) {
        	             
        	            z =  (Price *AmountProduct);
        	             x=  ( z * 0.25 )  ;
        	                         
        	              total_final= z - x ;
        	              System.out.println("final =" +total_final );
        	            total_final=0;
        	          
        	         
        	  } if (AmountProduct ==1 ) {
                  
                  z =  (Price *AmountProduct);
                  x=  ( z * 0.15 )  ;
                    total_final= z-x  ;
                    System.out.println("final =" +total_final );
                  total_final=0;
                
               }}
          
        System.out.println("Write the shipping address : ");
        Scanner input3 = new Scanner(System.in);
        String Address = input3.next();


        
        System.out.println("Select Y if you agree on the policies & rules OR N if you don't : ");
        Scanner input4 = new Scanner(System.in);
        char letter = input4.next().charAt(0);

        if (letter == 'Y') {
            System.out.println("Thank you for ordering! your order will arrive soon ....");
        } else {
            System.out.println("If you have a problem with our terms contact us.Thank you ");
        }
       
        System.out.println("Do you want to leave any notes regarding the order? ");
        Scanner input5 = new Scanner(System.in);
        String Notes = input5.next();

        System.out.println(".........................");
        System.out.println("Checking if the product exists or not..");

        File file5 = new File("SoldProducts.txt");

        String array1[] = {TargetProduct};
        boolean test = DB.Read(file1, array1, 1);

        if (test == true) {

            System.out.println("Please Enter your name :");
            Scanner input6 = new Scanner(System.in);
            String name = input6.next();
            String array[]= {name, TargetProduct,price2};
           
            DB.Write_to_file(file5, array);
            System.out.println("A confirmation message will be sent to you through the email");
        } else {
            System.out.println("Sorry the product doesn't exists ! ");
        }

    }}

