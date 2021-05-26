public class Question_3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 4, 5, 6, 7};
        findRepeated(arr);
    }

    static void findRepeated(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
