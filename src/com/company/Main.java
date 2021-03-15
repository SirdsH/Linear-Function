package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        try {
            ArrayList<Function> arrayList = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("functions.txt"));

            String nextLine = br.readLine();
            int count = 1;
            boolean tr;

            while (nextLine != null) {
                arrayList.add(new Function(nextLine));
                nextLine = br.readLine();
            }

            for (Function function : arrayList) {
                System.out.println(function.toString());
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter("counts.txt"));
            bw.write(Integer.toString(arrayList.size()));
            bw.flush();
            bw.close();

            for (int i = 1; i < arrayList.size(); i++) {
                tr = true;
                for (int j = 0; j < i; j++) {
                    if (arrayList.get(i).equals(arrayList.get(j))) {
                        tr = false;
                    }
                }
                if (tr) {
                    count++;
                }
            }
            BufferedWriter bw2 = new BufferedWriter(new FileWriter("counts2.txt"));
            bw2.write(Integer.toString(count));
            bw2.flush();
            bw2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
