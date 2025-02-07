public class Diamond {
    public static void main(String[] args) {
        int n = 5; // количество строк в верхней части ромба

        // Вывод верхней части ромба (включая среднюю строку)
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

        // Вывод нижней части ромба
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
    }
}
