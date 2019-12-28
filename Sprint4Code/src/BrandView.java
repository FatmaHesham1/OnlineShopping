
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
public class BrandView {

    public BrandView() {
    }
    
    public String[] AddBrandView(){
          System.out.println("Brand Name");
            Scanner input5 = new Scanner(System.in);
           String BrandName = input5.next();

            System.out.println("Brand category");
            Scanner input6 = new Scanner(System.in);
           String BrandCategory = input6.next();
           
           String arrayOfBrands[]={BrandName,BrandCategory};
    
           return arrayOfBrands;
    }
}
