import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private final Map<String, String> map = new TreeMap<>();

    public boolean add(String name, String number) {
        return map.putIfAbsent(name, number) == null;
    }

    public String findByNumber(String number) {
        String name = "Номера нет в списке контактов";
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(number)) {
                name = entry.getKey();
            }
        }
        return name;
    }
}