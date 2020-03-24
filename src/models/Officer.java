package models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Officer extends Human {
    private StringProperty WorkExperience;
    private StringProperty WorkSchedule;


    public void setWorkExperience(StringProperty workExperience) {
        WorkExperience = workExperience;
    }

    public void setWorkSchedule(StringProperty workSchedule) {
        WorkSchedule = workSchedule;
    }

    public StringProperty getWorkExperience() {
        return WorkExperience;
    }

    public StringProperty getWorkSchedule() {
        return WorkSchedule;
    }



    public Officer() {
    }

    public Officer(StringProperty nameofhuman, StringProperty snameofhuman, IntegerProperty ageofhuman,
                   StringProperty WorkExperience, StringProperty WorkSchedule) {
        this.nameofhuman = nameofhuman;
        this.snameofhuman = snameofhuman;
        this.ageofhuman = ageofhuman;
        this.WorkExperience = WorkExperience;
        this.WorkSchedule = WorkSchedule;
    }
}
