public class MusicPlayer {
    private boolean isPlaying;
    private MusicTrack currentTrack;

    public void startPlaying(MusicTrack track) {
        if (track != null) {
            currentTrack = track;
            isPlaying = true;
            System.out.println("Playing: " + track);
        } else {
            System.out.println("No track to play.");
        }
    }

    public void stop() {
        if (isPlaying && currentTrack != null) {
            System.out.println("Stopping: " + currentTrack.getTitle());
            isPlaying = false;
            currentTrack = null;
        } else {
            System.out.println("No track is currently playing.");
        }
    }

    public boolean isPlaying() {
        return isPlaying;
    }
}
