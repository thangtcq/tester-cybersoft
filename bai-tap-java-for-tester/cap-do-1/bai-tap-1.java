import java.util.Scanner;

public class RemoveVowels {

    public static String removeVowels(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                result += input.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String userInput = scanner.nextLine();

        String output = removeVowels(userInput);
        System.out.println("Chuỗi sau khi xóa nguyên âm: " + output);
    }
}
