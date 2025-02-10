package edu.neu.csye6200.factory;

import edu.neu.csye6200.child.FoodItem;

public class FoodItemFactory {

    public FoodItem getObject(String csvString) {
        return new FoodItem(csvString);
    }
}
