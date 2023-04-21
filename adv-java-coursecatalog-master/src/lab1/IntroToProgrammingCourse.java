package lab1;

import javax.swing.*;

/**
 * Subclass extending abstract class Course,
 * identifies the courseName and number and credits.
 * There are no prerequisities identified for this course.
 *
 * @author Kathy Bauer
 * @version 1.00
 */
public class IntroToProgrammingCourse extends Course{

    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        super(courseName,courseNumber,credits);
        }


    @Override
    public String toString() {
        return super.toString() + "IntroToProgrammingCourse{}";
    }
}
