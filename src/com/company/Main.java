package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    private ArrayList<String> stringArrayList = new ArrayList<>();

    public boolean doesArraylistContainString(ArrayList<String> arrayList, String theString) {
        if (!arrayList.contains(theString)) {
            arrayList.add(theString);
            return false;
        } else {
            System.out.println("The String has been found");
            return true;
        }
    }

    public int whenShouldTheGrassBeCut(double græsLængde, double græsPlanlagtLængde) {
        boolean grassShouldBeCut = true;
        int numberOfDays = 0;
        while (grassShouldBeCut) {
            numberOfDays++;
            græsLængde = græsLængde + 0.8;
            if (græsLængde >= græsPlanlagtLængde) {
                grassShouldBeCut = false;
            }
        }
        return numberOfDays;

    }

    public String kvadrat(int tal, String tegn) {
        String textLine = "";
        String kvadrat = "";
        for (int i = 0; i < tal; i++) {
            textLine = textLine + " " + tegn + " ";
        }
        for (int i = 0; i < tal; i++) {
            kvadrat = kvadrat + "\n" + textLine;
        }

        return kvadrat;
    }

    public String properCase(String tekst) {
        String[] s = tekst.split(" ");
        String returnText = "";

        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(s[i].toUpperCase())) {
            } else if (s[i].length() < 4) {
                s[i] = s[i].toLowerCase();
            } else if (s[i].length()>3){
                s[i] = s[i].toLowerCase();
                s[i] = s[i].substring(0, 1).toUpperCase() + s[i].substring(1);

            }
        }

        for (int i = 0; i < s.length; i++) {
            returnText = returnText + s[i] + " ";
        }

        return returnText;
    }

    public String sorting (){
        String returnText ="";
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfWords = new ArrayList<>();
        System.out.println("Write 5 words");
        for (int i = 0; i < 5; i++) {
            listOfWords.add(scanner.nextLine());
        }
        Collections.sort(listOfWords);
        Collections.reverse(listOfWords);

        for (int i = 0; i < 5; i++) {
            returnText += listOfWords.get(i) + "\n";
        }
        return returnText;
    }

    public int doesArrayContain (ArrayList<String> arrayList, String word) throws Exception {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(word)){
                return i;
            }
        } throw new Exception("The word is not on the list");
    }


    public static void main(String[] args) throws Exception {
        // write your code here
        Main m = new Main();
        ArrayList<String> listOfWords = new ArrayList<>();
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Hvor højt er dit græs?");
        double længde = sc.nextDouble();
        System.out.println("Hvor højt skal det være?");
        double planlagtLængde = sc.nextDouble();
        System.out.println("Du skal printe dit græs om " + m.whenShouldTheGrassBeCut(længde,planlagtLængde) + " dage");

        System.out.println(m.kvadrat(4, "?"));
        System.out.println(m.properCase("HeY HVAD så DER min brOOooor"));
        System.out.println(m.sorting());
        */
        String ord1 = "hey";
        String ord2 = "yo";
        String ord3 = "hvadså";
        listOfWords.add(ord1);
        listOfWords.add(ord2);
        listOfWords.add(ord3);
        System.out.println(m.doesArrayContain(listOfWords, "Exception"));
    }


}
