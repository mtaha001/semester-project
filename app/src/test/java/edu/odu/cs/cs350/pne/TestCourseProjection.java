package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CourseProjectionTest {

    @Test
    public void testGetName() {
        CourseProjection course = new CourseProjection("CS350", 20, 30, 50);
        Assertions.assertEquals("Math", course.getName());
    }

    @Test
    public void testGetCurrentEnrollment() {
        CourseProjection course = new CourseProjection("CS350", 20, 30, 50);
        Assertions.assertEquals(20, course.getCurrentEnrollment());
    }

    @Test
    public void testSetCurrentEnrollment() {
        CourseProjection course = new CourseProjection("CS361", 20, 30, 50);
        course.setCurrentEnrollment(25);
        Assertions.assertEquals(25, course.getCurrentEnrollment());
    }

    @Test
    public void testGetProjectedEnrollment() {
        CourseProjection course = new CourseProjection("CS471", 20, 30, 50);
        Assertions.assertEquals(30, course.getProjectedEnrollment());
    }

    @Test
    public void testGetTotalCap() {
        CourseProjection course = new CourseProjection("CS355", 20, 30, 50);
        Assertions.assertEquals(50, course.getTotalCap());
    }

    @Test
    public void testToString() {
        CourseProjection course1 = new CourseProjection("CS417", 20, 30, 50);
        Assertions.assertEquals("  CS417  20   30   50", course1.toString());

        CourseProjection course2 = new CourseProjection("CS361", 40, 60, 50);
        Assertions.assertEquals("* CS361 40   60   50", course2.toString());
    }
}
