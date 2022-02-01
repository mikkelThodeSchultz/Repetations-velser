package com.company;

import java.util.ArrayList;

public class Bibliotek {

    private ArrayList<Bog> bogListe = new ArrayList<>();

    public ArrayList<Bog> getBogListe() {
        return bogListe;
    }

    public boolean doesLibraryContainBook (Bog bog){
        for (int i = 0; i < bogListe.size(); i++) {
            if (bogListe.get(i).getIsbnNumber()==bog.getIsbnNumber()){
                return true;
            }
        } return false;
    }
}
