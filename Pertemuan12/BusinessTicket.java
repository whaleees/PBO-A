public class BusinessTicket extends Ticket {
    public BusinessTicket(double baseFare){
        super(baseFare);
    }

    public double calculateFare() {
        return baseFare * 0.75;
    }
}
