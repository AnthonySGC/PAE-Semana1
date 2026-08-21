module uam.edu.ni.salariosempleados {
    requires javafx.controls;
    requires javafx.fxml;


    opens uam.edu.ni.salariosempleados to javafx.fxml;
    exports uam.edu.ni.salariosempleados;
}