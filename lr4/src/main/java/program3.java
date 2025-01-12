public class program3 {
    public static void main(String[] args) {
        int figure = 10;
        int i;
        int j;
        int[][] square = new int[3][3];
        for (i = 0; i < square.length; i++) {
            for (j = 0; j < square.length; j++) {
                square[i][j] = 2;
            }
        }
        for (i = 0; i < square.length; i++) {
            for (j = 0; j < square.length; j++) {
                System.out.print(square[i][j]);
            }
            System.out.println();
        }
    }
}
