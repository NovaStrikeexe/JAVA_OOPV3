package models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Officer extends Human {
    private StringProperty WorkExperience;
    private StringProperty WorkSchedule;
    private StringProperty WorkSpace;

    public void setWorkExperience(StringProperty workExperience) {
        WorkExperience = workExperience;
    }

    public void setWorkSchedule(StringProperty workSchedule) {
        WorkSchedule = workSchedule;
    }

    public void setWorkSpace(StringProperty workSpace) {
        WorkSpace = workSpace;
    }

    public StringProperty getWorkExperience() {
        return WorkExperience;
    }

    public StringProperty getWorkSchedule() {
        return WorkSchedule;
    }

    public StringProperty getWorkSpace() {
        return WorkSpace;
    }

    public Officer() {
    }

    public Officer(StringProperty nameofhuman, StringProperty snameofhuman, IntegerProperty ageofhuman,
                   StringProperty WorkExperience, StringProperty WorkSchedule, StringProperty WorkSpace) {
        this.nameofhuman = nameofhuman;
        this.snameofhuman = snameofhuman;
        this.ageofhuman = ageofhuman;
        this.WorkExperience = WorkExperience;
        this.WorkSchedule = WorkSchedule;
        this.WorkSpace = WorkSpace;
    }
}
