# Simple Client-Server Application in Java

This is a simple client-server application in Java, where the server listens for incoming client connections and the client sends a message to the server.

## Project Overview

- **Server**: The server listens on port 6868 for incoming client connections. For each client that connects, a new `ClientHandler` thread is started to handle communication with that client.
- **Client**: The client connects to the server at `127.0.0.1` (localhost) and sends a simple message ("Hello").
- **ClientHandler**: This class handles communication with the connected client by reading the message sent by the client and printing it to the console.
