package edu.neu.csye6200.factory;

import edu.neu.csye6200.child.ElectronicItem;

public class ElectronicItemFactory {

    private static ElectronicItemFactory instance;

    private ElectronicItemFactory() {
        instance = null;
    }

    public static ElectronicItemFactory getInstance() {
        if (instance == null) {
            synchronized (ServiceItemFactory.class) {
                if (instance == null) {
                    instance = new ElectronicItemFactory();
                }
            }
        }
        return instance;
    }


    public ElectronicItem getObject(String csvString) {
        return new ElectronicItem(csvString);
    }
}
