

import java.io.IOException;
import java.util.Locale.Category;
import java.util.Scanner;

public class AdminController {

    public void Admin_controller() throws IOException {
        Scanner input = new Scanner(System.in);

        Admin admin1 = new Admin();
        ProductDetails d = new ProductDetails();
        String pname = d.getProductName();
        String pcategory = d.getCategory();
        String price = d.getPrice();
        String br = d.getBrandName();
        String brcat = d.getBrandCategory();

        Statstics_controller_user StatU = new Statstics_controller_user();
        Statstics_controller_products StatP = new Statstics_controller_products();

        int choice = 0;
        do {
            System.out.println(" Welcome , Admin ! ");
            System.out.println("1.) Add items to the site : ");
            System.out.println("2.) Add new brands : ");
            System.out.println("3.) Add offers : ");
            System.out.println("4.)User statstics :");
            System.out.println("5.)Products statstics :");
            System.out.println("6.)Exit ");
            System.out.print("Enter Your Menu Choice: ");

            choice = input.nextInt();
        } while (choice > 6);

        switch (choice) {

            case 1:

                admin1.addItems(pname, pcategory, price);

                break;

            case 2:

                admin1.addNewBrand(br, brcat);

                break;

            case 3:

                admin1.Add_offers();

                break;

            case 4:

                StatU.Admin_stat_users();
                break;

            case 5:
                StatP.Admin_stat_products();
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
