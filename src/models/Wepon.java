package models;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Wepon extends Human {
    private StringProperty mark;
    private IntegerProperty level_of_access;
    private FloatProperty calibr;
    private IntegerProperty ammo;

    public Wepon() {
        this.mark = mark;
        this.level_of_access = level_of_access;
        this.calibr = calibr;
        this.ammo = ammo;
    }

    public String getMark() {
        return mark.get();
    }

    public StringProperty markProperty() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark.set(mark);
    }

    public int getLevel_of_access() {
        return level_of_access.get();
    }

    public IntegerProperty level_of_accessProperty() {
        return level_of_access;
    }

    public void setLevel_of_access(int level_of_access) {
        this.level_of_access.set(level_of_access);
    }

    public float getCalibr() {
        return calibr.get();
    }

    public FloatProperty calibrProperty() {
        return calibr;
    }

    public void setCalibr(float calibr) {
        this.calibr.set(calibr);
    }

    public int getAmmo() {
        return ammo.get();
    }

    public IntegerProperty ammoProperty() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo.set(ammo);
    }
}
