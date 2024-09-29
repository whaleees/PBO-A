import java.util.ArrayList;

public class MusicOrganizer {
    private ArrayList<MusicTrack> tracks;
    private MusicPlayer player;

    public MusicOrganizer() {
        tracks = new ArrayList<>();
        player = new MusicPlayer();
    }

    public void addTrack(String title, String artist, int duration) {
        MusicTrack track = new MusicTrack(title, artist, duration);
        tracks.add(track);
        System.out.println(track.getTitle() + " added to the collection.");
    }

    public void removeTrack(int index) {
        if (index >= 0 && index < tracks.size()) {
            MusicTrack removedTrack = tracks.remove(index);
            System.out.println(removedTrack.getTitle() + " removed from the collection.");
        } else {
            System.out.println("Invalid index. No track removed.");
        }
    }

    public void startPlayingTrack(int index) {
        if (index >= 0 && index < tracks.size()) {
            MusicTrack track = tracks.get(index);
            player.startPlaying(track);
        } else {
            System.out.println("Invalid index. No track to play.");
        }
    }

    public void stopPlaying() {
        player.stop();
    }

    public void listAllTracks() {
        if (tracks.isEmpty()) {
            System.out.println("No tracks in the collection.");
        } else {
            for (int i = 0; i < tracks.size(); i++) {
                System.out.println((i + 1) + ". " + tracks.get(i).toString());
            }
        }
    }

    public void listMatchingTracks(String searchString) {
        boolean found = false;
        for (MusicTrack track : tracks) {
            if (track.getTitle().contains(searchString) || track.getArtist().contains(searchString)) {
                System.out.println(track);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching tracks found for: " + searchString);
        }
    }

    public int findFirstMatchingTrack(String searchString) {
        for (int i = 0; i < tracks.size(); i++) {
            MusicTrack track = tracks.get(i);
            if (track.getTitle().contains(searchString) || track.getArtist().contains(searchString)) {
                return i + 1;
            }
        }
        return -1; // return -1 if no match found
    }

    public int getTotalTracks() {
        return tracks.size();
    }
}
