package item;

import item.packing.Packing;

/**
 * Item
 * ACIT 2515 Activity name
 * Enter a brief one sentence description of what this class is
 *
 * @author Jed Iquin A00790108
 * @date 2017-03-13
 */
public interface Item {

    String name();
    Packing packing();
    float price();
}
