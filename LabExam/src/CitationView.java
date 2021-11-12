/*
 * Nathan MacDiarmid
 * 101098993
 */

import javax.swing.*;
import java.awt.*;

public class CitationView extends JFrame {

    private CitationModel model;

    public CitationView() {
        super("Citation Machine");

        model = new CitationModel();
        model.setACMAction();
        model.setIEEAction();

        JLabel firstName = new JLabel("First Name");
        JLabel lastName = new JLabel("Last Name");

        this.setLayout(new GridLayout(4, 2));

        this.add(firstName);
        this.add(model.getFirstName());
        this.add(lastName);
        this.add(model.getLastName());
        this.add(model.getIEEEButton());
        this.add(model.getACMButton());
        this.add(model.getCitation());

        this.setSize(400, 400);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setVisible(true);
    }


    public static void main(String[] args) {
        new CitationView();
    }
}
