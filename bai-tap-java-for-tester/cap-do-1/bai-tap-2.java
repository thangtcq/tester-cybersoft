import java.util.ArrayList;
import java.util.Scanner;

public class SecondLargestFinder {

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        return secondMax == Integer.MIN_VALUE ? Integer.MIN_VALUE : secondMax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Nhập từng số nguyên (nhập 'exit' để kết thúc):");

        while (true) {
            System.out.print("Nhập số: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                list.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên hợp lệ hoặc 'exit' để kết thúc.");
            }
        }

        int[] arr = list.stream().mapToInt(i -> i).toArray();
        int secondLargest = findSecondLargest(arr);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Không thể tìm giá trị lớn thứ hai (mảng có ít hơn 2 phần tử).");
        } else {
            System.out.println("Giá trị lớn thứ hai trong mảng là: " + secondLargest);
        }
    }
}
