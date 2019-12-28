/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class CustomersOffers {

    public CustomersOffers() {
    }
    
    
  
        Double offer;
        Double TotalPrice;
    SoldProductsDetails productDetails=new SoldProductsDetails ();
    String FirstTime =productDetails.getFirstTime();
  
  
    
    public void OffersForCustomers(){
      try{ int AmountProduct=Integer.parseInt(productDetails.getAmount());
    Double Price=Double.parseDouble(productDetails.getPrice());
             if(FirstTime=="Y") {
      	  if (AmountProduct % 2==0 ) {
                
                offer =  (Price *AmountProduct);
                 TotalPrice =  ( offer * 0.15 )  ;
                             
                  TotalPrice-=offer ;
                  System.out.println("final =" +TotalPrice );
                TotalPrice=0.00;
              
             }
      	  else if (AmountProduct %1==0 ) {
                
                offer =  (Price *AmountProduct);  
              TotalPrice  =  ( offer * 0.05 )  ;
                   TotalPrice-=offer ;
                  System.out.println("final =" + TotalPrice);
                 TotalPrice=0.00;
              
             }
              else {if (AmountProduct % 2==0) {
      	             
      	            offer =  (Price *AmountProduct);
      	             TotalPrice=  ( offer * 0.10 )  ;
      	              TotalPrice-=offer ;
                  System.out.println("final =" + TotalPrice);
                 TotalPrice=0.00;
      	          
      	         
      	  } if (AmountProduct ==1 ) {
                
                offer=  (Price *AmountProduct);                      
                  TotalPrice= offer ;
                  System.out.println("final =" +TotalPrice );
               TotalPrice=0.00;
              
             }}
             }
   }
    catch(NumberFormatException e){
    }
    }
       

    }
    
    
    
    

