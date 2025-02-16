package server_and_client;

import java.io.IOException;
import java.net.Socket;

public class Client {

    // Main method to start the client and send a message to the server
    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 6868)) {
            var outputStream = socket.getOutputStream();
            String string = "Hello";
            byte[] stringBytes = string.getBytes("utf-8");
            outputStream.write(stringBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}