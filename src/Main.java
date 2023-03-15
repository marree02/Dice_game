import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Dice.createFile();
        char[] toAnalyze = Dice.createArray();
        int[] analyzeArray = Dice.analyzeArray(toAnalyze);

        int i = 0;
        while (i <= 5) {
            switch (i) {
                case 0 -> System.out.println("\n 1: " + analyzeArray[i] + "st");
                case 1 -> System.out.println("\n 2: " + analyzeArray[i] + "st");
                case 2 -> System.out.println("\n 3: " + analyzeArray[i] + "st");
                case 3 -> System.out.println("\n 4: " + analyzeArray[i] + "st");
                case 4 -> System.out.println("\n 5: " + analyzeArray[i] + "st");
                case 5 -> System.out.println("\n 6: " + analyzeArray[i] + "st");
            }
            i++;
        }
            FileWriter writer = new FileWriter("diceComplete.txt");
            int counter = 1;
            for (int j = 0; j < analyzeArray.length; j++) {
                writer.write("\n " + counter + ": " + analyzeArray[j] + "st");
                counter++;
            }
            writer.close();

    }
}