package com.tavisca.beveragefactory.factory;

import com.tavisca.beveragefactory.service.DefaultMenuImpl;
import com.tavisca.beveragefactory.service.Menu;

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
