import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк для верхней части ромба: ");
        int n = scanner.nextInt();

        // Верхняя часть ромба (включая среднюю строку)
        for (int i = 1; i <= n; i++) {
            // Вывод пробелов для выравнивания по центру
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Вывод звездочек (число звезд = 2*i - 1)
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // переход на новую строку
        }

        // Нижняя часть ромба
        for (int i = n - 1; i >= 1; i--) {
            // Вывод пробелов
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Вывод звездочек
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
