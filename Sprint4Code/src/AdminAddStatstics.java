
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class AdminAddStatstics {
     Statstics_user statU = new Statstics_user();

    Statstics_products statP = new Statstics_products();
    public void MaxProduct() throws IOException{
    
     System.out.println(statP.MaxProduct()); 
    
    }
    
    public void SumProduct() throws IOException{
    
    System.out.println("Sum of products are : " + statU.User_sum());
    
    }
    
    public void MinProduct() throws IOException{
    
    System.out.println(statP.MinProduct());
    }
}
