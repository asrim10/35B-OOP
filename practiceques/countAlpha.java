package practiceques;

import java.util.Scanner;

public class countAlpha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        int vowelCount = countVowels(sentence);
        int consonantCount = countConsonants(sentence);

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    public static int countVowels(String sentence) {
        int vowelCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static int countConsonants(String sentence) {
        int consonantCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                    ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                consonantCount++;
            }
        }
        return consonantCount;
    }
}

/*10. Write a that prompts the user to enter a senntence and reads it into a string. The
should consist of the
a method named •countVoweIs• that reads a string and returns the number Of vowels in
the string
a method named "count consonant"that reads a and returns Of
consonants in the string.
Invoke the and demonstrate them in the above method and demonstrate them in the program */