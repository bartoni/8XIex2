package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Controller {
    public Label label;
    public ToggleGroup toggleGroup1;

    public void handleClick(ActionEvent actionEvent) {
        RadioButton chosen = (RadioButton)toggleGroup1.getSelectedToggle();
        String text = chosen.getText();
        label.setText(text);
    }
}
