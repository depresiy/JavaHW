package Lesson_1.Marathon;

public class doIt {
    for (Competitor c : competitors) {
        for (Obstacle o : course) {
            o.doIt(c);
            if (!c.isOnDistance()) break;
        }
    }

}
