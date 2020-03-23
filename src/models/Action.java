package models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Action {
    private StringProperty name = new SimpleStringProperty();

    private Action(String n) {
        name.set(n);
    }

    private Action() {
    }

    public static Action getGiving() {
        return new Action("Выдано");
    }

    public static Action getBacking() {
        return new Action("Возвращенно");
    }
}


