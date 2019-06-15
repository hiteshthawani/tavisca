package com.tavisca.veberagefactory.factory;

import com.tavisca.veberagefactory.service.DefaultOrderImpl;
import com.tavisca.veberagefactory.service.Order;

public class OrderFactory {

    public enum OrderType {
        DEFAULT;
    }


    public static Order getOrder(OrderType OrderType) {
        switch (OrderType) {
            case DEFAULT:
            default:
                return new DefaultOrderImpl();
        }

    }
}
