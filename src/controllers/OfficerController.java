package controllers;


import gateways.ClientGateway;
import gateways.Gateway;
import gateways.OfficerGateway;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import models.Client;
import models.Officer;

public class OfficerController {

    @FXML
    TextField NameOfficerTF;

    @FXML
    TextField SNameOfficerTF;

    @FXML
    TextField ageOfOfficer;

    @FXML
    TextField WorkExperience;

    @FXML
    TextField WorkSchedule;

    @FXML
    Pane ClientPane;

    @FXML
    Pane OfficerPane;

    @FXML
    Gateway<Officer> officerGateway = new OfficerGateway();

    public void AddOfficer(){
        String name = NameOfficerTF.getText();
        String sName =SNameOfficerTF.getText();
        Integer age = Integer.valueOf(ageOfOfficer.getText());
        String workExp =WorkExperience.getText();
        String workSch = WorkSchedule.getText();
        Officer officer = new Officer(name,sName,age,workExp,workSch);
        NameOfficerTF.clear();
        SNameOfficerTF.clear();
        ageOfOfficer.clear();
        WorkExperience.clear();
        WorkSchedule.clear();

    }
    public void Clearer(){
        NameOfficerTF.clear();
        SNameOfficerTF.clear();
        ageOfOfficer.clear();
        WorkExperience.clear();
        WorkSchedule.clear();
    }
    public void toWepon(){

    }
}
