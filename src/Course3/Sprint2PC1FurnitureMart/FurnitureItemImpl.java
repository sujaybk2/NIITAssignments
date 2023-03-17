package Course3.Sprint2PC1FurnitureMart;

public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem table = new FurnitureItem("123456789012", "table", "grade 1", "red", "indoor", 100.0);
        table.calculateDiscount();

        FurnitureItem chair = new FurnitureItem("123456789013", "chair", "grade 2", "blue", "outdoor", 50.0);
        chair.calculateDiscount();

        System.out.println(table.toString());
        System.out.println(chair.toString());
    }
}