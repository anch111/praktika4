package org.example;

import java.util.Objects;

public class ConferenceEvent extends Event{

    private int speakerAmount;

    public ConferenceEvent(String name, String date, String place, double price, int speakerAmount) {
        super(name, date, place, price);
        this.speakerAmount = speakerAmount;
    }

    public int getSpeakerAmount() {return speakerAmount;}

    public String getDescription(){
        return super.getDescription() + "Спикеров: " + speakerAmount;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!super.equals(other)){ return false;}
        ConferenceEvent event = (ConferenceEvent) other;
        return speakerAmount == event.speakerAmount;
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), speakerAmount);
    }

    @Override
    public String toString() {
        return super.toString() + ", ConferenceEvent{speakers=" + speakerAmount + "}";
    }
}
