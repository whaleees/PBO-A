public class Main {
    public static void main(String[] args) {
        double baseFare = 1000.0;

        Ticket economy = new EconomyTicket(baseFare);
        Ticket business = new BusinessTicket(baseFare);
        Ticket firstClass = new FirstClassTicket(baseFare);

        System.out.println("Economy Ticket Fare: $" + economy.calculateFare());
        System.out.println("Business Ticket Fare: $" + business.calculateFare());
        System.out.println("First Class Ticket Fare: $" + firstClass.calculateFare());
    }    
}
