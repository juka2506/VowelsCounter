package com.company;

public class Main {

    public static void main(String[] args) {

        String line = "I live in Riga, Latvia";
        char[] lineInChar = line.toLowerCase().toCharArray();
        int count = 0;

        for (int i = 0; i < lineInChar.length; i++) {
            if (lineInChar[i] == 'a' ||
                    lineInChar[i] == 'e' ||
                    lineInChar[i] == 'i' ||
                    lineInChar[i] == 'o' ||
                    lineInChar[i] == 'u') {
                count++;
            }
        }
        System.out.println("There are " + count + " vowels in the string, " + line);
    }
}
