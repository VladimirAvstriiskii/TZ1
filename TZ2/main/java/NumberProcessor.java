import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberProcessor {
    public static void main(String[] args) {
        int[] numbers = readNumbersFromFile("numbers.txt");
        System.out.println("Минимальное: " + _min(numbers));
        System.out.println("Максимальное: " + _max(numbers));
        System.out.println("Сумма: " + _sum(numbers));
        System.out.println("Произведение: " + _mult(numbers));
    }

    public static int[] readNumbersFromFile(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            String line = scanner.nextLine();
            String[] numberStrings = line.split(" ");
            int[] numbers = new int[numberStrings.length];
            for (int i = 0; i < numberStrings.length; i++) {
                numbers[i] = Integer.parseInt(numberStrings[i]);
            }
            return numbers;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new int[0];
        }
    }

    public static int _min(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int _max(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int _sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static int _mult(int[] arr) {
        int mult = 1;
        for (int num : arr) {
            mult *= num;
        }
        return mult;
    }
}
