/*
 * Nathan MacDiarmid
 * 101098993
 */

import javax.swing.*;

public class CitationModel {

    private JTextField firstName;
    private JTextField lastName;
    private JButton IEEEButton;
    private JButton ACMButton;
    private JTextField citation;

    public CitationModel() {
        firstName = new JTextField(15);
        lastName = new JTextField(15);
        IEEEButton = new JButton("IEEE");
        ACMButton = new JButton("ACM");
        citation = new JTextField();
    }

    public JTextField getFirstName() {
        return firstName;
    }

    public JTextField getLastName() {
        return lastName;
    }

    public JButton getIEEEButton() {
        return IEEEButton;
    }

    public JButton getACMButton() {
        return ACMButton;
    }

    public JTextField getCitation() {
        return citation;
    }

    public void setACMAction() {
        ACMButton.addActionListener(new ACMController(this));
    }

    public void setIEEAction() {
        IEEEButton.addActionListener(new IEEEController(this));
    }

}
