import org.junit.jupiter.api.Test;

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
}