import java.util.*;

public class Room {
    private String description;
    private HashMap<String, Room> exits; // Stores exits of the room
    
    public Room(String description) {
        this.description = description;
        exits = new HashMap<>();
    }
    
    public void setExit(String direction, Room neighbor) {
        exits.put(direction, neighbor);
    }
    
    public String getShortDescription() {
        return description;
    }

    public String getExitString() {
        String exitString = "Exits:";
        for(String direction : exits.keySet()) {
            exitString += " " + direction;
        }
        return exitString;
    }
    
    public Room getExit(String direction) {
        return exits.get(direction);
    }
}
