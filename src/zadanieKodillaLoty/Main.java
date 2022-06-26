package zadanieKodillaLoty;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight("Poznań", "London");
        FlightDatabase flightDatabase = new FlightDatabase();
flightDatabase.checkIfFlightExists("London","Poznan");
        flightDatabase.getFlightsFromCity("poznan");
        flightDatabase.getFlightsFromCity("poznanqq");
        flightDatabase.getFlightsToCity("New York");
    }
}
