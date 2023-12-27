package org.example.server;

import org.example.client.ClientGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ServerWindow extends JFrame implements ViewServer {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;
    private Server server;
    private JButton btnStart, btnStop;
    private JTextArea log;
    public ServerWindow(){
        this.server = new Server(new Storage(), this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Chat server");
        setLocationRelativeTo(null);
        createPanel();
        setVisible(true);
        this.log.setText(this.server.getHistory());
    }


    public void appendLog(String text){
        log.append(text + "\n");
    }

    @Override
    public void startedServer() {
        server.serverStart();
    }

    @Override
    public void stoppedServer() {
        server.serverStop();
    }

    private void createPanel() {
        log = new JTextArea();
        add(log);
        add(createButtons(), BorderLayout.SOUTH);
    }

    private Component createButtons() {
        JPanel panel = new JPanel(new GridLayout(1, 2));
        btnStart = new JButton("Start");
        btnStop = new JButton("Stop");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startedServer();
            }
        });

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stoppedServer();
            }
        });

        panel.add(btnStart);
        panel.add(btnStop);
        return panel;
    }

    public Server getConnection() {
        return this.server;
    }

}
