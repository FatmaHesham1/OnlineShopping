

import java.io.IOException;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Statstics_controller_products {

    public Statstics_controller_products() {
    }
    

    Statstics_user statU = new Statstics_user();

    Statstics_products statP = new Statstics_products();

    public void Admin_stat_products() throws IOException {

        System.out.println("Select : S for (SUM) , M for (Min), X for (Max) : ");
        Scanner input4 = new Scanner(System.in);
        char letter = input4.next().charAt(0);

        if (letter == 'S') {
            System.out.println("Sum of products are : " + statU.User_sum());

        } else if (letter == 'M') {
           System.out.println(statP.MinProduct());

        } else {
           System.out.println(statP.MaxProduct()); 
        }

    }

}
