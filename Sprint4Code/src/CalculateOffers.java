public class CalculateOffers {

    UserDetails userdetails;

    public int Calculate_offer(int result, int amount) {
        if (userdetails.getLogin_stat().equalsIgnoreCase("customer")) {
            if (amount == 1) {
                return (int) (result - (result * 0.05));
            } else {
                return (int) (result - (result * 0.1));
            }
        } else if (userdetails.getLogin_stat().equalsIgnoreCase("StoreOwner")) {
            if (amount == 1) {
                return (int) (result - (result * 0.15));
            } else {
                return (int) (result - (result * 0.3));
            }
        }
        return 0;
    }
}