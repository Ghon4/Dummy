import java.util.List;

public class Question_1 {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        findEvenNumbers(numbers);
    }

    private static void findEvenNumbers(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                System.out.println(intArray[i]);
            }
        }
    }
}


