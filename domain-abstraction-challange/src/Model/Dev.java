package Model;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> mentorships = new LinkedHashSet<>();
    private Set<Content> subscribedCourses = new LinkedHashSet<>();
    private Set<Content> concludedCourses = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getMentorship() {
        return mentorships;
    }

    public void setMentorship(Set<Content> mentorship) {
        this.mentorships = mentorship;
    }

    public Set<Content> getSubscribedCourses() {
        return subscribedCourses;
    }

    public void setSubscribedCourses(Set<Content> subscribedCourses) {
        this.subscribedCourses = subscribedCourses;
    }

    public Set<Content> getConcludedCourses() {
        return concludedCourses;
    }

    public void setConcludedCourses(Set<Content> concludedCourses) {
        this.concludedCourses = concludedCourses;
    }
}
