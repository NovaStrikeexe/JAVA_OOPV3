package models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Human extends EntityClass{
    protected StringProperty nameofhuman = new SimpleStringProperty();
    protected StringProperty snameofhuman = new SimpleStringProperty();
    protected IntegerProperty ageofhuman = new SimpleIntegerProperty();

    public void setNameofhuman(StringProperty nameofhuman) {
        this.nameofhuman = nameofhuman;
    }

    public void setSnameofhuman(StringProperty snameofhuman) {
        this.snameofhuman = snameofhuman;
    }


    public void setAgeofhuman(IntegerProperty ageofhuman) {
        this.ageofhuman = ageofhuman;
    }


    public StringProperty getNameofhuman() {
        return nameofhuman;
    }

    public StringProperty getSnameofhuman() {
        return snameofhuman;
    }


    public IntegerProperty getAgeofhuman() {
        return ageofhuman;
    }


    public Human() {
        super();
    }

    public Human(StringProperty nameofhuman, StringProperty snameofhuman, IntegerProperty ageofhuman) {
        super();
        this.nameofhuman = nameofhuman;
        this.snameofhuman = snameofhuman;
        this.ageofhuman = ageofhuman;

    }
}

