import java.util.List;

public class FirstClassTicket extends Ticket {
    public FirstClassTicket(double baseFare){
        super(baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare * 1.5;
    }

    @Override
    public List<String> getFacilities(){
        return List.of(
            "Luxury seat",
            "Free meals",
            "Lounge access",
            "Priority boarding"
        );
    }

    @Override
    public String getBaggageAllowance(){
        return "50 kg allowed";
    }
}
