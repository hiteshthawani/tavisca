package com.tavisca.veberagefactory;

import com.tavisca.veberagefactory.factory.OrderFactory;
import com.tavisca.veberagefactory.factory.ReadFactory;
import com.tavisca.veberagefactory.model.Ingredient;
import com.tavisca.veberagefactory.model.Product;
import com.tavisca.veberagefactory.repository.InMemoryRepo;
import com.tavisca.veberagefactory.service.Order;
import com.tavisca.veberagefactory.strategy.ReadStrategy;

import java.util.HashMap;
import java.util.List;

public class BeverageApp {

    static {

        Product coffeeLatte = new Product();
        coffeeLatte.setProductName("Coffee Latte");
        HashMap<String, Ingredient> ingredientMap = new HashMap<>();

        Ingredient coffee = new Ingredient();
        coffee.setName("Coffee");
        coffee.setPrice(0);

        Ingredient milk = new Ingredient();
        milk.setName("milk");
        milk.setPrice(1);

        Ingredient sugar = new Ingredient();
        sugar.setName("sugar");
        sugar.setPrice(0.5);


        Ingredient water = new Ingredient();
        water.setName("water");
        water.setPrice(0);

        ingredientMap.put("Coffee", coffee);
        ingredientMap.put("milk", milk);
        ingredientMap.put("water", water);
        ingredientMap.put("sugar", sugar);
        coffeeLatte.setIngredientList(ingredientMap);
        coffeeLatte.setProductCost(5);
        InMemoryRepo.menuItems.put("Coffee Latte", coffeeLatte);
    }

    public static void main(String[] args) {
        ReadStrategy readStrategy = ReadFactory.getReadStrategy(ReadFactory.ReadStrategyType.READ_FROM_CONSOLE);
        Order order = OrderFactory.getOrder(OrderFactory.OrderType.DEFAULT);

        List<String> orderItems = readStrategy.read();
        double orderAmount = order.getOrderAmount(orderItems);
        System.out.println(orderAmount);

    }


}
