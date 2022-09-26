public class ShippingCost {
    public static void main(String[] args) {

        double itemPrice = 200;
        double totalCost;
        double shippingCost = 0;
        double tax = 0.02;


        if (itemPrice < 100){
            shippingCost = tax * itemPrice;
            totalCost = shippingCost + itemPrice;
        }

        totalCost = shippingCost + itemPrice;

        System.out.println("The item cost is: $" + itemPrice);
        System.out.println("The shipping cost is: $" + shippingCost);
        System.out.println("The total cost is: $" + totalCost);

    }
}
