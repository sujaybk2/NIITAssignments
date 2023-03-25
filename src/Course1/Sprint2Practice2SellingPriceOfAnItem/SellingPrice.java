package Course1.Sprint2Practice2SellingPriceOfAnItem;

public class SellingPrice {
    public static void main(String[] args) {
     String itemName = "kaisaBowl";
     double sellingPrice = 10.99;//decimal values can be used with float and double
   boolean test=false;

     double newTotal = sellingPrice + (5*sellingPrice)/100;
     test = newTotal > 10.99;
        System.out.println(test);
        System.out.println("Revised Selling Price for Rounded Kaisa Bowl is $" + newTotal);
    }
}
