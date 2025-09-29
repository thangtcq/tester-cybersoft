import java.util.Scanner;

public class PersonalIncomeTax {

    public static double calculateTax(double income) {
        double tax = 0;

        if (income <= 5000000) {
            tax = income * 0.05;
        } else if (income <= 10000000) {
            tax = 5000000 * 0.05 + (income - 5000000) * 0.10;
        } else if (income <= 18000000) {
            tax = 5000000 * 0.05 + 5000000 * 0.10 + (income - 10000000) * 0.15;
        } else if (income <= 32000000) {
            tax = 5000000 * 0.05 + 5000000 * 0.10 + 8000000 * 0.15 + (income - 18000000) * 0.20;
        } else if (income <= 52000000) {
            tax = 5000000 * 0.05 + 5000000 * 0.10 + 8000000 * 0.15 + 14000000 * 0.20 + (income - 32000000) * 0.25;
        } else if (income <= 80000000) {
            tax = 5000000 * 0.05 + 5000000 * 0.10 + 8000000 * 0.15 + 14000000 * 0.20 + 20000000 * 0.25 + (income - 52000000) * 0.30;
        } else {
            tax = 5000000 * 0.05 + 5000000 * 0.10 + 8000000 * 0.15 + 14000000 * 0.20 + 20000000 * 0.25 + 28000000 * 0.30 + (income - 80000000) * 0.35;
        }

        return tax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income;

        while (true) {
            System.out.print("Nhập thu nhập hàng năm (đơn vị: đồng): ");
            String input = scanner.nextLine();

            try {
                income = Double.parseDouble(input);
                if (income < 0) {
                    System.out.println("Thu nhập không hợp lệ. Vui lòng nhập số dương.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Đầu vào không hợp lệ. Vui lòng nhập số.");
            }
        }

        double tax = calculateTax(income);
        System.out.printf("Số thuế phải trả là: %.0f đồng\n", tax);
    }
}
