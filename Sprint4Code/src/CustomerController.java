


import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class CustomerController {

    public CustomerController() {
    }
    

    public void Customer_controller() throws IOException {

        Scanner input = new Scanner(System.in);
    
        CustomerViewing_Site customer1 = new CustomerViewing_Site();
        Customer customerbuy=new Customer();

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
               
                customer1.viewproduct();
                break;

            case 2:
                
                customer1.viewStore();

                break;

            case 3:
             customerbuy.BuyProduct();
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
