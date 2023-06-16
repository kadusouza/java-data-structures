package Model;

import java.time.LocalDate;

public abstract class Content {
    protected static final double DEFAULT_XP = 10d;
    String title;
    String description;

    public abstract double calculateXP();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
