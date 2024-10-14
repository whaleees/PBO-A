import java.util.Scanner;
import java.util.HashSet;

public class InputReader
{
    private Scanner scanner;

    public InputReader() {
        scanner = new Scanner(System.in);
    }

    public String readString() {
        return scanner.nextLine();
    }

    public HashSet<String> getInput() {
        String inputLine = scanner.nextLine().trim().toLowerCase();
        String[] words = inputLine.split(" ");
        HashSet<String> wordSet = new HashSet<>();
        for(String word : words) {
            wordSet.add(word);
        }
        return wordSet;
    }
}
