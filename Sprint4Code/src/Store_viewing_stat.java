import java.io.File;
import java.io.IOException;
import java.util.TimerTask;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */   
public class Store_viewing_stat extends TimerTask  {
	 AdminAddStatstics get_Statistics_byStoreowner =new AdminAddStatstics();
    public Store_viewing_stat() {
        
        
        
    }
    ListingView listview=new ListingView();
    
    public void show(){
    File file=new File("SoldProducts.txt");
listview.listviewProductDetails(file);
}

	@Override
	public void run() {

		  try {
			get_Statistics_byStoreowner.SumProduct();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		  try {
			get_Statistics_byStoreowner.MaxProduct();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		  try {
			get_Statistics_byStoreowner.MinProduct();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
}

