package ClientSideMethods;

import Config.Config;

import java.io.*;
import java.net.Socket;

/**
 * This class uses method SendStringToSearch which send a string to the server
 * and server should search for that string and return a response
 */
public class SendString {
    //Gives access to the stream going to the server
    // Printing the formatted representations of objects to a text-output stream
    PrintWriter out;
    //reading response from the server
    BufferedReader bf;

    public SendString(PrintWriter out, BufferedReader bf){
        this.out = out;
        this.bf = bf;
    }

    /**
     *
     * @param outputStream
     * @param inputStream
     * @throws IOException
     */
    public SendString(OutputStream outputStream,InputStream inputStream) throws IOException {
        this.out = new PrintWriter(outputStream);
        out.println(Config.getInstance().getString_to_be_searched());
        out.flush();
        this.bf = new BufferedReader(new InputStreamReader(inputStream));
    }

    /**
     * Sends a string to be searched
     * Reading the response from the server
     * @throws IOException
     */
    public void sendStringToSearch() throws IOException {
        //Reading the server response
        String str;
        while ((str=bf.readLine()) != null ){
            //Printing the server response
            System.out.println("Server: " + str);
        }
        out.close();
    }
}

