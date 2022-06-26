package zadanieKodillaLoty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightDatabase {

    private List<Flight> flights = new ArrayList<Flight>();

    public FlightDatabase() {

        this.flights.add(new Flight("Poznan", "Warsaw"));
        this.flights.add(new Flight("Tokyo", "Singapore"));
        this.flights.add(new Flight("Berlin", "Hamburg"));
        this.flights.add(new Flight("Hamburg", "Boston"));
        this.flights.add(new Flight("London", "Poznan"));
        this.flights.add(new Flight("Liverpool", "New York"));
        this.flights.add(new Flight("Poznan", "New York"));

    }

    public void checkIfFlightExists(String departure, String arrival) {
        for (Flight flight : flights) {
            if ((departure.equalsIgnoreCase(flight.getDeparture())) && (arrival.equalsIgnoreCase(flight.getArrival()))) {

                System.out.println("Flight from " + departure + " to " + arrival + " exists in database");
                return;
            }
        }
        System.out.println("Flight from " + departure + " to " + arrival + " doesn`t exists in database");
    }

    public void getFlightsFromCity(String city) {
        boolean isTrue = false;
        for (Flight flight : flights) {
            if (city.equalsIgnoreCase(flight.getDeparture())) {
                flight.whereToFlight();
                isTrue = true;
            }
        }
        if (!isTrue) {
            System.out.println("There is no flight from " + city);
        }
    }

    public void getFlightsToCity(String city) {
        boolean isTrue = false;
        for (Flight flight : flights) {
            if (city.equalsIgnoreCase(flight.getArrival())) {
                flight.whereToFlight();
                isTrue = true;
            }
        }
        if (!isTrue) {
            System.out.println("There is no flight to " + city);
        }
    }
}




















