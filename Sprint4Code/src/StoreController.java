/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author UserAccounts
 */
public class StoreController {

    public StoreController() {
    }
    

    UserAccounts user1 = new UserAccounts();
    CollaboratorController Collaborat = new CollaboratorController();
     AddingStowner_Items stowner = new AddingStowner_Items();
     AddingStores addstore=new AddingStores();
     StoreOwner storebuy=new StoreOwner();
     
     
        ProductDetails d = new ProductDetails();

        String pname = d.getProductName();
        String pcategory = d.getCategory();
        String price = d.getPrice();
        String sn = d.getStoreName();
        String Type = d.getType();
        String location = d.getLocation();
        ActionsController action=new ActionsController();

    public void Store_controller() throws IOException {

        Scanner input = new Scanner(System.in);
      
       

        int choice = 0;
        do {
            System.out.println(" Welcome , StoreOwner ! \n");
            System.out.println("1.) Add Items  : ");
            System.out.println("2.) Add newStore : ");
            System.out.println("3.) collabrators : ");
            System.out.println("4.) Buy Products : ");
            System.out.println("5.) Other Actions : ");
            System.out.println("6.) Exit \n");

            System.out.print("Enter Your Menu Choice: ");

            choice = input.nextInt();
        } while (choice > 6);

        switch (choice) {

            case 1:
                stowner.addItems(pname, pcategory, price);
                break;

            case 2:
                addstore.addNewStore(sn, location, Type);
                System.out.println("Store is added successfully ! ");

                break;

            case 3:

                Collaborat.Collaborator_Controller();
                break;
                
                 case 4:
                    
                storebuy.BuyAsAStoreOwner();
                break;
                
                
            case 5:
              action.Actions();
                break;
                
                
                
            case 6:
                System.out.println("Exiting Program...");
                System.exit(0);
                break;
        }

        if (choice > 6 || choice < 1) {
            System.out.println("This is not a valid Menu Option! Please Select Another.");
            do {
                choice = input.nextInt();
            } while (choice < 7);
        }

    }

}
