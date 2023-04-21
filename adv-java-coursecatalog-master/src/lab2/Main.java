package lab2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Courseable>courses = new ArrayList<>();

        courses.add(new IntroJavaCourse("J101","Introductory Java Programming",4,"IntroToProgrammingCourse"));
        courses.add(new IntroToProgrammingCourse("J104","Introduction to Programming",2));
        courses.add(new AdvancedJavaCourse("J120","Advanced Java",4,"Introductory Java Programming"));

        for (Courseable c:courses) {
            System.out.println(c);
        }
    }

    /* Using an interface is a clean approach to building classes which have some common
        and some different properties and methods.  It requires the implementing classes to embody
        the methods which prevents spreading bad code and code errors.  It also allows the
        implementing classes to implement many different interfaces; in this example, each
        class inherits only Courseable but could also inherit from Instructor, Campus, and other
        defining interfaces.

    */

}
