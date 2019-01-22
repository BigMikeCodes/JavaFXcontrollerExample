module javaFXexample{
    requires javafx.fxml;
    requires javafx.controls;

    opens uk.co.michaelfarrant.javafxexample.controllers to javafx.fxml;
    opens uk.co.michaelfarrant.javafxexample to javafx.graphics;
}