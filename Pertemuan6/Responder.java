import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Random;

public class Responder
{
    private HashMap<String, String> responseMap;
    private ArrayList<String> defaultResponses;
    private Random randomGenerator;

    public Responder()
    {
        responseMap = new HashMap<>();
        defaultResponses = new ArrayList<>();
        fillResponseMap();
        fillDefaultResponses();
        randomGenerator = new Random();
    }

    public String generateResponse(HashSet<String> words)
    {
        for (String word : words) {
            String response = responseMap.get(word);
            if(response != null) {
                return response + " Ada lagi yang bisa saya bantu?";
            }
        }
        return pickDefaultResponse();
    }

    private void fillResponseMap()
    {
        responseMap.put("lagu", 
                        "Mau denger lagu apa?");
        responseMap.put("cuaca", 
                        "Kamu ingin tahu cuaca di mana?");
        responseMap.put("alarm", 
                        "Jam berapa kamu mau set alarm?");
        responseMap.put("timer", 
                        "Berapa lama timer yang ingin kamu set?");
        responseMap.put("kalender", 
                        "Ada acara yang ingin kamu tambahkan ke kalender?");
        responseMap.put("pengingat", 
                        "Pengingat apa yang ingin kamu buat?");
        responseMap.put("berita", 
                        "Berita apa yang kamu ingin tahu hari ini?");
        responseMap.put("waktu", 
                        "Sekarang jam berapa yang ingin kamu cek?");
        responseMap.put("film", 
                        "Film apa yang sedang kamu cari?");
        responseMap.put("lokasi", 
                        "Kamu ingin saya bantu cari lokasi apa?");
        responseMap.put("pesan", 
                        "Siapa yang ingin kamu kirim pesan?");
    }

    private void fillDefaultResponses()
    {
        defaultResponses.add("Hmm, saya tidak menangkapnya. Bisa ulangi lagi?");
        defaultResponses.add("Bisa jelaskan lebih detail?");
        defaultResponses.add("Apa ada lagi yang bisa saya bantu?");
        defaultResponses.add("Saya kurang mengerti, bisa dijelaskan lebih lanjut?");
        defaultResponses.add("Itu terdengar menarik. Ada yang lain?");
        defaultResponses.add("Saya siap membantu kamu!");
        defaultResponses.add("Ceritakan lebih banyak, saya mendengarkan.");
    }

    private String pickDefaultResponse()
    {
        int index = randomGenerator.nextInt(defaultResponses.size());
        return defaultResponses.get(index) + " Ada yang lain yang ingin ditanyakan?";
    }
}
