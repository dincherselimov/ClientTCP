package com.client;
import Config.Config;
import java.io.*;
import java.net.*;
/**
 *
 */
public class ClientTCP {
    public static void main(String[] args) throws IOException {


        try {
            //connect to the server
            Socket socket = new Socket("localhost",Config.getInstance().getPort());

            DataOutputStream outputStream =new DataOutputStream(socket.getOutputStream());
            outputStream.writeUTF("Hello World");
            outputStream.flush();
            outputStream.close();

            //closing the socket
            socket.close();

        }
             catch (Exception e) {
                 e.printStackTrace();
        }
    }

    }

