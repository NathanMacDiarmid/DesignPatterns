import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class AddressBookTest {

    @Test
    public void saveTest() throws IOException {
        AddressBook book1 = new AddressBook();
        BuddyInfo b1 = new BuddyInfo();
        BuddyInfo b2 = new BuddyInfo();
        b2.setAddress("Miramichi NB");
        b2.setBuddy("Nathan");
        b2.setNumber("123456789");

        book1.save("output.txt");

        BufferedReader br = new BufferedReader(new FileReader("output.txt"));
        assertNull(br.readLine());

        book1.addBuddy(b1);
        book1.addBuddy(b2);

        book1.save("output.txt");

        br = new BufferedReader(new FileReader("output.txt"));

        assertEquals(br.readLine(), "Babak#1233 Colonel By Dr.#123-456-7890");
        assertEquals(br.readLine(), "Nathan#Miramichi NB#123456789");

    }

    @Test
    public void importAddressBookTest() throws IOException {
        AddressBook book1 = new AddressBook();
        AddressBook book2 = new AddressBook();
        BuddyInfo b1 = new BuddyInfo();
        BuddyInfo b2 = new BuddyInfo();
        b2.setAddress("Miramichi NB");
        b2.setBuddy("Nathan");
        b2.setNumber("123456789");

        book1.addBuddy(b1);
        book1.addBuddy(b2);

        assertEquals(0, book2.size());

        book2.importAddressBook("output.txt");

        assertEquals(book1.size(), book2.size());

        BufferedReader br = new BufferedReader(new FileReader("output.txt"));

        String buddy1 = br.readLine();
        String buddy2 = br.readLine();

        assertEquals(buddy1, book2.elementAt(0).toString());
        assertEquals(buddy2, book2.elementAt(1).toString());
    }

    @Test
    public void containsSameTest() {
        AddressBook book1 = new AddressBook();
        AddressBook book2 = new AddressBook();
        BuddyInfo b1 = new BuddyInfo();
        BuddyInfo b2 = new BuddyInfo();
        b2.setAddress("Miramichi NB");
        b2.setBuddy("Nathan");
        b2.setNumber("123456789");

        book1.addBuddy(b1);
        book1.addBuddy(b2);

        book2.importAddressBook("output.txt");

        String buddy1 = book1.elementAt(0).toString();
        String buddy2 = book1.elementAt(1).toString();

        assertEquals(buddy1, book2.elementAt(0).toString());
        assertEquals(buddy2, book2.elementAt(1).toString());
    }
}
