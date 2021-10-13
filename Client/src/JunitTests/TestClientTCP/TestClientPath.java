package JunitTests.TestClientTCP;

import Config.Config;
import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.*;

public class TestClientPath {

    /**
     * This Junit test is testing the path of ConfigFiles
     * @String path //Gets the path from config.properties file
     * @asserEquals //Checks if the port is as expected
     */

    @Test
    public void testConfigPath() throws IOException {
        Config config = new Config();

        //Getting the path form config.properties
        String path = config.getAbsolute_path();

        //Compares whether the paths are equal or not
        assertEquals("D:\\Java\\ClientTCP\\Client\\src\\ConfigFiles",path);

        System.out.println("Test passed!");
        System.out.println("Paths are equal!");
    }

}


