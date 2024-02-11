public class Main {
    public static void main(String[] args) {

        final double salesTax = 0.02;
        double itemPrice = 76; //simulated input
        double shippingCost = 0;
        double totalCost = 0;
        System.out.println("The cost of the inputed item is " + itemPrice);
        if (1000000 <= itemPrice && itemPrice>= 100)//tests if itemprice is realistic value or greater then 100
        {
            System.out.println("The shipping for this item is free and the total cost is " + itemPrice);
        }
        else
        {
            shippingCost = itemPrice * salesTax;
            totalCost = itemPrice + shippingCost;//calculating values for shipping and total
            System.out.println("The shipping for this item will be " + shippingCost + " and the total cost will be " + totalCost);
        }
    }
}