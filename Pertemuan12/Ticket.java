import java.util.List;

public class Ticket {
    protected double baseFare;

    public Ticket(double baseFare){
        this.baseFare = baseFare;
    }

    public double calculateFare(){
        return baseFare;
    }

    public List<String> getFacilities() {
        return List.of("Basic seat", "Free water");
    }

    public String getBaggageAllowance() {
        return "No extra baggage included";
    }
}