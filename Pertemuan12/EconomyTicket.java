public class EconomyTicket extends Ticket {
    public EconomyTicket(double baseFare){
        super(baseFare);
    }

    public double calculateFare() {
        return baseFare * 0.9;
    }
}
