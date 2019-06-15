package com.tavisca.beveragefactory.factory;

import com.tavisca.beveragefactory.strategy.ReadFromConsoleStrategy;
import com.tavisca.beveragefactory.strategy.ReadStrategy;

public class ReadFactory {

    public enum ReadStrategyType {
        READ_FROM_CONSOLE;
    }

    public static ReadStrategy getReadStrategy(ReadStrategyType indexStrategyType) {
        switch (indexStrategyType) {
            case READ_FROM_CONSOLE:
            default:
                return new ReadFromConsoleStrategy();
        }

    }

}
