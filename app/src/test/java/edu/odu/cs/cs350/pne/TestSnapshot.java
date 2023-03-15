
/*
 * Unit testing for the Semester class 
 */
package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class TestSnapshot {
    

    @Test
    void testDefaultConstructor{
        Snapshot s1 =  new Snapshot();
        Snapshot s2 =  new Snapshot();
        assertThat(s2.equal(s1),is(true));
    }

}
