public class Game {
    private Room currentRoom;
    private Parser parser;
    
    public Game() {
        createRooms();
        parser = new Parser();
    }

    private void createRooms() {
        Room outside, theater, pub, lab, office;
        
        // create the rooms
        outside = new Room("outside the main entrance of the university");
        theater = new Room("in a lecture theater");
        pub = new Room("in the campus pub");
        lab = new Room("in a computing lab");
        office = new Room("in the computing admin office");

        // initialize room exits
        outside.setExit("east", theater);
        theater.setExit("west", outside);

        outside.setExit("south", lab);
        lab.setExit("north", outside);

        outside.setExit("west", pub);
        pub.setExit("east", outside);

        lab.setExit("west", office);
        office.setExit("east", lab);
        
        currentRoom = outside;  // start game outside
    }

    public void play() {
        printWelcome();
        boolean finished = false;
        while (!finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing. Good bye.");
    }

    private void printWelcome() {
        System.out.println();
        System.out.println("Welcome to the World of Zuul!");
        System.out.println("Zuul is a new, incredibly boring adventure game.");
        System.out.println("Type 'help' if you need help.");
        System.out.println();
        System.out.println(currentRoom.getShortDescription());
        System.out.println(currentRoom.getExitString());
    }

    private boolean processCommand(Command command) {
        if (command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }
        
        String commandWord = command.getCommandWord();
        if (commandWord.equals("go")) {
            goRoom(command);
        } else if (commandWord.equals("help")) {
            printHelp();
        } else if (commandWord.equals("quit")) {
            return true;
        }
        
        return false;
    }

    private void goRoom(Command command) {
        if (!command.hasSecondWord()) {
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();
        Room nextRoom = currentRoom.getExit(direction);
        
        if (nextRoom == null) {
            System.out.println("There is no door!");
        } else {
            currentRoom = nextRoom;
            System.out.println(currentRoom.getShortDescription());
            System.out.println(currentRoom.getExitString());
        }
    }

    private void printHelp() {
        System.out.println("You are lost. You are alone.");
        System.out.println("Your command words are: go quit help");
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}
