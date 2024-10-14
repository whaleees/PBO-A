import java.util.HashSet;

public class SupportSystem
{
    private InputReader reader;
    private Responder responder;
    
    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
    }

    public void start()
    {
        boolean finished = false;

        printWelcome();

        while(!finished) {
            System.out.print("\n> ");
            HashSet<String> input = reader.getInput();

            if(input.contains("bye")) {
                finished = true;
            }
            else {
                String response = responder.generateResponse(input);
                System.out.println(response);
            }
        }
        printGoodbye();
    }

    private void printWelcome()
    {
        System.out.println();
        System.out.println(responder.getTimeBasedGreeting());
        System.out.println("\nSelamat Datang di Lala Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }

    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }
}
