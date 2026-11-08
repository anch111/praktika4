package org.example;

import org.example.task2.ConcertEvent;
import org.example.task2.ConferenceEvent;
import org.example.task2.Event;
import org.example.task2.SportEvent;

public class task4 {
    public static void main(String[] args) {
        Event[] events = {new ConcertEvent("Night of music", "08-11-2026", "EXPO, Ekaterinburg", 99999, "LadyGaga", "pop music"),
                         new ConcertEvent("Moonlight ball", "09-11-2026", "NVK", 10, "Justik Bobik", "rock"),
                         new ConferenceEvent("JavaConf 2026", "05-11-2026", "Москва", 5000, 10),
                         new ConferenceEvent("PythonConf", "10-12-2026", "СПб", 4000, 8),
                         new SportEvent("Футбол", "10-11-2026", "Казань", 2000, "Зенит", "Спартак", "Футбол"),
                         new SportEvent("Хоккей", "20-11-2026", "Москва", 1500, "ЦСКА", "Динамо", "Хоккей")};

        int tickets = 10;
        double totalPrice = 0;

        for (Event event : events){
            System.out.println(event.getDescription());

            System.out.println(event.toString());
            System.out.println();

            double eventPrice = event.calculateTotalPrice(tickets);
            totalPrice += eventPrice;
        }

        System.out.println("Выручка со всех мероприятий = " + totalPrice);
    }
}
