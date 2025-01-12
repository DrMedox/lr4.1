import java.util.Random;

public class program5 {
    public static void main(String[] args) {
        int[][] arrayOfNumbers = new int[5][3];
        Random rand = new Random();
        for (int i = 0; i < arrayOfNumbers.length; i++){
            for (int j = 0; j < arrayOfNumbers[i].length; j++)
                arrayOfNumbers[i][j] = rand.nextInt(30);
        }
        for (int i = 0; i < arrayOfNumbers.length; i++){
            for (int j = 0; j < arrayOfNumbers[i].length; j++) {
                System.out.print(arrayOfNumbers[i][j] + " ");
            }
            System.out.println();
        }
        int[][] tempArray = new int[arrayOfNumbers[0].length][arrayOfNumbers.length];
        for (int i = 0; i < arrayOfNumbers.length; i++){
            for (int j = 0; j < arrayOfNumbers[i].length; j++) {
                tempArray[j][i] = arrayOfNumbers[i][j];
            }
        }
        arrayOfNumbers = tempArray;
        System.out.println();
        for (int i = 0; i < arrayOfNumbers.length; i++){
            for (int j = 0; j < arrayOfNumbers[i].length; j++) {
                System.out.print(arrayOfNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}