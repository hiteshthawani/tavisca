package com.tavisca.veberagefactory.service;

import com.tavisca.veberagefactory.model.Product;

public interface Menu {

    void addMenuItem(Product product);

    void removeMenuItem(String productName);

    Product getMenuItem(String productName);

    boolean updateProductItem(long productId);
}
