import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Option1 {
    public static void main(String[] args) {
        int n = 5;
        List<Integer> result = getRow(n);
        System.out.println(result);
    }

    private static List<Integer> getRow(int n) {
        int[] start = {1, 1};

        if (n == 0) return List.of(1);

        for (int i = 2; i <= n; i++)
            start = recall(start);

        return IntStream.of(start).boxed().toList();
    }

    private static int[] getTemp(int[] start) {
        int[] temp =  new int[start.length + 1];
        Arrays.fill(temp, 1);
        return temp;
    }


    public static int[] recall (int[] arr){
        int[] copy = Arrays.copyOf(arr, arr.length);
        int[] temp = getTemp(arr);
        for (int i = 0; i < (temp.length - 1); i++){
            temp[i] = i == 0 ? 1 : arr[i] + copy[i - 1];
        }
        return temp;
    }
}