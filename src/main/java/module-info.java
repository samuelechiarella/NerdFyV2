module com.example.nerdfyv2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.nerdfyv2 to javafx.fxml;
    exports com.example.nerdfyv2;
}