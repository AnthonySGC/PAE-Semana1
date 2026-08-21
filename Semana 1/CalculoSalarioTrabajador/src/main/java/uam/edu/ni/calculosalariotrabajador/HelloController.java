package uam.edu.ni.calculosalariotrabajador;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Label lblSalarioFinal;

    @FXML
    private TextField txtSalario;
    @FXML
    private void calcularSalario() {

        String textoSalario = txtSalario.getText();
        double salario = Double.parseDouble(textoSalario);
        double seguroSocial = salario * 0.07;
        double bono;
        if (salario < 12000) {
            bono = salario * 0.10;
        } else if (salario <= 20000) {
            bono = salario * 0.05;
        } else {
            bono = salario * 0.03;
        }

        double salarioConBono = salario + bono;

        lblSeguroSocial.setText(String.format("Seguro Social: %.0f", seguroSocial));
        lblBono.setText(String.format("Bono: %.0f", bono));
        lblSalarioFinal.setText(String.format("Salario con bono: %.0f", salarioConBono));




    }

    @FXML
    private Label lblSeguroSocial;

    @FXML
    private Label lblBono;
}
