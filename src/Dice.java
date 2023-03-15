import java.io.*;
import java.util.*;

public class Dice {

    public static void createFile() throws IOException {
        Random random = new Random();
        PrintWriter ut = new PrintWriter(new BufferedWriter(new FileWriter("dice.txt")));

        int i = 0;
        while (i < 1000) {
            int randomInt = random.nextInt(1, 7);
            ut.print(randomInt);
            i++;
        }
        ut.close();
    }
    public static char[] createArray() throws IOException {
        Scanner in = new Scanner(new File("dice.txt"));
        try {
            in = new Scanner(new File("dice.txt"));
        } catch (Exception e) {
            System.out.println("file dont exist");
        }
        String file = in.next();
        char[] arrayNum = new char[file.length()];
        for (int i = 0; i < file.length(); i++) {
            arrayNum[i] = file.charAt(i);
        }
        return arrayNum;
    }
    public static int[] analyzeArray(char[] array) throws IOException {

        int[] arr = new int[6];
        int i;
        for (i = 0; i < 1000; i++) {

            switch (array[i]) {
                case '1' -> arr[0]++;
                case '2' -> arr[1]++;
                case '3' -> arr[2]++;
                case '4' -> arr[3]++;
                case '5' -> arr[4]++;
                case '6' -> arr[5]++;
            }
        }
        return arr;
    }
}