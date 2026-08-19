package ni.edu.uam.ejemplo_g1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField tfName;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hola " + tfName.getText());
    }
}
