package org.example;

import java.util.Objects;

public class SportEvent extends Event{

    private String team1;
    private String team2;
    private String sportType;

    public SportEvent(String name, String date, String place, double price, String team1, String team2, String sportType) {
        super(name, date, place, price);
        this.team1 = team1;
        this.team2 = team2;
        this.sportType = sportType;
    }

    public String getTeam1() {return team1;}
    public String getTeam2() {return team2;}
    public String getSportType() {return sportType;}

    public String getDescription(){
        return super.getDescription() + ", " + team1 + "vs" + team2 + ", вид спорта" + sportType;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!super.equals(other)){ return false;}
        SportEvent event = (SportEvent) other;
        return team1.equals(event.team1) && team2.equals(event.team2) && sportType.equals(event.sportType);
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), team1, team2, sportType);
    }

    @Override
    public String toString() {
        return super.toString() + ", SportEvent{teams=" + team1 + ", " + team2 + "SportType=" + sportType + "}";
    }
}
