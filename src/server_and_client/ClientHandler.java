package server_and_client;

import java.io.IOException;
import java.net.Socket;

public class ClientHandler extends Thread {

    Socket clientSocket;

    // Constructor to initialize the client socket
    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    // The run method that handles the client's request in a separate thread
    public void run() {
        try (var inputStream = clientSocket.getInputStream()) {
            byte[] received = inputStream.readAllBytes();
            String message = new String(received, "utf-8");
            System.out.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}