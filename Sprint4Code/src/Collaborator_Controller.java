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
public class Collaborator_Controller {

    User user1 = new User();
    String user = user1.getUsername();
    String pass = user1.getPassword();
    String stat = user1.getLogin_stat();

    Collaborators Stowner = new Collaborators();

    public void Collaborator_Controller() throws IOException {

        Scanner input = new Scanner(System.in);

        int choice = 0;
        do {
            System.out.println(" Collaborator menu.... \n");
            System.out.println("1.) Add collaborator : \n");
            System.out.println("2.) Edit history : \n");
            System.out.println("3.) Add product : \n");
            System.out.println("4.) Delete product : \n ");
            System.out.println("5.) Exit \n ");

            System.out.print("\nEnter Your Menu Choice: ");

            choice = input.nextInt();
        } while (choice > 5);

        switch (choice) {

            case 1:

                System.out.println("please re-enter information to be checked : \n ");

                String test = user1.login_verify(user, pass, stat);
                if (test.equalsIgnoreCase("storeowner")) {
                    Stowner.Add_collaborator();
                } else if (test.equalsIgnoreCase("collaborator")) {
                    System.out.println("This functionality can be used only by StoreOwner . ");
                }

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

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
