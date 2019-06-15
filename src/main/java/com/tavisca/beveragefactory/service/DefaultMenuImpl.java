package com.tavisca.beveragefactory.service;

import com.tavisca.beveragefactory.model.Product;
import com.tavisca.beveragefactory.repository.InMemoryRepo;

public class DefaultMenuImpl implements Menu {

    public void addMenuItem(Product product) {
        InMemoryRepo.menuItems.put(product.getProductName(), product);
    }

    public void removeMenuItem(String productName) {
        InMemoryRepo.menuItems.remove(productName);
    }

    public Product getMenuItem(String productName) {
        return InMemoryRepo.menuItems.get(productName);
    }

    @Override
    public boolean updateProductItem(long productId) {
        return false;
    }


}
