public class Question_2 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1};
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                count = 0;
            else
                count++;
            max = count > max ? count : max;
        }

        System.out.println(max);
    }
}
