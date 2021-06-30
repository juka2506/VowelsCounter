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

        // Alternative solution
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String apple = "watermelon";
        // 1. change apple to char array
        char[] appleArray = apple.toCharArray();
        int vowelCounter = 0;
        for (int i = 0; i < appleArray.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if(appleArray[i] == vowels[j]) {
                    vowelCounter++;
                }
            }
        }
        System.out.println("The number of vowels in " + apple + " is " + vowelCounter);

        // 2. loop through apple
        vowelCounter = 0;
        for (int i = 0; i < apple.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if(apple.charAt(i) == vowels[j]) {
                    vowelCounter++;
                }
            }
        }
        System.out.println("The number of vowels in " + apple + " is " + vowelCounter);

        //switch
        vowelCounter = 0;
        for (int i = 0; i < apple.length(); i++) {
            switch (apple.charAt(i)) {
                case 'a':
                case 'i':
                case 'e':
                case 'o':
                case 'u':
                    vowelCounter++;
                    break;
            }

        }
        System.out.println("The number of vowels in " + apple + " is " + vowelCounter);
    }
}
