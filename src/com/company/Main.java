package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        getArray();


    }

    public static void getArray() {

        List<Character> arrayListA = new ArrayList<Character>();
        List<Character> arrayListB = new ArrayList<Character>();
        List<Character> arrayListC = new ArrayList<Character>();

        FileReader file = new FileReader();
        file.readFile((ArrayList) arrayListA, "A");
        file.readFile((ArrayList) arrayListB, "B");
        file.readFile((ArrayList) arrayListC, "C");


        for (int i = 0; i < arrayListA.size(); i++) {
            System.out.println(arrayListA.get(i) + "--" + arrayListB.get(i) + "--" + arrayListC.get(i));
        }
    }
}


