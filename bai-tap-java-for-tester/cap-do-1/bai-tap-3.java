import java.util.Scanner;

public class EvenSumCalculator {

    public static int sumEvenNumbers(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Nhập một số nguyên dương: ");
            String input = scanner.nextLine();

            try {
                n = Integer.parseInt(input);
                if (n < 0) {
                    System.out.println("Vui lòng nhập số nguyên dương.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Đầu vào không hợp lệ. Vui lòng nhập số nguyên.");
            }
        }

        int result = sumEvenNumbers(n);
        System.out.println("Tổng các số chẵn từ 0 đến " + n + " là: " + result);
    }
}
