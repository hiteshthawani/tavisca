package com.tavisca.veberagefactory.model;

import java.util.HashMap;
import java.util.Objects;

public class Product {
    String productName;
    long productId;
    HashMap<String,Ingredient> ingredientList;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public HashMap<String, Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(HashMap<String, Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return getProductName().equals(product.getProductName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductName());
    }
}
