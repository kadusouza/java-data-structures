package Model;

import java.time.LocalDate;

public class Mentorship extends Content{
    private LocalDate mentorshipDate;

    public Mentorship() {
    }

    @Override
    public double calculateXP() {
        return DEFAULT_XP;
    }

    public LocalDate getMentorshipDate() {
        return mentorshipDate;
    }

    public void setMentorshipDate(LocalDate mentorshipDate) {
        this.mentorshipDate = mentorshipDate;
    }

    @Override
    public String toString() {
        return "Mentorship{" +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                "mentorshipDate=" + mentorshipDate +
                '}';
    }
}
