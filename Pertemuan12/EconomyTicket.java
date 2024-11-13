import java.util.List;

public class EconomyTicket extends Ticket {
    public EconomyTicket(double baseFare){
        super(baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare * 0.9;
    }

    @Override
    public List<String> getFacilities(){
        return List.of(
            "Basic seat",
            "Free water"
        );
    }

    @Override
    public String getBaggageAllowance(){
        return "20 kg allowed";
    }
}
