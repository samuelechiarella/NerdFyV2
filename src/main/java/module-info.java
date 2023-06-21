module com.example.nerdfyv2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.unical.nerdfy to javafx.fxml;
    exports com.unical.nerdfy;
    exports com.unical.nerdfy.controller;
    opens com.unical.nerdfy.controller to javafx.fxml;
}