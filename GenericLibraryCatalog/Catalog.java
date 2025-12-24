import java.util.ArrayList;
import java.util.List;

public class Catalog<T extends LibraryItem> {

    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
        System.out.println("Item added successfully.");
    }

    public void removeItem(String itemID) {
        for (T item : items) {
            if (item.getItemID().equals(itemID)) {
                items.remove(item);
                System.out.println("Item removed successfully.");
                return;
            }
        }
        throw new IllegalArgumentException("Error: Item with ID " + itemID + " not found.");
    }

    public void displayCatalog() {
        if (items.isEmpty()) {
            System.out.println("The catalog is empty.");
        } else {
            for (T item : items) {
                System.out.println(item);
            }
        }
    }
}
