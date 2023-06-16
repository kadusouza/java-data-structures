package Service;

import Model.Dev;
import Model.Content;

import java.util.Iterator;
import java.util.Optional;


public class DevService extends Dev {

    public void singUpToBootCamp(Bootcamp bootcamp, Dev dev){
        this.getSubscribedCourses().addAll(bootcamp.getContents());
        bootcamp.getDevsSubscribed().add(this);
    }

    public void progress(Dev dev) {
        Optional<Content> content = this.getSubscribedCourses().stream().findFirst();
        if(content.isPresent()) {
            this.getConcludedCourses().add(content.get());
            this.getSubscribedCourses().remove(content.get());
        } else {
            System.err.println("You're not subscribed to any course!");
        }
    }

    public double calculateTotalXp(Dev dev) {
        Iterator<Content> iterator = this.getConcludedCourses().iterator();
        double sum = 0;
        while(iterator.hasNext()){
            double next = iterator.next().calculateXP();
            sum += next;
        }
        return sum;

        /*return this.getConcludedCourses()
                .stream()
                .mapToDouble(Content::calculateXP)
                .sum();

         */

    }

}
