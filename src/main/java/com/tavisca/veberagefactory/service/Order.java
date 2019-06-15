package com.tavisca.veberagefactory.service;

import java.util.List;

public interface Order {

    double getOrderAmount(List<String> orderDetails);
}
