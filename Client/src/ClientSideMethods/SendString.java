package ClientSideMethods;

import java.io.*;
import java.net.Socket;

/**
 * This class uses method SendStringToSearch which send a string to the server
 * and server should search for that string and return a response
 */
public class SendString {
    PrintWriter out;
    BufferedReader bf;

    public SendString(PrintWriter out, BufferedReader bf){
        this.out = out;
        this.bf = bf;
    }

    public SendString(OutputStream outputStream,InputStream inputStream){
        this.out = new PrintWriter(outputStream);
        this.bf = new BufferedReader(new InputStreamReader(inputStream));
    }

    public void SendStringToSearch() throws IOException {

//        //Gives access to the stream going to the server
//        //Printing the formatted representations of objects to a text-output stream
//        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
//        out.println("Testing");
//        out.flush();
//
//        //If the server sends response- read the response
//        InputStreamReader in = new InputStreamReader(socket.getInputStream());

        //Reading the server response
        String str;
        while ((str=bf.readLine()) != null ){
            //Printing the server response
            System.out.println("Server: " + str);
        }
        out.close();
    }
}

