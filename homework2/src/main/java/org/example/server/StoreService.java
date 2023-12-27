package org.example.server;

public interface StoreService {
    void save (String text);

    String read();
}