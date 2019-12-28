
import java.util.Random;
import java.util.TimerTask;

public class ProductDetails extends TimerTask {
		public String ProductName;
		public String Category;
		public String BrandName;
		public String Location;
		public String Price;
		public String Type;
                public String BrandCategory;
                public String StoreName;
                
                ProductDetails() 
    { 
        
    } 
 ProductDetails(String name , String Category,String Price) 
    { 
        this.ProductName = name;
        this.Category = Category;
        this.Price = Price;
    } 


    public String getProductName() {
        return ProductName;
    }
    public String getStoreName() {
        return StoreName;
    }
     public String getBrandCategory() {
        return BrandCategory;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    
 
   
    @Override
    public void run() {
      Random rand = new Random(); 
  
      
        int rand_int1 = rand.nextInt(10); 
        int rand_int2 = rand.nextInt(14);
         int rand_int3 = rand.nextInt(12);
         int rand_int4=rand.nextInt(17);
        System.out.println("The most ordered products : \n" +rand_int1); 
        System.out.println("The most ordered brands : "+rand_int2); 
         System.out.println("Number of user buy products in stores : "+rand_int3);
        System.out.println("Number of users explore his products : "+rand_int4);

    }
      public void printInvoice() {
        System.out.println(String.format("%30s %25s %10s %25s %10s", this.getProductName(), "|", this.getPrice(), "|", this.getCategory()));
    }
}

		
		 
		

