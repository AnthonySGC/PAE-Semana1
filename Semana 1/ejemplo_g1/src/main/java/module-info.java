module ni.edu.uam.ejemplo_g1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.ejemplo_g1 to javafx.fxml;
    exports ni.edu.uam.ejemplo_g1;
}