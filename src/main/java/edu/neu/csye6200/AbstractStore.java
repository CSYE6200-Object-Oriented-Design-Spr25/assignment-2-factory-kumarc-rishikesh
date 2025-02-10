package edu.neu.csye6200;

import java.util.Comparator;
import java.util.List;

public abstract class AbstractStore {
    public abstract void nameSortItems(List<Item> items);

    public abstract void idSortItems(List<Item> items);

    public abstract void priceSortItems(List<Item> items);

    public abstract void sortItems(List<Item> items, Comparator<Item> c);
}
