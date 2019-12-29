public class CalculateOffers {

    UserDetails userdetails = new UserDetails();
    
    public int Calculate_offer(int result, int amount,String type) {
    
        if (type.equalsIgnoreCase("customer")) {
            if (amount == 1) {
                return (int) (result - (result * 0.05));
            } else {
                return (int) (result - (result * 0.1));
            }
        } else if (type.equalsIgnoreCase("StoreOwner")) {
            if (amount == 1) {
                return (int) (result - (result * 0.15));
            } else {
                return (int) (result - (result * 0.3));
            }
        }
        return 0;
    }   

   
}