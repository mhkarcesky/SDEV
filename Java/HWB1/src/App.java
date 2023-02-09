
/**
 * Madison Karcesky
 * HWB1
 * This is my own original work
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        String origWord = getInput(in);
        int shift = rand.nextInt(11);

        System.out.println("New word: " + ceasar(origWord, shift));
        System.out.println("Shift: " + shift);
    }

    public static String getInput(Scanner in) {
        System.out.println("Enter a word to encode: ");
        return in.nextLine();
    }

    public static String ceasar(String origWord, int shift) {
        char[] alph = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z' };
        List<Character> newWord = new ArrayList<Character>();

        for (int j = 0; j < origWord.length(); j++) {
            for (int i = 0; i < alph.length; i++) {
                if (origWord.charAt(j) == alph[i]) {
                    newWord.add(alph[i + shift]);
                }
            }
        }
        String wrd = "";
        for (char i : newWord) {
            wrd += i;
        }
        return wrd;
    }

    public static String getLowerCase() {
        String out = "";
        for (char x = 'a'; x <= 'z'; x++) {
            out += Character.toString(x);

        }
        return out;
    }
}
