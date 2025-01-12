public class program4 {
    public static void main(String[] args) {
        int figure = 10;
        int i;
        int j;
        char[][] square = new char[5][5];
        for (i = 0; i < square.length; i++) {
            for (j = 0; j < i+1; j++) {
                square[i][j] = '*';
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
