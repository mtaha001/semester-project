package edu.odu.cs.cs350.pne;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestCourseProjection {
    
    @Test
    public void testConstructorAndGetters() {
        Offering offering1 = new Offering("CS 350 ", "236444", 50, 40);
        Offering offering2 = new Offering("CS 350", "278889", 60, 50);
        List<Offering> offerings = new ArrayList<>();
        offerings.add(offering1);
        offerings.add(offering2);

        CourseProjection courseProjection = new CourseProjection("CS 350", offerings, 100);

        assertEquals("CS 350", courseProjection.getName());
        assertEquals(90, courseProjection.getCurrentEnrollment());
        assertEquals(100, courseProjection.getProjectedEnrollment());
        assertEquals(110, courseProjection.getTotalCap());

    }





    
}
