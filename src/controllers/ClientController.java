package controllers;

import gateways.ClientGateway;

import gateways.Gateway;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import Main.Main;
import models.Client;
import registry.GatewayRegestry;
import java.io.IOException;

public class ClientController  {
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
    Gateway<Client> clientGateway = new ClientGateway();

    public void clickAddClient(){
        String name = nameOfClientTF.getText();
        String sName = secondnameOfClient.getText();
        Integer age = Integer.valueOf(ageOfClient.getText());
        Boolean type = false;
        if (typeOfVisitOneRB.isArmed())
        {
            Boolean type = false;
        }
        if (typeOfVisitAllRB.isArmed())
        {
            Boolean type = true;
        }
        if((!typeOfVisitOneRB.isArmed()) && (!typeOfVisitAllRB.isArmed()))
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("TypeERROR");
            alert.setContentText("Type of visit not advertised!");
            alert.showAndWait();
        }

        Client client = new Client(name,sName,age,type);
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText("");
        alert.setContentText("Content");
        alert.showAndWait();

    }

}
