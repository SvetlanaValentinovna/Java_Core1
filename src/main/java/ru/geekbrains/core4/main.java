package ru.geekbrains.core4;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {

        String[] words = {"кошка", "кошка", "черепаха", "собака", "кошка", "змея", "мышь", "мышь", "мышь", "мышь", "человек", "робот", "робот"};

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String word: words) {
            if (hashMap.get(word) == null) {
                hashMap.put(word, 1);
            }
            else{
                hashMap.put(word, hashMap.get(word) +1);
            }
        }
        System.out.println(hashMap);






        NamesAndTelephones namesAndTelephones = new NamesAndTelephones();
        namesAndTelephones.add("Семенов", "89161111111");
        namesAndTelephones.add("Семенов", "89161111112");
        namesAndTelephones.add("Семенов", "89161111113");
        namesAndTelephones.add("Семенов", "89161111114");

        namesAndTelephones.add("Кошкин", "89161111122");
        namesAndTelephones.add("Кошкин", "89161111123");

        System.out.println(namesAndTelephones.get("Кошкин"));
        System.out.println(namesAndTelephones.get("Семенов"));



    }
}
