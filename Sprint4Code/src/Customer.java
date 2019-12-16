

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Customer extends User {

    Database DB = new Database();
    ProductDetails PD = new ProductDetails();

    public void viewproduct(File file2) throws FileNotFoundException, IOException {
        DB.view(file2);

    }

    public void viewStore(File file3) throws FileNotFoundException, IOException {

        DB.view(file3);
    }

    public void BuyProducts() throws IOException {
        File file1 = new File("Aproducts.txt");
        viewproduct(file1);

        System.out.println("--------------------------------------------------");

        System.out.println("Select the target product : ");
        Scanner input1 = new Scanner(System.in);
        String TargetProduct = input1.next();

        System.out.println("Select the required amount of products : ");
        Scanner input2 = new Scanner(System.in);
        String AmountProduct = input2.next();

        System.out.println("Enter the price : ");
        Scanner input9 = new Scanner(System.in);
        String Price = input9.next();

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
            Scanner input7 = new Scanner(System.in);
            String name = input7.next();
            String array[] = {name, TargetProduct, Price};
            DB.Write_to_file(file5, array);
            System.out.println("A confirmation message will be sent to you through the email");
        } else {
            System.out.println("Sorry the product doesn't exists ! ");
        }

    }

}
