package edu.odu.cs.cs350.pne;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestCourseProjection {
    
    @Test
    public void testConstructorAndGetters() {

        List<Section> sections = new ArrayList<>();
        Offering offering1 = new Offering("CS 350 ", sections);
        Offering offering2 = new Offering("CS 350", sections);
        List<Offering> offerings = new ArrayList<>();
        offerings.add(offering1);
        offerings.add(offering2);

        CourseProjection courseProjection = new CourseProjection("CS 350", offerings, 100);

        assertEquals("CS 350", courseProjection.getName());
        assertEquals(0, courseProjection.getCurrentEnrollment());
        assertEquals(100, courseProjection.getProjectedEnrollment());
        assertEquals(0, courseProjection.getTotalCap());

    }





    
}
