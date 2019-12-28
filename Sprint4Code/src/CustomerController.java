/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class CustomerController {

    public void Customer_controller() throws IOException {

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        Customer customer1 = new Customer();
        Offer of=new Offer();

        int choice = 0;
        do {
            System.out.println("\n Welcome , Customer ! \n");
            System.out.println("1.) View products : \n");
            System.out.println("2.) View Stores : \n");
            System.out.println("3.) Buy products : \n");
            System.out.println("4.) Exit \n ");

            System.out.print("\nEnter Your Menu Choice: ");

            choice = input.nextInt();
        } while (choice > 4);

        switch (choice) {

            case 1:
                File file1 = new File("Aproducts.txt");
                customer1.viewproduct(file1);
                break;

            case 2:
                File file3 = new File("Sproducts.txt");
                customer1.viewStore(file3);

                break;

            case 3:
                of.BuyProducts();
                break;

            case 4:
                System.out.println("Exiting Program...");
                System.exit(0);
                break;
        }

        if (choice > 5 || choice < 1) {
            System.out.println("This is not a valid Menu Option! Please Select Another.");
            do {
                choice = input.nextInt();
            } while (choice < 5);
        }

    }
}
