

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Admin implements Product {

    ProductDetails obj2;
    Database obj = new Database();

    public void Get_product_details() {
        String ProductName = obj2.getProductName();
        String Category = obj2.getCategory();
        String price = obj2.getPrice();
    }

    /**
     *
     * @param ProductName
     * @param category
     * @param price
     * @throws IOException
     */
    public void addItems(String ProductName, String Category, String Price) {
        try {

            File file2 = new File("Aproducts.txt");

            FileWriter writeer = new FileWriter("Aproducts.txt", true);

            System.out.println("Product Name");
            Scanner input1 = new Scanner(System.in);
            String productName = input1.next();
            System.out.println("Product category");
            Scanner input2 = new Scanner(System.in);
            String category = input2.next();
            System.out.println("Product price");
            Scanner input3 = new Scanner(System.in);
            String price = input3.next();

            String array[] = {productName, category, price};
            obj.Write_to_file(file2, array);

            System.out.println("Product is added successfuly!");

        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean verify(String Category) throws IOException {

        /*   File file3=new File("Aproducts.txt");
  
   boolean test= obj.Read_From_File_one(file3, Category);
    if (test==true)
   return true;
    else 
        return false; 
         */
        File file3 = new File("Aproducts.txt");
        String array1[] = {Category};
        boolean test = obj.Read(file3, array1, 2);
        if (test == true) {
            return true;
        } else {
            return false;
        }

    }

    public void addNewBrand(String BrandName, String BrandCategory) {

        try {

            File file3 = new File("AddBrands.txt");

            FileWriter writeer = new FileWriter("AddBrands.txt", true);

            System.out.println("Brand Name");
            Scanner input5 = new Scanner(System.in);
            BrandName = input5.next();

            System.out.println("Brand category");
            Scanner input6 = new Scanner(System.in);
            BrandCategory = input6.next();

            String array[] = {BrandName, BrandCategory};

            obj.Write_to_file(file3, array);

            System.out.println("Brand Is Added Successfuly");

        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Add_offers() throws IOException {
        File file3 = new File("Aproducts.txt");
        obj.view(file3);

        System.out.println("Enter the product Name you want to apply offer on : ");
        Scanner input3 = new Scanner(System.in);
        String pname = input3.next();

        /*     
          boolean test=   obj.Read_From_File_one(file3, pname);
          
             
            if(test==true){
             System.out.println("Enter the percentage you want to apply on products : ");
             Scanner input4 = new Scanner(System.in);
             String offer = input4.next();
             
              System.out.println("Enter the new price after offer : ");
             Scanner input5 = new Scanner(System.in);
             String price = input5.next();
             
             File file4=new File("Offers.txt");
             
             
           String array[]={pname, offer, price};
           obj.Write_to_file(file4, array);
             
         System.out.println("offers are added successfully  ");
            }
             
             else
                   System.out.println("Sorry you've entered wrong product ");

         */
        String array1[] = {pname};
        boolean test = obj.Read(file3, array1, 1);

        if (test == true) {
            System.out.println("Enter the percentage you want to apply on products : ");
            Scanner input4 = new Scanner(System.in);
            String offer = input4.next();

            System.out.println("Enter the new price after offer : ");
            Scanner input5 = new Scanner(System.in);
            String price = input5.next();

            File file4 = new File("Offers.txt");

            String array[] = {pname, offer, price};
            obj.Write_to_file(file4, array);

            System.out.println("offers are added successfully  ");
        } else {
            System.out.println("Sorry you've entered wrong product ");
        }

    }

}
