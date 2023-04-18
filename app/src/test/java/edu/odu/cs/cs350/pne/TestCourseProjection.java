package edu.odu.cs.cs350.pne;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCourseProjection {
    @Test
    public void testGetName() {
        CourseProjection course = new CourseProjection("CS350", 20, 30, 50);
        assertEquals("CS350", course.getName());
    }

    @Test
    public void testGetCurrentEnrollment() {
        CourseProjection course = new CourseProjection("CS50", 20, 30, 50);
        assertEquals(20, course.getCurrentEnrollment());
    }

    @Test
    public void testGetProjectedEnrollment() {
        CourseProjection course = new CourseProjection("CS350", 20, 30, 50);
        assertEquals(30, course.getProjectedEnrollment());
    }

    @Test
    public void testGetTotalCap() {
        CourseProjection course = new CourseProjection("CS350", 20, 30, 50);
        assertEquals(50, course.getTotalCap());
    }

    
}
