package edu.neu.csye6200;

import edu.neu.csye6200.child.ElectronicItem;
import edu.neu.csye6200.child.FoodItem;
import edu.neu.csye6200.child.ServiceItem;
import edu.neu.csye6200.factory.ElectronicItemFactory;
import edu.neu.csye6200.factory.FoodItemFactory;
import edu.neu.csye6200.factory.ServiceItemFactory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Store extends AbstractStore {

    static List<Item> items = new ArrayList<>();
    static List<ElectronicItem> electronicItems = new ArrayList<>();
    static List<FoodItem> foodItems = new ArrayList<>();
    static List<ServiceItem> serviceItems = new ArrayList<>();

    public void demo() {

        System.out.println("Reading items from the ElectronicItems file\n");
        List<String> electronicItemsList = FileRead.readFromFile("src/main/java/edu/neu/csye6200/resources/ElectronicItems.txt");
        electronicItemsList.forEach(line -> electronicItems.add(ElectronicItemFactory.getInstance().getObject(line)));
        electronicItems.forEach(item -> System.out.println(item.toString()));
        System.out.println("\n");

        System.out.println("Reading items from the FoodItems file\n");
        List<String> foodItemsList = FileRead.readFromFile("src/main/java/edu/neu/csye6200/resources/FoodItems.txt");
        foodItemsList.forEach(line -> foodItems.add( new FoodItemFactory().getObject(line)));
        foodItems.forEach(item -> System.out.println(item.toString()));
        System.out.println("\n");

        System.out.println("Reading items from the ServiceItems file\n");
        List<String> serviceItemsList = FileRead.readFromFile("src/main/java/edu/neu/csye6200/resources/ServiceItems.txt");
        serviceItemsList.forEach(line -> serviceItems.add(ServiceItemFactory.getInstance().getObject(line)));
        serviceItems.forEach(item -> System.out.println(item.toString()));
        System.out.println("\n");

        addItemsList(electronicItems);
        addItemsList(foodItems);
        addItemsList(serviceItems);

        nameSortItems(items);
        idSortItems(items);
        priceSortItems(items);



    }

    private <T extends Item> void addItemsList(List<T> list) {
        items.addAll(list);
    }

    @Override
    public void nameSortItems(List<Item> items) {
        System.out.println("Sorting items by Name\n");
        items.sort(Comparator.comparing(o -> o.name));
        items.forEach(item -> System.out.println(item.toString()));
        System.out.println();
    }

    @Override
    public void idSortItems(List<Item> items) {
        System.out.println("Sorting items by ID\n");
        items.sort(Comparator.comparing(o -> o.id));
        items.forEach(item -> System.out.println(item.toString()));
        System.out.println();
    }

    @Override
    public void priceSortItems(List<Item> items) {
        System.out.println("Sorting items by Price\n");
        items.sort(Comparator.comparing(o -> o.price));
        items.forEach(item -> System.out.println(item.toString()));
        System.out.println();
    }

    @Override
    public void sortItems(List<Item> items, Comparator<Item> c) {
        items.sort(c);
    }
}
