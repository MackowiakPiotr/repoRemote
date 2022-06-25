package zadanieKodillaLoty;

public class Flight {
    private String departure;
    private String arrival;

    public Flight(String departure,String arrival){
        this.departure = departure;
        this.arrival = arrival;
    }

    public void whereToFlight(){
        System.out.println("Flight from "+departure+" to "+arrival );
    }
}
