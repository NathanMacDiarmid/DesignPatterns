import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddressView extends JFrame {

    private JFrame frame;
    private JList<BuddyInfo> view;
    private AddressBook model;

    public AddressView () {
        this.frame = new JFrame("Address Book");
        JMenuBar menuBar = new JMenuBar();
        this.view = new JList<>();
        this.model = new AddressBook();

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenu file = new JMenu("File");
        JMenuItem New = new JMenuItem("New Address Book");
        JMenuItem display = new JMenuItem("Display Buddies");
        JMenuItem add = new JMenuItem("Add Buddy");
        JMenuItem remove = new JMenuItem("Remove Buddies");

        menuBar.add(file);
        file.add(New);
        file.add(display);
        file.add(add);
        file.add(remove);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addBuddy();
            }
        });

        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.removeBuddy();
            }
        });

        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame display = new JFrame("Buddies");
                JPanel panel = new JPanel();
                panel.add(view);
                display.add(panel);

                display.setSize(400, 400);

                display.setVisible(true);
            }
        });

        New.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.removeAllElements();
            }
        });

        frame.setJMenuBar(menuBar);

        view.setModel(model);

    }

    public void display() {
        frame.setVisible(true);
    }

}
