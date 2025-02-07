import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк пирамиды: ");
        int n = scanner.nextInt();

        // Построение пирамиды
        for (int i = 1; i <= n; i++) {
            // Вывод пробелов для выравнивания по центру
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Вывод звездочек (число звезд = 2*i - 1)
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("$");
            }
            // Переход на новую строку после каждой строки пирамиды
            System.out.println();
        }
        
        scanner.close();
    }
}
