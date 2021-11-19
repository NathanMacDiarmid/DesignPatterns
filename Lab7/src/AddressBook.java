import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class AddressBook extends DefaultListModel<BuddyInfo> {

    public AddressBook() {
    }
    public void addBuddy(BuddyInfo buddy) {
        addElement(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        removeElement(buddy);
    }

    public void save(String filename) {
        try {
            Writer w = new FileWriter(filename);
            String s = "";
            for (int i = 0; i < size(); i++) {
                if (i == size() - 1) {
                    s += get(i).toString();
                }
                else {
                    s += get(i).toString() + "\n";
                }
            }
            w.write(s);
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void importAddressBook(String filename) {
        try {
            Scanner fileText = new Scanner(new File(filename));
            while (fileText.hasNextLine()) {
                addBuddy(BuddyInfo.importBuddyInfo(fileText.nextLine()));
            }
            fileText.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AddressBook book = new AddressBook();
        BuddyInfo b1 = new BuddyInfo();
        BuddyInfo b2 = new BuddyInfo();
        b2.setAddress("Miramichi NB");
        b2.setBuddy("Nathan");
        b2.setNumber("123456789");
        book.addBuddy(b1);
        book.addBuddy(b2);

        book.save("output.txt");

        book.save("output.txt");

        AddressBook book2 = new AddressBook();
        book2.importAddressBook("output.txt");
        for (int i = 0; i < book2.size(); i++) {
            System.out.println(book2.get(i).toString());
        }

    }
}
