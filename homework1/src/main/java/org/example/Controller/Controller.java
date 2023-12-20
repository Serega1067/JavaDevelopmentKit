package org.example.Controller;

import org.example.ClientGUI;
import org.example.Repository.RepositoryFile;

import java.io.IOException;
import java.util.List;

public class Controller {
    RepositoryFile repository;
    String pathFile;

    public Controller(String pathFile) {
        repository = new RepositoryFile(pathFile);
    }

    public String[] open() throws IOException {
        return repository.read();

    }
    public void save(List<String> lines) throws IOException {
        repository.write(lines);
    }
}