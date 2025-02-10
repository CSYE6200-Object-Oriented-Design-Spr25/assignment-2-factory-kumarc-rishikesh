package edu.neu.csye6200.child;

import edu.neu.csye6200.Item;

public class FoodItem extends Item {

    public FoodItem(String csvStr){
        String[] members = csvStr.split(",");
        this.id = Integer.parseInt(members[0].trim());
        this.name =  members[1].trim();
        this.price = Double.parseDouble(members[2].trim());
    }

    @Override
    public String toString() {
        return this.id+" "+this.name+" "+this.price;
    }
}
