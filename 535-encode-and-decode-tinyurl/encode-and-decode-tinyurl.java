import java.util.HashMap;
import java.util.Map;

public class Codec {
    Map<Integer, String> map = new HashMap<>();
    int id = 0;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        id++;
        map.put(id, longUrl);
        return "http://tinyurl.com/" + id;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int id = Integer.parseInt(shortUrl.replace("http://tinyurl.com/", ""));
        return map.get(id);
    }
}