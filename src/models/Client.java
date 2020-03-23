package models;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.StringProperty;

public class Client extends Human {

    private BooleanProperty type_of_visit = new SimpleBooleanProperty();

    public Client(String nova, String strike, int i, int i1) {
    }

    public void setType_of_visit(BooleanProperty type_of_visit) {
        this.type_of_visit = type_of_visit;
    }

    public BooleanProperty getTypeOfvisist() {
        return type_of_visit;
    }


    public Client(StringProperty nameofhuman, StringProperty snameofhuman, IntegerProperty ageofhuman, BooleanProperty type_of_visit) {
        this.nameofhuman = nameofhuman;
        this.snameofhuman = snameofhuman;
        this.ageofhuman = ageofhuman;
        this.type_of_visit = type_of_visit;
    }
}

