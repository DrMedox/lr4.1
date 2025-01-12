import java.util.Scanner;
public class program7 {
        public static void main(String[] args) {
            Scanner id = new Scanner(System.in);
            int columns = 5;
            int rows = 5;
            int arrayOfNumbers[][] = new int[columns][rows];
            int k = 1;
            for (int i = 0; i < columns; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < rows; j++) {
                        arrayOfNumbers[i][j] = k;
                        k++;
                    }
                } else {
                    for (int j = rows -1; j > -1; j--) {
                        arrayOfNumbers[i][j] = k;
                        k++;
                    }
                }
            }
            for (int i = 0; i < columns; i++) {
                for (int j = 0; j < rows; j++) {
                    System.out.print(arrayOfNumbers[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
