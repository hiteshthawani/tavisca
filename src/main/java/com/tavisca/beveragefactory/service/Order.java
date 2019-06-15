package com.tavisca.beveragefactory.service;

import java.util.List;

public interface Order {

    double getOrderAmount(List<String> orderDetails);
}
