package com.tavisca.veberagefactory.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadFromConsoleStrategy implements ReadStrategy {
    @Override
    public List<String> read() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> orderItems = new ArrayList<>();

        Pattern p = Pattern.compile("\"([^\"]*)\"");
        Matcher m = p.matcher(input);
        while (m.find()) {
            orderItems.add(m.group(1));
        }


        return orderItems;
    }
}
