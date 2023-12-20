package org.example;

import org.example.Controller.Controller;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
        Controller controller = new Controller(
                "src/main/resources/ListMessage.txt"
        );
//        String[] lines = new String[5];
//        for(int i = 0; i < lines.length; i++){
//            lines[i] = String.valueOf(i);
//        }
//        controller.save(lines);
        String[] getList = controller.open();
        ClientGUI clientGUI = new ClientGUI(getList);
        List<String> list = clientGUI.getAllMessages();
    }
}