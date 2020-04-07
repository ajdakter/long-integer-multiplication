package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class FileReader {
    void readFile (ArrayList arrayList, String txtName) {
        Scanner scanner = null;
        int i = 0;
        String tempString;
        String reverse = "";

        try {
            scanner = new Scanner(new File("numbers/" + txtName + ".txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        tempString=( scanner.next());

        for(int k= tempString.length() - 1; k >= 0; k--)
        {
            reverse = reverse + tempString.charAt(k);
        }

        System.out.println(tempString);
        while (i<reverse.length()) {
            arrayList.add(reverse.charAt(i));
            i++;
        }




    }
}
