package com.tavisca.veberagefactory.factory;

import com.tavisca.veberagefactory.service.DefaultMenuImpl;
import com.tavisca.veberagefactory.service.Menu;

public class MenuFactory {

    public enum MenuType {
        DEFAULT;
    }


    public static Menu getMenu(MenuType menuType) {
        switch (menuType) {
            case DEFAULT:
            default:
                return new DefaultMenuImpl();
        }

    }
}
