package com.client;
import ClientSideMethods.SendFile;
import ClientSideMethods.SendString;
import Config.Config;
import java.io.*;
import java.net.*;

/**
 * This class establishes socket connection on host "localhost" and port(for example 93)
 * Chooses which method to run as an argument
 */
public class ClientTCP {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost",93);

        if(args[0].equals("1")){
            String location = "D:\\Manik\\ClientTCP\\Client\\src\\ConfigFiles\\";
            SendFile sendFile = new SendFile(new BufferedOutputStream(socket.getOutputStream()),
                    new BufferedInputStream(new FileInputStream(location + "/SSHKey.txt")));
            sendFile.SendFileToServer();
        }
        else if(args[0].equals("2")){

            SendString sendString = new SendString(socket.getOutputStream(),socket.getInputStream());

            sendString.SendStringToSearch();
        }
            socket.close();



    }


}