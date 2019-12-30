
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class BuyingViewer {
    
    

    public BuyingViewer() {
    }
    
 
  SoldProductsDetails productDetails=new SoldProductsDetails ();
 

    public String ChooseProduct(){
 
                
     System.out.println("--------------------------------------------------");

        System.out.println("Select the target product : ");
        Scanner input1 = new Scanner(System.in);
        String TargetProduct = input1.next();
        productDetails.setTargetProduct(TargetProduct);

     
       return TargetProduct; 
       
        
        
}
    public void CheckingProduct(){
    
    
        System.out.println(".........................");
        System.out.println("Checking if the product exists or not..");
    }
    
    
    public String[] EnterInfo() throws IOException{
       
    
    CalculateOffers calcoffers = new CalculateOffers();
    
           System.out.println("Please Enter your name :");
            Scanner input6 = new Scanner(System.in);
            String name = input6.next();
            
            System.out.println("Enter the price : ");
        Scanner input9 = new Scanner(System.in);
        int PriceOfProduct= input9.nextInt();
        
       System.out.println("Enter the type : ");
        Scanner in = new Scanner(System.in);   
          String type = in.next();
         
        System.out.println("Select the required amount of products : ");
        Scanner input2 = new Scanner(System.in);
        int AmountProduct = input2.nextInt();
        
        int discount=calcoffers.Calculate_offer(PriceOfProduct, AmountProduct,type);
                String dis=String.valueOf(discount);
                System.out.println("Discount is "+dis);
                String price=String.valueOf(PriceOfProduct);
                productDetails.setPrice(price);
                String amount=String.valueOf(AmountProduct);
                productDetails.setAmount(amount);

       
        
         System.out.println("Write the shipping address : ");
        Scanner input3 = new Scanner(System.in);
        String Address = input3.next();
        
        System.out.println("Do you want to leave any notes regarding the order? ");
        Scanner input5 = new Scanner(System.in);
        String Notes = input5.next();


        
        System.out.println("Select Y if you agree on the policies & rules OR N if you don't : ");
        Scanner input4 = new Scanner(System.in);
        char LetterOfRules = input4.next().charAt(0);
        
        

        if (LetterOfRules == 'Y') {
            System.out.println("Thank you for ordering! your order will arrive soon ....");
        } else {
            System.out.println("If you have a problem with our terms contact us through the email ");
        }
       
    

        
         String InfoArray[]={amount,dis,name};
        
        return InfoArray;
        
    
    }
    
   
    
    public void ConfirmBuying(){
        
 System.out.println("A confirmation message will be sent to you through the email");
 
}
 
    public void ProductNotExists(){
    System.out.println("Sorry the product doesn't exists ! ");
    
    }
      
    
    
}
