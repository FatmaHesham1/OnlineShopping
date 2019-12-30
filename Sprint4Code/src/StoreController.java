/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;

/**
 *
 * @author UserAccounts
 */
public class StoreController {

    public StoreController() {
    }
    

    UserAccounts user1 = new UserAccounts();
   
     AddingStowner_Items stowner = new AddingStowner_Items();
     AddingStores addstore=new AddingStores();
     StoreOwner storebuy=new StoreOwner();
     DeleteItems delete=new DeleteItems();
     Edit_by_StoreOwner edit=new Edit_by_StoreOwner();
    
     
     
        ProductDetails d = new ProductDetails();

        String pname = d.getProductName();
        String pcategory = d.getCategory();
        String price = d.getPrice();
        String sn = d.getStoreName();
        String Type = d.getType();
        String location = d.getLocation();
        ActionsController action=new ActionsController();

    public void Store_controller() throws IOException {
        
        UserDetails userdetail=new UserDetails();
 String user = userdetail.getUsername();
 String pass = userdetail.getPassword();
 String stat = userdetail.getLogin_stat();
 

        Scanner input = new Scanner(System.in);
      
       

        int choice = 0;
        do {
            System.out.println(" Welcome , StoreOwner ! \n");
            System.out.println("1.) Add Items  : ");
            System.out.println("2.) Add NewStore : ");
            System.out.println("3.) Delete Items : ");
            System.out.println("4.) Edit Items : ");
            System.out.println("5.) View Statstics: ");
            System.out.println("6.) Buy Products : ");
            System.out.println("7.) Other Actions : ");
            System.out.println("8.) Exit \n");

            System.out.print("Enter Your Menu Choice: ");

            choice = input.nextInt();
        } while (choice > 8);

        switch (choice) {

            case 1:
                stowner.addItems(pname, pcategory, price);
                break;

            case 2:
                addstore.addNewStore(sn, location, Type);
                System.out.println("Store is added successfully ! ");

                break;

            case 3:
                delete.delete();
               System.out.println("Item is deleted successfully ! ");
                break;
                
                
                 case 4:
                    
            edit.EditStore();
            
                break;
                
                 case 5:
                Timer timer = new Timer();
   timer.schedule(new Store_viewing_stat(), 0,6000);
   break;
   
                  case 6:
                    
                storebuy.BuyAsAStoreOwner();
                break;
                
                
            case 7:
                System.out.println("please re-enter information to be checked : \n ");
    String test = user1.login_verify(user, pass, stat);
    if (test.equalsIgnoreCase("storeowner")) {
      action.Actions();
    
    } else if (test.equalsIgnoreCase("collaborator"))
     System.out.println("This functionality can be used only by StoreOwner . ");
   
                
            
                break;
           
                
            case 8:
                System.out.println("Exiting Program...");
                System.exit(0);
                break;
        }

        if (choice > 8|| choice < 1) {
            System.out.println("This is not a valid Menu Option! Please Select Another.");
            do {
                choice = input.nextInt();
            } while (choice < 9);
        }

    }

}
