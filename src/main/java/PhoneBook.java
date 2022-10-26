import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private final Map<String, String> map = new TreeMap<>();

    public boolean add(String name, String number) {
        return map.putIfAbsent(name, number) == null;
    }

    public String findByNumber(String number) {
        return null;
    }
}