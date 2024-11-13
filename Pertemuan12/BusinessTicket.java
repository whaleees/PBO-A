import java.util.List;

public class BusinessTicket extends Ticket {
    public BusinessTicket(double baseFare){
        super(baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare * 1.25;
    }

    @Override
    public List<String> getFacilities(){
        return List.of(
            "Premium seat",
            "Free water & snacks",
            "Priority boarding"
        );
    }

    @Override
    public String getBaggageAllowance(){
        return "30 kg allowed";
    }
}
