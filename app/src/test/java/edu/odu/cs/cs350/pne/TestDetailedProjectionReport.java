package edu.odu.cs.cs350.pne;

//unit testing for detailed projection report
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// import static org.junit.jupiter.api.Assertions.*;
// import static org.hamcrest.CoreMatchers.*;
// import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestDetailedProjectionReport {

    public DetailedProjectionReport DetailedReport1;
    public String filePath ;
    public String outPath; 

    @BeforeEach 
    public void setUp() throws Exception{
        DetailedReport1 = new DetailedProjectionReport();
        outPath = "C:/tnguy039/OutPut";
    }


    @Test
    public void TestDetailedProjectionReportDefaultConstructor()
    {
        assertThat(DetailedReport1.getFilePath(), is(""));

    }

    @Test
    public void TestSetFilePath()
    {
        assertThat(DetailedReport1.getFilePath(), is(""));
        DetailedReport1.setPath(outPath);
        assertThat(DetailedReport1.getFilePath(), is("C:/tnguy039/OutPut"));
    }



    
}
