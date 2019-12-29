

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author UserAccounts
 */
public class Facade_pattern {

    public static void main(String[] args) throws IOException {

        
        Scanner input = new Scanner(System.in);

        UserAccounts user1 = new UserAccounts();
       UserDetails userdetails=new UserDetails();

        String user = userdetails.getUsername();
        String pass = userdetails.getPassword();
        String stat = userdetails.getLogin_stat();
        String mail = userdetails.getEmail();
        String fname = userdetails.getFname();

        AdminController admin1 = new AdminController();
        StoreController Storeowner1 = new StoreController();
        CustomerController customer1 = new CustomerController();

        int choice = 0;
        do {
            System.out.println(" Main Menu : \n");
            System.out.println("1.) Register if you don't have an account : \n");
            System.out.println("2.) Login with an existing account : \n");
            System.out.println("3.)Exit \n ");
            System.out.print("\nEnter Your Menu Choice: ");

            choice = input.nextInt();
        } while (choice > 4);

        switch (choice) {

            case 1:

               String type= user1.Register(user, pass, stat, fname, mail);
               if(type.equalsIgnoreCase("Admin")||type.equalsIgnoreCase("Collaborator"))
               { System.out.println("This account cannot be created !");
               break; 
               }
                break;

            case 2:

                String testType = user1.login_verify(user, pass, stat);

                if (testType.equalsIgnoreCase("Admin")) {
                    admin1.Admin_controller();
                } else if (testType.equalsIgnoreCase("Customer")) {
                    customer1.Customer_controller();
                } else if (testType.equalsIgnoreCase("storeowner") || testType.equalsIgnoreCase("collaborator")) {
                    Storeowner1.Store_controller();
                } else{
                    System.out.println("error ");
                }

                break;

            case 3:
                System.out.println("Exiting Program...");
                System.exit(0);
                break;
        }

        if (choice > 3 || choice < 1) {
            System.out.println("This is not a valid Menu Option! Please Select Another.");
            do {
                choice = input.nextInt();
            } while (choice < 4);
        }

    }

}
