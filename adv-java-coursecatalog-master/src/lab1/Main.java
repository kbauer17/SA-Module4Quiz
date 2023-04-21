package lab1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Course> courses = new ArrayList<>();
        courses.add(new IntroJavaCourse("J101","Introductory Java Programming",4,"IntroToProgrammingCourse"));
        courses.add(new IntroToProgrammingCourse("J104","Introduction to Programming",2));
        courses.add(new AdvancedJavaCourse("J120","Advanced Java",4,"Introductory Java Programming"));

        for (Course c:courses) {
            System.out.println(c);
        }
    }
    /* This portion of the lab is using Concrete Inheritance which means all of the subclasses extending
        the abstract class Course() will inherit all of the properties and methods, whether they apply or not.
        This can be problematic as the subclass may not know what it is inheriting, that code may have errors, etc.

     */
}
