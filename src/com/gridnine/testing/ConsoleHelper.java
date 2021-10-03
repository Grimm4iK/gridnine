package com.gridnine.testing;

import java.util.List;

public class ConsoleHelper {

    public static void printFlights(List<Flight> flights) {
        for (Flight flight : flights) {
            System.out.println(flight);
            System.out.println("-----");
        }
        System.out.println("Выберите фильтр:\n1 - Исключить из списка вылет до текущего момента времени\n" +
                "2 - Исключить из списка полёты, где имеются сегменты с датой прилёта раньше даты вылета\n" +
                "3 - Исключить из списка полёты, при которых общее время, проведённое на земле превышает два часа\n" +
                "4 - выход");
    }
}
