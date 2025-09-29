import java.util.Scanner;

public class FirstLetterExtractor {

    public static String getFirstLetters(String input) {
        String result = "";
        boolean isStartOfWord = true;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isWhitespace(ch)) {
                isStartOfWord = true;
            } else {
                if (isStartOfWord) {
                    result += ch + " ";
                    isStartOfWord = false;
                }
            }
        }

        return result.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String userInput = scanner.nextLine();

        String output = getFirstLetters(userInput);
        System.out.println("Chữ cái đầu của mỗi từ là: " + output);
    }
}
