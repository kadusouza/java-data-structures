package Model;

public class ActivitiesAndCourses extends Content {

    private int duration;

    public ActivitiesAndCourses() {
    }

    @Override
    public double calculateXP() {
        return Content.DEFAULT_XP * duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "ActivitiesAndCourses{" +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                "duration=" + duration +
                '}';
    }
}
