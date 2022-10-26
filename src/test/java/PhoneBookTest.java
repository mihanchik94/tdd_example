import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class PhoneBookTest {
    @Test
    public void whenAddContact() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Boris";
        String number = "8(800) 555-35-35";
        assertThat(phoneBook.add(name, number)).isTrue();
    }

    @Test
    public void whenFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Boris";
        String number = "8(800) 555-35-35";
        phoneBook.add(name, number);
        assertThat(phoneBook.findByNumber(number)).isEqualTo(name);
    }

    @Test
    public void whenFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Boris";
        String number = "8(800) 555-35-35";
        phoneBook.add(name, number);
        assertThat(phoneBook.findByName(name)).isEqualTo(number);
    }

    @Test
    public void whenPrintAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        String name1 = "Boris";
        String number1 = "8(800) 555-35-35";
        String name2 = "Anton";
        String number2 = "223 322 223 322";
        String name3 = "Oleg";
        String number3 = "363 00 00";
        phoneBook.add(name1, number1);
        phoneBook.add(name2, number2);
        phoneBook.add(name3, number3);
        List<String> expected = List.of(name2, name1, name3);
        assertThat(phoneBook.printAllNames()).isEqualTo(expected);
    }
}