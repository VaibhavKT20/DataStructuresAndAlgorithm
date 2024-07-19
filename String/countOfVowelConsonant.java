package String;

import java.util.Scanner;

public class countOfVowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.nextLine();
        int vCount = 0;
        int cCount = 0;
        str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                cCount++;
            }

        }
        System.out.print("Count of Vowel in the given word is " + vCount);
        System.out.print("\nCount of Consonant in the given word is " + cCount);
    }
}
