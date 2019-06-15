package com.tavisca.veberagefactory.strategy;

import java.util.Scanner;

public class ReadFromConsoleStrategy implements ReadStrategy {
    @Override
    public String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
