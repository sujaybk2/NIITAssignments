package Course3.Sprint2PC1FurnitureMart;

public class FurnitureItem {
    private String furnitureCode;
    private String furnitureType;
    private String gradeOfFurniture;
    private String color;
    private String furnitureUsage;
    private double price;

    public FurnitureItem() {
        furnitureCode = "000000000000";
        furnitureType = "";
        gradeOfFurniture = "";
        color = "";
        furnitureUsage = "";
        price = 0.0;
    }

    public FurnitureItem(String furnitureCode, String furnitureType, String gradeOfFurniture, String color, String furnitureUsage, double price) {
        this.furnitureCode = furnitureCode;
        this.furnitureType = furnitureType;
        this.gradeOfFurniture = gradeOfFurniture;
        this.color = color;
        this.furnitureUsage = furnitureUsage;
        this.price = price;
    }

    public void calculateDiscount() {
        if (furnitureUsage.equalsIgnoreCase("outdoor")) {
            price *= 0.95; // 5% discount
        }
    }

    public String toString() {
        return "Furniture code: " + furnitureCode + "\n"
                + "Furniture type: " + furnitureType + "\n"
                + "Grade of furniture: " + gradeOfFurniture + "\n"
                + "Color: " + color + "\n"
                + "Furniture usage: " + furnitureUsage + "\n"
                + "Price: " + price + "\n";
    }
}


