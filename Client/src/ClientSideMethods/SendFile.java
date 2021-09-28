package ClientSideMethods;

import java.io.*;
import java.net.Socket;

/**
 * This class sends a file to the server via socket connection on port(for example 93)
 */
public class SendFile{
    BufferedInputStream bis;
    BufferedOutputStream bos;
    PrintWriter pr;

    //create a constructor
    public SendFile(BufferedOutputStream bos, BufferedInputStream bis) {
        this.bis = bis;
        this.bos = bos;
        this.pr = new PrintWriter(bos);
    }
    /**
     * This method send file to the Server.java class
     * and Server.java class should accept the file and save it to a directory
     */
    public void SendFileToServer() throws IOException {
        pr.println("1;dt1.txt");
        pr.flush();
        try {
            //Write data
            byte[] b = new byte[1024 * 8];
            int len;
            while ((len = bis.read(b)) != -1) {
                bos.write(b, 0, len);
                bos.flush();
            }
            System.out.println("File uploaded");

            //close resource
            bos.close();
            bis.close();
            System.out.println("File upload completed");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
