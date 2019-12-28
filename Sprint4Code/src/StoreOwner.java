

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
}

