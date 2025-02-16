package serrver_and_client;

import java.io.IOException;
import java.net.ServerSocket;

public class Server implements Runnable {

    // Main method to start the server
    public static void main(String[] args) {
        Server server = new Server();
        server.run();
    }

     // The run method to listen for incoming client connections
    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(6868)) {
            // Create a ServerSocket on port 6868 to listen for incoming connections
            while (true) {
                // Accept incoming client connection
                ClientHandler clientHandler = new ClientHandler(serverSocket.accept());
                clientHandler.setDaemon(true);
                clientHandler.start(); // Start the ClientHandler thread to handle communication with the client
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}