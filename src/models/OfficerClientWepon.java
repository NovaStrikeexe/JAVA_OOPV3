package models;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

public class OfficerClientWepon {
    private StringProperty givenWp;
    private StringProperty backWp;
    private Officer officer = new Officer();
    private Client client = new Client();
    private Wepon wepon = new Wepon();
    public ObjectProperty<Action> action;

    private enum Action {givingWepon, backingWepon}

    ;


    public OfficerClientWepon(StringProperty givenWp, StringProperty backWp, Officer officer, Client client, Wepon wepon) {
        this.givenWp = givenWp;
        this.backWp = backWp;
        this.officer = officer;
        this.client = client;
        this.wepon = wepon;
    }

    public StringProperty getGivenWp() {
        return givenWp;
    }

    public void setGivenWp(StringProperty givenWp) {
        this.givenWp = givenWp;
    }

    public StringProperty getBackWp() {
        return backWp;
    }

    public void setBackWp(StringProperty backWp) {
        this.backWp = backWp;
    }

    public Officer getOfficer() {
        return officer;
    }

    public void setOfficer(Officer officer) {
        this.officer = officer;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Wepon getWepon() {
        return wepon;
    }

    public void setWepon(Wepon wepon) {
        this.wepon = wepon;
    }
}
