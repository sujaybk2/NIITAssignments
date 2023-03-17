package Course3.Sprint3PC2FurnitureMart;

public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem furnitureItem = new FurnitureItem();
        furnitureItem.setFurnitureCode(101);
        furnitureItem.setFurnitureType("table");
        furnitureItem.setGradeOfFurniture("grade1");
        furnitureItem.setFurnitureUsage("outdoor");
        furnitureItem.setPrice(10.0);

        double discountedPrice = furnitureItem.getPrice() - furnitureItem.calculateDiscount();
        System.out.println("Discounted price is $" + discountedPrice);
    }
}

