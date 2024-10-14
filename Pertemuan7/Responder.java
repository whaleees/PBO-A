import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Random;
import java.time.format.DateTimeFormatter;

public class Responder
{
    private HashMap<String, String> responseMap;
    private HashMap<String, String> triggerSynonyms;
    private ArrayList<String> defaultResponses;
    private Random randomGenerator;

    public Responder()
    {
        responseMap = new HashMap<>();
        triggerSynonyms = new HashMap<>(); 
        defaultResponses = new ArrayList<>();
        fillResponseMap();
        fillDefaultResponses();
        randomGenerator = new Random();
    }

    public String generateResponse(HashSet<String> words)
    {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        for (String word : words) {
            String response = responseMap.get(word);

            if (response == null) {
                String mappedWord = triggerSynonyms.get(word); 
                if (mappedWord != null) {
                    response = responseMap.get(mappedWord); 
                }
            }
            
            if ("waktu".equals(word) || "waktu".equals(triggerSynonyms.get(word))) {
                return "Waktu saat ini adalah: " + LocalTime.now().format(timeFormatter) + ". Ada yang lain yang bisa saya bantu?";
            }

            if (response != null) {
                if(response.endsWith("?")){
                    return response;
                }
                return response + " Ada yang lain yang bisa saya bantu?";
            }
        }

        return pickDefaultResponse();
    }

    private void fillResponseMap(){
        responseMap.put("lagu", "Mau denger lagu apa?");
        responseMap.put("cuaca", "Kamu ingin tahu cuaca di mana?");
        responseMap.put("alarm", "Jam berapa kamu mau set alarm?");
        responseMap.put("timer", "Berapa lama timer yang ingin kamu set?");
        responseMap.put("kalender", "Ada acara yang ingin kamu tambahkan ke kalender?");
        responseMap.put("pengingat", "Pengingat apa yang ingin kamu buat?");
        responseMap.put("berita", "Berita apa yang kamu ingin tahu hari ini?");
        responseMap.put("film", "Film apa yang sedang kamu cari?");
        responseMap.put("lokasi", "Kamu ingin saya bantu cari lokasi apa?");
        responseMap.put("pesan", "Siapa yang ingin kamu kirim pesan?");
        responseMap.put("hai", "Ada yang bisa saya bantu??"); 

        triggerSynonyms.put("musik", "lagu");
        triggerSynonyms.put("song", "lagu");
        triggerSynonyms.put("weather", "cuaca");
        triggerSynonyms.put("set alarm", "alarm");
        triggerSynonyms.put("reminder", "pengingat");
        triggerSynonyms.put("movie", "film");
        triggerSynonyms.put("kabar", "berita");
        triggerSynonyms.put("hi", "hai");
        triggerSynonyms.put("hey", "hai");
        triggerSynonyms.put("hei", "hai");
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

    public String getTimeBasedGreeting()
    {
        LocalTime now = LocalTime.now();
        if (now.isBefore(LocalTime.NOON)) {
            return "Selamat pagi! Ada yang bisa saya bantu?";
        } else if (now.isBefore(LocalTime.of(18, 0))) {
            return "Selamat siang! Ada yang bisa saya bantu?";
        } else {
            return "Selamat malam! Ada yang bisa saya bantu?";
        }
    }
}
