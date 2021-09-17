package com.client;
import java.io.*;
import java.net.*;
public class ClientTCP {
    public static void main(String[] args) throws IOException {

        try {
            //connect to the server
            Socket socket = new Socket("localhost", 80);

            DataOutputStream outputStream =new DataOutputStream(socket.getOutputStream());
            outputStream.writeUTF("Hello World");
            outputStream.flush();
            outputStream.close();

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }

