public class Main {
    public static void main(String[] args) {
        double baseFare = 1000.0;

        Ticket economy = new EconomyTicket(baseFare);
        Ticket business = new BusinessTicket(baseFare);
        Ticket firstClass = new FirstClassTicket(baseFare);

        System.out.println("Economy Ticket Fare: $" + economy.calculateFare());
        System.out.println("Facilities: " + economy.getFacilities());
        System.out.println("Baggage: " + economy.getBaggageAllowance());

        System.out.println("\nBusiness Ticket Fare: $" + business.calculateFare());
        System.out.println("Facilities: " + business.getFacilities());
        System.out.println("Baggage: " + business.getBaggageAllowance());

        System.out.println("\nFirst Class Ticket Fare: $" + firstClass.calculateFare());
        System.out.println("Facilities: " + firstClass.getFacilities());
        System.out.println("Baggage: " + firstClass.getBaggageAllowance());
    }
}
