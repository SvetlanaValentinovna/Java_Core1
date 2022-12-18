package ru.geekbrains.core5;

import java.io.*;
import java.util.ArrayList;

public class AppData {
IOException e;
        private String[] headers;
        private int[][] data;



    public AppData(String[] headers, int[][] data) {
        this.headers = headers;
        this.data = data;
    }


    public void save(File file) {
        try (BufferedWriter bufferedOutputStream = new BufferedWriter(new FileWriter(file))) {

            bufferedOutputStream.write(headers[0] + ";" + headers[1] + ";" + headers[2] + "\n");

            for (int i = 0; i < data.length; i++) {
                bufferedOutputStream.write(data[i][0] + ";" + data[i][1] + ";" + data[i][2] + "\n");
            }

        } catch (IOException e) {
              e.printStackTrace();
            }
    }
        public void load(File file) {

            int count = 0;

            try (BufferedReader bufferedOutputStream = new BufferedReader(new FileReader(file))) {
                String data;
                //Узнаю сколько строк
                while ((data = bufferedOutputStream.readLine()) != null) {
                    count++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            count--;

            try (BufferedReader bufferedOutputStream = new BufferedReader(new FileReader(file))) {
                //Читаем хедеры
                String data;
                headers = bufferedOutputStream.readLine().split(";");


                //создаю массив на основе строк
                this.data = new int[count][3];

                //читаю все что связано с данными
                for (int i = 0; i < count; i++) {
                    String[] tmp = bufferedOutputStream.readLine().split(";");
                    for (int j = 0; j < 3; j++) {
                        this.data[i][j] = Integer.parseInt(tmp[j]);
                    }

                }
            }catch(IOException e){
                    e.printStackTrace();
                }

            }


            public void readAppData () {
                for (String s : headers) {
                    System.out.print(s + " ");
                }
                System.out.println();

                for (int[] ints : data) {
                    for (int num : ints) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
            }
        }



            



