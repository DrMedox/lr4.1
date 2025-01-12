import java.util.Scanner;
public class program8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования: ");
        String initialText = in.nextLine();
        System.out.println("Введите ключ: ");
        Integer key = in.nextInt();
        char[] c = initialText.toCharArray();
        System.out.println("Зашифрованная фраза: ");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < key; j++)
                c[i]++;
            System.out.print("" + c[i]);
        }
        System.out.println();
        System.out.print("Выполнить обратное преобразование? (y/n)");
        boolean isNotExit = true;
        String userInput = in.nextLine();
        while(isNotExit){
            switch (userInput) {
                case "y": {
                    System.out.println("Расшифрованная фраза: ");
                    for (int i = 0; i < c.length; i++) {
                        for (int j = 0; j < key; j++)
                            c[i]--;
                        System.out.print("" + c[i]);
                    }
                    isNotExit = false;
                    break;
                }
                case "n":
                {
                    System.out.println("До свидания!");
                    isNotExit = false;
                    break;
                }
                default:
                    System.out.println(" Введите корректный ответ");
                    userInput = in.nextLine();
            }
        }

    }
}
