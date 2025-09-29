import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String userInput = scanner.nextLine();

        boolean result = isPalindrome(userInput);
        System.out.println("Chuỗi đối xứng? " + result);
    }
}
