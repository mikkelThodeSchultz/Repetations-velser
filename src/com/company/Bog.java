package com.company;

public class Bog {
    private int isbnNumber;
    private String titel;
    private int udgivelsesår;


    public Bog(int isbnNumber, String titel, int udgivelsesår) {
        this.isbnNumber = isbnNumber;
        this.titel = titel;
        this.udgivelsesår = udgivelsesår;
    }

    public int getIsbnNumber() {
        return isbnNumber;
    }

    public int getUdgivelsesår() {
        return udgivelsesår;
    }

    public String getTitel() {
        return titel;
    }

    public void setIsbnNumber(int isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setUdgivelsesår(int udgivelsesår) {
        this.udgivelsesår = udgivelsesår;
    }

    @Override
    public String toString() {
        return "Bogen hedder: " + titel + ".\nUdgivet i år: " + udgivelsesår + ".\nISBN-nummer er: " + isbnNumber;
    }
}
