module com.example.practica1_simulacion_persecucion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practica1_simulacion_persecucion to javafx.fxml;
    exports com.example.practica1_simulacion_persecucion;
}