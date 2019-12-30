import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Products {
	
 private String Name;
 private String Category;
 private String Price;

 

 


public Products(String name, String price, String category) {
	super();
	Name = name;
	Price = price;
	
	Category = category;
}

public Products() {
	super();
	// TODO Auto-generated constructor stub
}

public String getName() {
	return Name;
}
public void setName(String name) {
	this.Name = name;
}
public String getPrice() {
	return Price;
}
public void setPrice(String price) {
	this.Price = price;
}

public String getCategory() {
	return Category;
}
public void setCategory(String category) {
	this.Category = category;
}


  public void printInvoice() {
        System.out.println(String.format("%30s %25s %10s %25s %10s", this.getName(), "|", this.getPrice(), "|", this.getCategory()));
    }}