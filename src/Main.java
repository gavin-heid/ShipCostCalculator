import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the price of the item you want to ship");

        final double salesTax = 0.02;
        double itemPrice = 0;
        double shippingCost = 0;
        double totalCost = 0;
        if (in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            System.out.println("The cost of the inputed item is " + itemPrice);
            if (1000000 >= itemPrice && itemPrice >= 100)//tests if itemprice is realistic value or greater then 100
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
}