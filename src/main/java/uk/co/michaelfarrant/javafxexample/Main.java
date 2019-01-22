package uk.co.michaelfarrant.javafxexample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import uk.co.michaelfarrant.javafxexample.controllers.CreateStudentController;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/newStudentView.fxml"));

        //create and set  instance of the desired controller
        CreateStudentController createStudentController = new CreateStudentController();
        loader.setController(createStudentController);
        Parent parent = loader.load();

        Scene scene = new Scene(parent, 275,200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {launch(args);}
}
