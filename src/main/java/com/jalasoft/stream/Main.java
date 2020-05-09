/*****************************************************************************************
 *
 *  Copyright (c) 2020 Jalasoft.
 *
 * This software is the confidential and proprietary information of Jalasoft.
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Jalasoft.
 ****************************************************************************************/

package com.jalasoft.stream;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> paises = new ArrayList<String>();
        paises.add("Bolivia");
        paises.add("Argentina");
        paises.add("Argelia");
        paises.add("Portugal");
        paises.add("Italia");
        paises.add("Australia");
        System.out.println("All countries are:");
        paises.forEach(s -> System.out.println(s));
        filterA(paises);
        minLong(paises);
        nameEven(paises);
    }

    //this class filters all countries that starts with "A"
    private static void filterA(List<String> paises) {
        System.out.println("-----------------------------------");
        paises.stream().filter(s -> s.startsWith("A")).forEach(s -> System.out.println(s));

    }

    //this class filters all countries that have more than 5 characters
    private static void minLong(List<String> paises) {
        System.out.println("-----------------------------------");
        paises.stream().filter(s -> s.length() > 5).forEach(System.out::println);
    }

    //this class filters all the countries with even number of characters
    private static void nameEven(List<String> paises) {
        System.out.println("-----------------------------------");
        paises.stream().filter(s -> s.length() % 2 == 0).forEach(System.out::println);
    }
}
