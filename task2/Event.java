package org.example;

import java.util.Objects;

public class Event {
    private String name;
    private String date;
    private String place;
    private double price;

    public Event(String name, String date, String place, double price){
        this.name = name;
        this.date = date;
        this.place = place;
        this.price = price;
    }

    public String getName() {return name;}
    public String getDate() {return date;}
    public String getPlace() {return place;}
    public double getPrice() {return price;}

    public String getDescription(){
        return "Название: " + name + ", дата: " + date + ", место проведения: " + place;
    }

    public double calculateTotalPrice(int tiketsAmount) {
        return price * tiketsAmount;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()){ return false;}
        Event event = (Event) other;
        return Double.compare(event.price, price) == 0 && name.equals(event.name) && date.equals(event.date) && place.equals(event.place);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, date, place, price);
    }

    @Override
    public String toString() {
        return "Event{name='" + name + "', date='" + date + "', location='" + place + "', price=" + price + "}";
    }

    public static void main(String[] args) {
        Event conference = new ConferenceEvent("JavaConf 2026", "2026-11-05", "Москва",
                5000, 10);
        Event concert = new ConcertEvent("Рок-концерт", "2026-12-01", "СПб",
                3000, "Кино", "Рок");
        Event sport = new SportEvent("Футбол", "2026-11-10", "Казань",
                2000, "Зенит", "Спартак", "Футбол");

        Event[] events = {conference, concert, sport};

        for (Event event : events) {
            System.out.println(event.getDescription());
            System.out.println("Цена за 2 билета: " + event.calculateTotalPrice(2));
            System.out.println();
        }
    }
}
