import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddressBook extends DefaultListModel<BuddyInfo> {

    public AddressBook() {

    }
    public void addBuddy() {
        JFrame nameFrame = new JFrame("Name");
        JFrame numberFrame = new JFrame("Number");
        JTextField name = new JTextField(30);
        JTextField number = new JTextField(30);

        BuddyInfo buddy = new BuddyInfo();

        nameFrame.setSize(400, 400);
        numberFrame.setSize(400, 400);

        nameFrame.add(name);
        numberFrame.add(number);

        nameFrame.setVisible(true);
        numberFrame.setVisible(true);

        name.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buddy.setBuddy(name.getText());
            }
        });

        number.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buddy.setNumber(number.getText());
            }
        });
        addElement(buddy);
    }

    public void removeBuddy() {
        JFrame nameFrame = new JFrame("Name and Number");
        JTextField name = new JTextField(30);
        JTextField number = new JTextField(30);
        JButton button = new JButton("OK");
        JPanel panel = new JPanel();

        nameFrame.setSize(400, 400);

        panel.add(name);
        panel.add(number);
        panel.add(button);

        nameFrame.add(panel);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < getSize(); i ++) {
                    if (name.getText().equals(get(i).getBuddy())) {
                        if (number.getText().equals(get(i).getNumber())) {
                            removeElement(get(i));
                        }

                    }
                }
                nameFrame.setVisible(false);
                nameFrame.dispose();
            }
        });

        nameFrame.setVisible(true);
    }

    public static void main(String[] args) {

        AddressView addressView = new AddressView();

        addressView.display();
    }
}
