
import java.util.Random;
import java.util.TimerTask;

public class ProductDetails  {
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

    
 
   
    
      public void printInvoice() {
        System.out.println(String.format("%30s %25s %10s %25s %10s", this.getProductName(), "|", this.getPrice(), "|", this.getCategory()));
    }
}

		
		 
		

