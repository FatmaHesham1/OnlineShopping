
public class HeadersView {

    public HeadersView() {
    }
    
    
     public static void printInvoiceHeader() {
        System.out.println(String.format("%30s %25s %10s %25s %10s", "Item", "|", "Price($)", "|", "Category"));
        System.out.println(String.format("%s", "----------------------------------------------------------------------------------------------------------------"));
    }

    public static void printSoldItemsHeader() {
        System.out.println(String.format("%30s %25s %10s %25s %10s", "Item", "|", "Price($)", "|", "Customer"));
        System.out.println(String.format("%s", "----------------------------------------------------------------------------------------------------------------"));
    }
    
  

}
