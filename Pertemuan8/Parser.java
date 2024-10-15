import java.util.Scanner;

public class Parser {
    private CommandWords commandWords;  // holds all valid command words
    private Scanner reader;             // source of input

    public Parser() {
        commandWords = new CommandWords();
        reader = new Scanner(System.in);
    }

    public Command getCommand() {
        System.out.print("> ");  // print prompt
        String inputLine = reader.nextLine();
        String[] words = inputLine.split(" ");
        
        String word1 = words[0];
        String word2 = null;
        if (words.length > 1) {
            word2 = words[1];
        }

        if (commandWords.isCommand(word1)) {
            return new Command(word1, word2);
        } else {
            return new Command(null, null);
        }
    }
}
