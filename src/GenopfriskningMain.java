import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class GenopfriskningMain {

    public static void main(String[] args) {
        /*ArrayList<String> strings = new ArrayList<>();
        strings.add("hej"); strings.add("computer"); strings.add("banan");
        boolean result = doesArraylistContainString(strings, "banan");
        System.out.println(result);*/

//        fåGræsInput();

       // System.out.println(lavKvadrat(7, 'o'));

      //  System.out.println(properCase("This is a GROUP assignment. Please create a group first"));

       /* String[] array = sortFiveStringsAlphabetically();
        for (String string : array) {
            System.out.println(string);
        }*/

        String[] words = {"negl", "bærbar", "vandflaske", "hovedtelefoner"};

        int result = searchForStringInArray(words, "banan");
        System.out.println("Index of string: " + result);

    }

    public static boolean doesArraylistContainString(ArrayList<String> arrayList, String string) {
        for (String word : arrayList) {
            if (word.equals(string)) {
                System.out.println("The string has been found");
                return true;
            }
        }
        arrayList.add(string);
        return false;
    }

    public static int hvorMangeDageTilGræssetSkalSlås(double græsNuværendeHøjdeCm, double græsHøjdeCmMax) {
        int dage = 0;

        while (græsNuværendeHøjdeCm < græsHøjdeCmMax) {
            græsNuværendeHøjdeCm += 0.8;
            dage++;
        }

        return dage;
    }

    public static void fåGræsInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nuværende græshøjde: ");
        double nuvGH = scanner.nextDouble();

        System.out.print("Max græshøjde: ");
        double maxGH = scanner.nextDouble();


        int result = hvorMangeDageTilGræssetSkalSlås(nuvGH, maxGH);
        System.out.println("Dage til græsset skal slås: " + result);
    }

    public static String lavKvadrat(int tal, char tegn) {
        String result = "";
        for (int i = 0; i < tal; i++) {
            result += tegn + "  ";
        }

        String finalResult = "";
        for (int i = 0; i < tal; i++) {
            finalResult += result + "\n";
        }

        return finalResult;
    }

    public static String properCase(String sentence) {
        String[] words = sentence.split(" ");

        String result = "";

        for (String word : words) {
            if (word.toUpperCase().equals(word)) {
                result += word + " ";
            } else if (word.length() > 3) {
                result += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
            } else {
                result += word.toLowerCase() + " ";
            }
        }

        return result.substring(0, result.length()-1);
    }

    public static String[] sortFiveStringsAlphabetically() {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[5];
        String[] sortedStrings = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Type word " + (i+1) + ": ");
            strings[i] = scanner.next();
        }

        Arrays.sort(strings);

        int j = 4;
        for (int i = 0; i < 5; i++) {
            sortedStrings[j] = strings[i];
            j--;
        }

        return sortedStrings;
    }

    public static int searchForStringInArray(String[] words, String word) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) return i;
        }

        throw new NoSuchElementException("String not found");
        // return -1;
    }
}
