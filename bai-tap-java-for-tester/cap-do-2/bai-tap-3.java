import java.util.Scanner;

public class RemoveDuplicates {

    public static String removeDuplicateChars(String input) {
        String result = "";
        boolean[] seen = new boolean[256];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!seen[ch]) {
                result += ch;
                seen[ch] = true;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String userInput = scanner.nextLine();

        String output = removeDuplicateChars(userInput);
        System.out.println("Chuỗi sau khi xóa ký tự lặp lại: " + output);
    }
}
