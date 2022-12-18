package ru.geekbrains.core5;

import com.sun.net.httpserver.Headers;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file = new File("test.csv");

        String[] headers = {"Температура1", "Температура2", "Температура3"};
        int[][] data = {
                {20, 15, 13},
                {14, 16, 23},
                {10, 2, 34},
        };
        AppData appData = new AppData(headers, data);

        appData.save(file);
        appData.load(file);
        appData.readAppData();
    }
}
