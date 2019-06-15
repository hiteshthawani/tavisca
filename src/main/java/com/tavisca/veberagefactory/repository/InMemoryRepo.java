package com.tavisca.veberagefactory.repository;

import com.tavisca.veberagefactory.model.Product;

import java.util.HashMap;

public class InMemoryRepo {

    public static final HashMap<String, Product> menuItems = new HashMap<>();
}
