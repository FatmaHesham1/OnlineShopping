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
public class Statstics_controller_user {

    public Statstics_controller_user() {
    }

    
    Statstics_user statU = new Statstics_user();
    Statstics_products statP = new Statstics_products();

    public void Admin_stat_users() throws IOException {

        System.out.println("Select : S for (SUM) , M for (Min), X for (Max) , A for (AVG) : ");
        Scanner input4 = new Scanner(System.in);
        char letter = input4.next().charAt(0);

        if (letter == 'S') {

            System.out.println("Sum of users are : " + statU.User_sum());

        } else if (letter == 'M') {
            System.out.println (statU.Min());

        } else if (letter == 'X') {

             System.out.println (statU.Max());

        } else {
            System.out.println("Average number of users are : " + statU.User_avg());
        }
    }

}
