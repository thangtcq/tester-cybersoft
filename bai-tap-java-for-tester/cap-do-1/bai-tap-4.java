import java.util.Scanner;

public class WordCounter {

    public static int countWords(String input) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isWhitespace(ch)) {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String userInput = scanner.nextLine();

        int wordCount = countWords(userInput);
        System.out.println("Số từ trong chuỗi là: " + wordCount);
    }
}
