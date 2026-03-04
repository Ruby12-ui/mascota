module vallegrande.edu.pe.mascota {
    requires javafx.controls;
    requires javafx.fxml;


    opens vallegrande.edu.pe.mascota to javafx.fxml;
    exports vallegrande.edu.pe.mascota;
}