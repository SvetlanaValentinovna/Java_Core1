package ru.geekbrains.core4;

import java.util.ArrayList;
import java.util.HashMap;

public class NamesAndTelephones {

   private HashMap<String, ArrayList<String>> surnamesAndTelephones;

    public NamesAndTelephones() {
        surnamesAndTelephones = new HashMap<>();
    }

    public void add(String surname, String telephone) {
           if(surnamesAndTelephones.get(surname) == null) {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(telephone);
                surnamesAndTelephones.put(surname, arrayList);
            }
            else {
                surnamesAndTelephones.get(surname).add(telephone);
            }
    }

    public ArrayList<String> get(String surname) {
        return surnamesAndTelephones.get(surname);
    }
}
