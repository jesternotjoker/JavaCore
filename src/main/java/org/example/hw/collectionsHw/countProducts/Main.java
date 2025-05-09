package org.example.hw.collectionsHw.countProducts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        /*
        2. Подсчёт слов в списке
        Дан лист продуктов. Напишите метод, которая подсчитывает, сколько раз встречается продукт в  списке
         */
        List<String> products = new ArrayList<>();
        products.add("Молоко");
        products.add("Сыр");
        products.add("Чай");
        products.add("Молоко");
        products.add("Печенье");
        products.add("Сыр");
        products.add("Молоко");
        products.add("Гречка");
        products.add("Сыр");
        products.add("Чай");

        howMuchProductsAllInList(products);
        System.out.println();
        howMuchProductInList(products, "Сыр");
        howMuchProductInList(products, "Гречка");
        howMuchProductInList(products, "Творог");
    }

    public static void howMuchProductsAllInList(List<String> elements){
        Map<String,Integer> elementsCount =  getDictionaryFromList(elements);
        List<Map.Entry<String, Integer>> listResult = new ArrayList<>(elementsCount.entrySet());
        listResult.sort(Map.Entry.comparingByKey());
        System.out.println(listResult);
    }

    public static void howMuchProductInList(List<String> elements, String element){
        int count = 0;
        Map<String,Integer> elementsCount =  getDictionaryFromList(elements);
        if (elementsCount.containsKey(element)) count = elementsCount.get(element);
        System.out.println("Продукт " + element + " встречается в списке " + count + " раз(а)");
    }

    public static Map<String,Integer> getDictionaryFromList(List<String> elements){
        Map<String,Integer> elementsMap = new TreeMap<>();
        for (String element : elements) {
            elementsMap.put(element, elementsMap.getOrDefault(element, 0) + 1);
        }
        return elementsMap;
    }
}
