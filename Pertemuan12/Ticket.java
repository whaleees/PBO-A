public class Ticket {
    protected double baseFare;

    public Ticket(double baseFare){
        this.baseFare = baseFare;
    }

    public double calculateFare(){
        return baseFare;
    }
}