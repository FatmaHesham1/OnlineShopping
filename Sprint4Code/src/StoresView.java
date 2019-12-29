
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
public class StoresView {

    public StoresView() {
    }
    
    
    public String[] Storeview(){
    
    
        System.out.println("Storename : ");
        Scanner input5 = new Scanner(System.in);
      String  StoreName = input5.next();

        System.out.println("Location :  ");
        Scanner input6 = new Scanner(System.in);
       String Location = input6.next();

        System.out.println("Type : ");
        Scanner input7 = new Scanner(System.in);
        String Type = input7.next();
        
        String StoreInfo[]={StoreName,Location,Type};
        return StoreInfo;
    }
    
   
}
