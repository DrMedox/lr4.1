public class program2 {
    public static void main(String[] args) {
        int figure = 10;
        int i;
        int j;

        for (i = 1; i <= figure; i++) {
            for (j = figure-i; j < figure; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
