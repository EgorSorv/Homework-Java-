package org.example.hw.sem3;

import org.example.hw.sem3.model.Goods;

import java.util.ArrayList;
import java.util.List;

public class ex1 {
    public static void main(String[] args) {
        Goods good1 = new Goods("высший апельсин", 200, 1);
        Goods good2 = new Goods("мука высшая", 100, 3);
        Goods good3 = new Goods("гречка", 250, 1);
        Goods good4 = new Goods("банан", 100, 2);
        Goods good5 = new Goods("высший помидор",50, 3);
        Goods good6 = new Goods("огурец высший",150, 2);
        Goods good7 = new Goods("высший ананас",275, 1);
        Goods good8 = new Goods("гранат",75, 3);
        Goods good9 = new Goods("высшее яблоко",170, 1);
        Goods good10 = new Goods("вишня",100, 2);;

        List<Goods> goodsList = new ArrayList<>();

        goodsList.add(good1);
        goodsList.add(good2);
        goodsList.add(good3);
        goodsList.add(good4);
        goodsList.add(good5);
        goodsList.add(good6);
        goodsList.add(good7);
        goodsList.add(good8);
        goodsList.add(good9);
        goodsList.add(good10);

        int max = goodsList.get(0).getCost();

        String[] superiorNamesList = {"высший", "высшее", "высшая", "высшие"};

        List<Integer> costList = new ArrayList<>();

        for (Goods goods : goodsList) {
            for (String s : superiorNamesList) {
                if (goods.getName().toLowerCase().contains(s)
                        && (goods.getSort() == 1 || goods.getSort() == 2)) costList.add(goods.getCost());
            }

        }

        for (Integer integer : costList) {
            if (integer > max) max = integer;
        }

        System.out.printf("Наибольшая цена товаров 1го или 2го сорта среди товаров, название которых содержит «высший» => %d", max);
    }
}
