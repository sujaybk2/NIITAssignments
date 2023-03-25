package Course1.Sprint2MC1WatAPizza;

public class PizzaOrder {
    public static void main(String[] args) {
        String customerName = "Gary";
        String email = "gary@123.com";
        long phoneNo = 412312345;
        String address = "20 Marble Drive Eville";
        int noOfPizzasOrdered = 5;
        float pizzaPrice = 12.5f;
        float pizzaTotal = noOfPizzasOrdered * pizzaPrice;
        char pizzaSize = 'M';
        int noOfGarlicBreadOrdered = 3;
        float garlicBreadPrice = 5.99f;
        float GbTotal = noOfGarlicBreadOrdered*garlicBreadPrice;
        int noOfBeveragesOrdered = 3;
        float beveragePrice = 1.99f;
        float beverageTotal = noOfBeveragesOrdered*beveragePrice;
        float totalBill = pizzaTotal + GbTotal + beverageTotal;
        boolean check = totalBill>=100;
        float discount = (float) (totalBill - (totalBill*0.1));
        System.out.println("--------------------------------");
        System.out.println("     Customer Details");
        System.out.println("--------------------------------");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Phone Number: " + phoneNo);
        System.out.println("Customer email: " + email);
        System.out.println("Customer Address: " + address);
        System.out.println("--------------------");
        System.out.println("     Order Summary");
        System.out.println("--------------------");
        System.out.println("Sr no.   ItemName   ItemQuantity   $Price/Unit   $TotalPrice");
        System.out.println("---------------------------------------------------------------");
        System.out.println("1        Pizza          " + noOfPizzasOrdered + "             " + pizzaPrice + "       " + pizzaTotal);
        System.out.println("2        Garlic Bread   " + noOfGarlicBreadOrdered + "             " + garlicBreadPrice + "       " + GbTotal);
        System.out.println("3        Beverages      " + noOfBeveragesOrdered + "             " + beveragePrice + "       " + beverageTotal);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Total Bill Amount: $" + totalBill);
        System.out.println("Discount offered: 10%");
        System.out.println("Amount to be paid: $" + discount);
        System.out.println("------------Thank you------------------------------------------");
        }
    }

