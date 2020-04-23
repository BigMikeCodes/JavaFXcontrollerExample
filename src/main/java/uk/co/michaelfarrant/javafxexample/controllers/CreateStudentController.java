package uk.co.michaelfarrant.javafxexample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import uk.co.michaelfarrant.javafxexample.model.Student;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * A simple example of a JavaFX controller that handles the creation of a new instance of type Student
 * The created instance will be shown via a new window
 *
 * Error checking of user input has been omitted for brevity
 */
public class CreateStudentController implements Initializable {

    @FXML private TextField firstNameTF;
    @FXML private TextField lastNameTF;
    @FXML private TextField stuNumTF;

    @FXML private Button createStuBTN;


    public void initialize(URL url, ResourceBundle resourceBundle) {
        //assign the action for the button
        createStuBTN.setOnAction(this::handleCreateStudentBTN);
    }

    private void handleCreateStudentBTN(ActionEvent actionEvent){

        //Get the data from the elements of the view
        String fName = this.firstNameTF.getText();
        String lName = this.lastNameTF.getText();
        String stuNum = this.stuNumTF.getText();

        //Try to construct the new instance of Student
        try{
            Student student = new Student(fName, lName, stuNum);


            //Create the controller with reference to the new student
            ViewStudentController viewStudentController = new ViewStudentController(student);

            //Load and display the view
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/viewStudentView.fxml"));
            loader.setController(viewStudentController);
            Parent parent = loader.load();

            Scene scene = new Scene(parent, 275, 200);
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setScene(scene);
            stage.showAndWait();


        }
        catch(Exception e){
            //couldn't create a new student, show an alert
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("JavaFX Example - Error");
            alert.setContentText("An error occurred when trying to create, or display, a student!!!");
            alert.showAndWait();

            e.printStackTrace();

        }

    }


}
