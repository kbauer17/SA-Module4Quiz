package lab1;

/**
 * Subclass extending abstract class Course
 * identifies the course name, number, number of credits and prerequisites
 *
 * @author Kathy Bauer
 * @version 1.00
 */
public class IntroJavaCourse extends Course {
    String prerequisites;

    public IntroJavaCourse(String courseNumber, String courseName, double credits, String prerequisites) {
        super(courseNumber, courseName, credits);
        this.prerequisites = prerequisites;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public String toString() {
        return super.toString() + "IntroJavaCourse{" +
                "prerequisites='" + prerequisites + '\'' +
                '}';
    }
}
