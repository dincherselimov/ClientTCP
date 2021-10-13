package JunitTests.TestSendString;

import Config.*;
import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.*;

public class TestClientSearchedString {
    /**
     * This Junit test is testing the strings searched from ServerTCP
     * @String searchedString //Gets the searched string from config.properties file
     * @asserEquals //Checks if the port is as expected
     */
    @Test
    public void testConfigString() throws IOException {
        Config config = new Config();
        //Getting the searched string from config.properties
        String searchedString = config.getString_to_be_searched();
        //Compares whether the strings are equal or not
        assertEquals("Testing",searchedString);
        System.out.println("Test passed!");
        System.out.println("Searched strings are equal!");
    }
}



