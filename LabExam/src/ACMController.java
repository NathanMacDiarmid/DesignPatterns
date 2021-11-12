/*
 * Nathan MacDiarmid
 * 101098993
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ACMController implements ActionListener {

    private CitationModel model;

    public ACMController(CitationModel model) {
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.getCitation().setText(model.getFirstName().getText() + " " + model.getLastName().getText() + ".");
    }
}
