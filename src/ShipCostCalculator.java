public class ShipCostCalculator {
    public static void main(String[] args) {

        //Enter the price of your item
        double itemPrice = 50;

        if (itemPrice >= 100)
        {
            double shippingFee = 0;
            double shippingPrice = itemPrice * shippingFee;
            double totalPrice = itemPrice + shippingPrice;

            System.out.println("The price for your shipping is $" +shippingPrice);
            System.out.println("The total price of your item is $" +totalPrice);
        }
        else
        {
            double shippingFee = 0.02;
            double shippingPrice = itemPrice * shippingFee;
            double totalPrice = itemPrice + shippingPrice;

            System.out.println("The price for your shipping is $" +shippingPrice);
            System.out.println("The total price of your item is $" +totalPrice);
        }
    }
}