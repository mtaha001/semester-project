
/*
 * Unit testing for the Snapshot
 */
package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// import org.junit.jupiter.api.BeforeEach;


import java.util.ArrayList;

public class TestSnapshot {
    

    private Snapshot s1; 
    private Snapshot s2; 
    private ArrayList<Section> sections;

    @BeforeEach
    public void setUp (){
        s1 =  new Snapshot();
        s2 =  new Snapshot();
    }

    @Test
    void testDefaultConstructor(){

        assertEquals(0, s1.getSections().size());
        assertEquals(s2, s1);
    }

}
