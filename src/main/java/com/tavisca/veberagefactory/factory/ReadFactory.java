package com.tavisca.veberagefactory.factory;

import com.tavisca.veberagefactory.strategy.ReadFromConsoleStrategy;
import com.tavisca.veberagefactory.strategy.ReadStrategy;

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
