package com.tavisca.beveragefactory.service;

import com.tavisca.beveragefactory.constants.ExceptionMessages;
import com.tavisca.beveragefactory.exceptions.InvalidOrderException;
import com.tavisca.beveragefactory.factory.MenuFactory;
import com.tavisca.beveragefactory.model.Ingredient;
import com.tavisca.beveragefactory.model.Product;

import java.util.*;

public class DefaultOrderImpl implements Order {
    @Override
    public double getOrderAmount(List<String> orderDetails) {

        Menu menu = MenuFactory.getMenu(MenuFactory.MenuType.DEFAULT);

        double orderAmount = 0;
        double amountToBeDeducted = 0;
        HashSet<String> ingredientsToBeRemoved = new HashSet<>();

        for (String order : orderDetails) {
            String[] orderBreakup = order.split(",");
            Product product = menu.getMenuItem(orderBreakup[0]);
            final HashMap<String, Ingredient> ingredientList = product.getIngredientList();
            orderAmount = orderAmount + product.getProductCost();

            Arrays.stream(orderBreakup)
                    .filter(itemToBeRemoved -> itemToBeRemoved.contains("-"))
                    .forEach(itemToBeRemoved -> ingredientsToBeRemoved.add(itemToBeRemoved.substring(1)));


            for (String ingridient : ingredientsToBeRemoved) {
                Ingredient ingredient = ingredientList.get(ingridient);
                if (ingredient.getPrice() == 0)
                    throw new InvalidOrderException(ExceptionMessages.ITEM_REMOVAL_NOT_ALLOWED);
                else
                    amountToBeDeducted = amountToBeDeducted + ingredient.getPrice();

            }


        }

        return orderAmount - amountToBeDeducted;
    }

}
