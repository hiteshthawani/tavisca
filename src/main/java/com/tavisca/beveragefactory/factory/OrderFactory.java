package com.tavisca.beveragefactory.factory;

import com.tavisca.beveragefactory.service.DefaultOrderImpl;
import com.tavisca.beveragefactory.service.Order;

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
