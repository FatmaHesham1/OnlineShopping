/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class StoreController {

    User user1 = new User();
    Collaborator_Controller Collaborat = new Collaborator_Controller();

    public void Store_controller() throws IOException {

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        StoreOwner stowner = new StoreOwner();
        Offer of =new Offer();
        ProductDetails d = new ProductDetails();

        String pname = d.getProductName();
        String pcategory = d.getCategory();
        String price = d.getPrice();
        String sn = d.getStoreName();
        String Type = d.getType();
        String location = d.getLocation();

        int choice = 0;
        do {
            System.out.println(" Welcome , StoreOwner ! \n");
            System.out.println("1.) Add Items  : \n");
            System.out.println("2.) Add newStore : \n");
            System.out.println("3.) collabrators : \n");
            System.out.println("4.) Buy Products : \n");
            System.out.println("5.) Exit \n");

            System.out.print("\nEnter Your Menu Choice: ");

            choice = input.nextInt();
        } while (choice > 4);

        switch (choice) {

            case 1:
                stowner.addItems(pname, pcategory, price);
                break;

            case 2:
                stowner.addNewStore(sn, location, Type);

                break;

            case 3:

                Collaborat.Collaborator_Controller();
                break;
            case 4:
                of.BuyAsAStoreOwner();
            case 5:
                System.out.println("Exiting Program...");
                System.exit(0);
                break;
        }

        if (choice > 5 || choice < 1) {
            System.out.println("This is not a valid Menu Option! Please Select Another.");
            do {
                choice = input.nextInt();
            } while (choice < 6);
        }

    }

}
