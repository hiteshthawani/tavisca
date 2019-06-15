package com.tavisca.beveragefactory.service;

import com.tavisca.beveragefactory.model.Product;

public interface Menu {

    void addMenuItem(Product product);

    void removeMenuItem(String productName);

    Product getMenuItem(String productName);

    boolean updateProductItem(long productId);
}
