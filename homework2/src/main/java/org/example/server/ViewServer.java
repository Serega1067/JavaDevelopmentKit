package org.example.server;

public interface ViewServer {
    void appendLog(String text);
    void startedServer();
    void stoppedServer();
}