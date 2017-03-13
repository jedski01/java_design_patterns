import item.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Meal
 * ACIT 2515 Activity name
 * Enter a brief one sentence description of what this class is
 *
 * @author Jed Iquin A00790108
 * @date 2017-03-13
 */
public class Meal {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public double getCost() {

        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }

        return cost;
    }

    public void showItems() {

        for (Item item : items) {
            System.out.print("Item: " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
