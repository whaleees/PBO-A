public class FirstClassTicket extends Ticket {
    public FirstClassTicket(double baseFare){
        super(baseFare);
    }

    public double calculateFare() {
        return baseFare * 0.5;
    }
}
