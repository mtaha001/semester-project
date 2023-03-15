package edu.odu.cs.cs350.pne;

//unit testing for detailed projection report
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class TestDetailedProjectionReport {

    public DetailedProjectionReport DetailedReport1;
    public String filePath ;

    @BeforeEach 
    public void setUp() throws Exception{
        DetailedReport1 = new DetailedProjectionReport();
    }


    @Test
    public void TestDetailedProjectionReportDefaultConstructor()
    {
        assertThat(DetailedReport1.getFilePath(, is("")));

    }

    
}
