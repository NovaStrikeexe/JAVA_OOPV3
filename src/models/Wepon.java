package models;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Wepon extends EntityClass{
    private StringProperty mark;
    private FloatProperty calibr;
    private IntegerProperty ammo;



    public Wepon() {
        this.mark = mark;
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
