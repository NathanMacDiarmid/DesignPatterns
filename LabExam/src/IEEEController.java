/*
 * Nathan MacDiarmid
 * 101098993
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IEEEController implements ActionListener {

    private CitationModel model;

    public IEEEController(CitationModel model) {
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.getCitation().setText(model.getFirstName().getText().charAt(0) + "." + " " + model.getLastName().getText());
    }
}
