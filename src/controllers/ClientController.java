package controllers;

import gateways.ClientGateway;

import gateways.Gateway;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import Main.Main;
import models.Client;
import registry.GatewayRegestry;

import java.io.IOException;

public class ClientController {
    @FXML
    TextField nameOfClientTF;

    @FXML
    TextField secondnameOfClient;

    @FXML
    TextField ageOfClient;

    @FXML
    RadioButton typeOfVisitOneRB;

    @FXML
    RadioButton typeOfVisitAllRB;

    @FXML
    Pane ClientPane;

   @FXML
    Pane OfficerPane;

    @FXML
    Gateway<Client> clientGateway = new ClientGateway();

    public void AddClient() {
        String name = nameOfClientTF.getText();
        String sName = secondnameOfClient.getText();
        Integer age = Integer.valueOf(ageOfClient.getText());
        Boolean type = true;
        if (typeOfVisitOneRB.isSelected()) {
            type = true;
        } else {
            type = false;
        }

        Client client = new Client(name, sName, age, type);
        nameOfClientTF.clear();
        secondnameOfClient.clear();
        ageOfClient.clear();
        //Alert alert = new Alert(Alert.AlertType.ERROR);
        //alert.setHeaderText("");
        // alert.setContentText("Content");
        // alert.showAndWait();
    }
    public void Clearer(){
        nameOfClientTF.clear();
        secondnameOfClient.clear();
        ageOfClient.clear();
    }
    public void toOfficer(){
        ClientPane.setVisible(false);
        /*OfficerPane.setDisable(false);
        OfficerPane.setVisible(true);
        ClientPane.setDisable(true);*/
    }

    //@FXML
    //public void AddClient(){}
    @FXML
    public void initialize() {
        typeOfVisitOneRB.setSelected(true);
        nameOfClientTF.textProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (newValue.matches("[a-zA-Z/-]*")) {
                    nameOfClientTF.setText(newValue);
                } else {
                    nameOfClientTF.setText(oldValue);
                }
            }
        });
        secondnameOfClient.textProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (newValue.matches("[a-zA-Z/-]*")) {
                    secondnameOfClient.setText(newValue);
                } else {
                    secondnameOfClient.setText(oldValue);
                }
            }
        });
        ageOfClient.textProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (newValue.matches("\\d*")) {
                    ageOfClient.setText(newValue);
                } else {
                    ageOfClient.setText(oldValue);
                }
            }
        });
    }


}
