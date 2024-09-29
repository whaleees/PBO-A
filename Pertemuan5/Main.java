public class Main {
    public static void main(String[] args) {
        MusicOrganizer organizer = new MusicOrganizer();

        organizer.addTrack("Seandainya", "Vierra", 300);
        organizer.addTrack("Terlalu lama", "Vierra", 200);
        organizer.addTrack("Bohemian Rhapsody", "Queen", 360);

        System.out.println("\nAll tracks:");
        organizer.listAllTracks();

        System.out.println("\nPlaying track 1:");
        organizer.startPlayingTrack(0);

        System.out.println("\nStopping track:");
        organizer.stopPlaying();

        System.out.println("\nFinding first track matching 'Queen':");
        int index = organizer.findFirstMatchingTrack("Queen");
        if (index != -1) {
            System.out.println("Track found at index: " + index);
        } else {
            System.out.println("No matching track found.");
        }

        System.out.println("\nRemoving track 2:");
        organizer.removeTrack(1);

        System.out.println("\nAll tracks after removal:");
        organizer.listAllTracks();
    }
}
