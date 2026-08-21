package uam.edu.ni.salariosempleados;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HelloController {

    @FXML
    private TextField txtSalario;

    @FXML
    private Label lblMayor;

    @FXML
    private Label lblMenor;

    @FXML
    private Label lblPromedio;

    @FXML
    private Label lblModa;

    // Aquí se van guardando todos los salarios
    private ArrayList<Double> salarios = new ArrayList<>();

    @FXML
    private void agregarSalario() {
        double salario = Double.parseDouble(txtSalario.getText());

        salarios.add(salario);

        txtSalario.clear();
    }

    @FXML
    private void calcularResultados() {

        if (salarios.isEmpty()) {
            return;
        }

        double mayor = salarios.get(0);
        double menor = salarios.get(0);
        double suma = 0;

        for (double salario : salarios) {

            if (salario > mayor) {
                mayor = salario;
            }

            if (salario < menor) {
                menor = salario;
            }

            suma += salario;
        }

        double promedio = suma / salarios.size();

        // Calcular la moda
        Map<Double, Integer> frecuencias = new HashMap<>();

        for (double salario : salarios) {
            frecuencias.put(
                    salario,
                    frecuencias.getOrDefault(salario, 0) + 1
            );
        }

        double moda = salarios.get(0);
        int mayorFrecuencia = 0;

        for (double salario : frecuencias.keySet()) {

            if (frecuencias.get(salario) > mayorFrecuencia) {
                mayorFrecuencia = frecuencias.get(salario);
                moda = salario;
            }
        }

        lblMayor.setText(String.format("Salario más alto: %.0f", mayor));
        lblMenor.setText(String.format("Salario más bajo: %.0f", menor));
        lblPromedio.setText(String.format("Promedio de salario: %.0f", promedio));

        if (mayorFrecuencia == 1) {
            lblModa.setText("Moda: No hay moda");
        } else {
            lblModa.setText(String.format("Moda: %.0f", moda));
        }
    }
}