import java.util.*;

public class InventoryManagement {
    public static void main(String[] args) {

        Map<String, Integer> stock = new HashMap<>();

        // 1. Add products
        stock.put("Apple", 50);
        stock.put("Milk", 30);
        stock.put("Bread", 20);

        // 2. Customer buys items
        buyProduct(stock, "Milk", 10);
        buyProduct(stock, "Apple", 60); // out of stock ho jayega

        // 3. New shipment
        stock.put("Bread", stock.get("Bread") + 15);

        // 4. Manager query
        checkStock(stock, "Apple");
        checkStock(stock, "Chips");

        // Print out of stock list
        System.out.println("\nOut of Stock Items:");
        for (String item : stock.keySet()) {
            if (stock.get(item) == 0)
                System.out.println(item);
        }
    }

    static void buyProduct(Map<String, Integer> stock, String item, int qty) {
        if (!stock.containsKey(item)) {
            System.out.println(item + " not stocked.");
            return;
        }

        int remaining = stock.get(item) - qty;

        if (remaining <= 0) {
            stock.put(item, 0); // or stock.remove(item);
            System.out.println(item + " is now OUT OF STOCK!");
        } else {
            stock.put(item, remaining);
            System.out.println("Bought " + qty + " " + item + ". Remaining: " + remaining);
        }
    }

    static void checkStock(Map<String, Integer> stock, String item) {
        if (!stock.containsKey(item))
            System.out.println(item + " is not stocked.");
        else
            System.out.println(item + " left: " + stock.get(item));
    }
}
