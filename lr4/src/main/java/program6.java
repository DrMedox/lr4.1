import java.util.Random;

public class program6 {
    public static void main(String[] args) {
        Random random = new Random (20);
        int rows = 5;
        int columns = 5;
        int arrayOfNumbers [][] = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arrayOfNumbers[i][j] = random.nextInt(20);
                System.out.print(arrayOfNumbers[i][j] +"\t");
            }
            System.out.println();
        }
        for(int i = 0;i<columns;i++){
            System.out.print("*\t");
        }
        System.out.println();

        int indexOfDelRows = random.nextInt(rows -1);
        int indexOfDelColumns = random.nextInt(columns -1);
        int tempArray[][] = new int[rows -1][columns -1];
        for (int i = 0, n = 0; i< rows -1; n++) {
            if (n != indexOfDelRows){
                for (int j = 0, m = 0; j < columns -1; m++) {
                    if (m != indexOfDelColumns) {
                        tempArray[i][j] = arrayOfNumbers[n][m];
                        System.out.print(tempArray[i][j] +"\t");
                        j++;
                    }
                }
                i++;
            }
            System.out.println();
        }
    }
}
