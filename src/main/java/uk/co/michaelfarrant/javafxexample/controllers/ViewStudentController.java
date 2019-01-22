package uk.co.michaelfarrant.javafxexample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import uk.co.michaelfarrant.javafxexample.model.Student;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Another simple controller example that sets the values of the TextFields to the values held
 * within a given Student instance.
 */
public class ViewStudentController implements Initializable {

    @FXML private TextField stuFnameTF;
    @FXML private TextField stuLnameTF;
    @FXML private TextField stuNumTF;

    private Student student;

    public ViewStudentController(Student student){
        this.student = student;
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
        //set the TextFields on the view to the student data held in this.student
        this.stuFnameTF.setText(this.student.getFirstname());
        this.stuLnameTF.setText(this.student.getLastName());
        this.stuNumTF.setText(this.student.getStudentNumber());
    }
}
