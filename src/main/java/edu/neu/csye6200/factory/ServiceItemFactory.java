package edu.neu.csye6200.factory;


import edu.neu.csye6200.child.ServiceItem;

public class ServiceItemFactory {

    private static final ServiceItemFactory instance = new ServiceItemFactory();

    private ServiceItemFactory() {

    }

    public static ServiceItemFactory getInstance() {
        return instance;
    }


    public ServiceItem getObject(String csvString) {
        return new ServiceItem(csvString);
    }
}
