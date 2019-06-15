package com.tavisca.beveragefactory.repository;

import com.tavisca.beveragefactory.model.Product;

import java.util.HashMap;

public class InMemoryRepo {

    public static final HashMap<String, Product> menuItems = new HashMap<>();
}
