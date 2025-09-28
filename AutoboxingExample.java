import java.util.ArrayList;
import java.util.List;

public class AutoboxingExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Autoboxing: converting int to Integer automatically
        numbers.add(Integer.parseInt("10"));
        numbers.add(Integer.parseInt("20"));
        numbers.add(Integer.parseInt("30"));

        int sum = calculateSum(numbers);

        System.out.println("Sum of list: " + sum);
    }

    public static int calculateSum(List<Integer> list) {
        int total = 0;
        for (Integer num : list) {
            // Unboxing: converting Integer to int automatically
            total += num;
        }
        return total;
    }
}
