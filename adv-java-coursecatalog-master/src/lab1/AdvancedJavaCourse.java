package lab1;

import javax.swing.*;

/**
 * Subclass extending abstract class Course, it identifies a
 * course number, name, credits and prerequisites
 *
 * @author Kathy Bauer
 * @version 1.00
 */
public class AdvancedJavaCourse extends Course{

    private String prerequisites;

    public AdvancedJavaCourse(String courseNumber, String courseName, double credits, String prerequisites) {
        super(courseNumber, courseName, credits);
        this.prerequisites = prerequisites;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public String toString() {
        return super.toString() + "AdvancedJavaCourse{" +
                "prerequisites='" + prerequisites + '\'' +
                '}';
    }
}
