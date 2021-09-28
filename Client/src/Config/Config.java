package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class uses Singleton method and has a connection to config.properties file
 */
public class Config {

    private final int port;
    private final String absolute_path;
    private final String string_to_be_searched;
    private static Config instance = null;

    //Define the config.properties file path
    FileInputStream FIS;
    {
        try {
            FIS = new FileInputStream("D:\\Manik\\ClientTCP\\Client\\src\\ConfigFiles\\config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    Properties prop = new Properties();

    //Loading the config.properties file
    public Config() throws IOException {
        prop = new Properties();
        prop.load(FIS);
        FIS.close();
//---------------------------------------------------------------------------------------------------//
        port = Integer.parseInt(prop.getProperty("port"));
        absolute_path = new String(prop.getProperty("absolute_path"));
        string_to_be_searched = new String(prop.getProperty("string_to_be_searched"));
    }
    //Using Singleton method
    public static Config getInstance() throws IOException {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }
    //-------------------------------------------------------------------------------------------//
    //Getters for strings
    public int getPort(){return this.port;}
    public String getAbsolute_path(){return this.absolute_path;}
    public String getString_to_be_searched(){return this.string_to_be_searched;}

}
