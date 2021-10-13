package JunitTests.TestSendFile;

import Config.Config;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class testSendFilePositive {

    @Test
    public void sendFileToServerP() throws IOException {

        Config config = new Config();

        String sent_file = config.getAbsolute_path() + "SSHKey.txt";

        String expected_file_to_be_send = "D:\\Manik\\ClientTCP\\Client\\src\\ConfigFiles\\SSHKey.txt";

        assertEquals(expected_file_to_be_send,sent_file);


    }

}
