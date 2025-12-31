import java.util.*;

public class InventoryOfItems {

    public static void main(String[] args) {
        Item item1 = new Item("01AA", "Water bottle", 500.0);
        Item item2 = new Item("01BB", "Rice", 700.0);
        Item item3 = new Item("02AA", "blackboard", 400.0);
        item1.show();
        System.out.println("----------------------------");
        item2.show();
        System.out.println("----------------------------");
        item3.show();
        System.out.println("----------------------------");
    }
}

class Item {
    String itemCode;
    String itemName;
    double itemPrice;

    Item(String itemCode, String itemName, double itemPrice) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    void show() {
        System.out.println("itemCode : " + itemCode);
        System.out.println("itemPrice : " + itemPrice);
        System.out.println("itemName : " + itemName);
    }
}
