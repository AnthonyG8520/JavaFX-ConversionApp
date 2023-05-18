module com.example.javafxconversionapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxconversionapp to javafx.fxml;
    exports com.example.javafxconversionapp;
}