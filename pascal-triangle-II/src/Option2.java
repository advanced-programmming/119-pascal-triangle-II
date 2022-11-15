import java.util.Arrays;
import java.util.List;

public class Option2 {

    public static void main(String[] args) {
        int n = 5;
        List<Integer> result = getRow(n);
        System.out.println(result);
    }w

    public static List<Integer> getRow(int k) {
        Integer[] arr = new Integer[k + 1];
        Arrays.fill(arr, 1);

        for (int i = 1; i <= k; i++) {
            for (int j = i - 1; j > 0; j--) // Esto va rellenando al reves
                arr[j] = arr[j] + arr[j - 1];
        }
        return Arrays.asList(arr);
    }
}

/* (i <= k) k = 5
No inicia cuando i = 1, inicia cuando i = 2;
arr{1, 1, 1, 1, 1, 1, 1}
-----------------------------------------------------------------------
i -> 2
  i = 2
  j = (i - 1) = 1
  arr[j] = (arr[j] + arr[j - 1]) = (1 + 1) = 2 ... arr[1] = 2
arr{1, 2, 1, 1, 1, 1, 1}
-----------------------------------------------------------------------
i -> 3
  i = 3
  j = (i - 1) = 2
  arr[j] = (arr[j] + arr[j - 1]) = (1 + 2) = 3 ... arr[2] = 3
  j-- porque sigue siendo mayor que 0
  j = 1
  arr[j] = (arr[j] + arr[j - 1]) = (2 + 1) = 3 ... arr[1] = 3
-----------------------------------------------------------------------
i -> 4
  i = 4
  j -->  (i - 1) = 3
  arr[j] = (arr[j] + arr[j - 1]) = (1 + 3) = 4 ... arr[3] = 4
  j --> 2
  arr[j] = (arr[j] + arr[j - 1]) = (3 + 3) = 6 ... arr[2] = 6
  j --> 1
  arr[j] = (arr[j] + arr[j - 1]) = (3 + 1) = 4 ... arr[1] = 4
-----------------------------------------------------------------------
i -> 5
  i = 5
  j -->  (i - 1) = 4
  arr[j] = (arr[j] + arr[j - 1]) = (1 + 4) = 5 ... arr[4] = 5
  j --> 3
  arr[j] = (arr[j] + arr[j - 1]) = (4 + 6) = 10 ... arr[3] = 10
  j --> 2
  arr[j] = (arr[j] + arr[j - 1]) = (6 + 4) = 10 ... arr[2] = 10
  j --> 1
  arr[j] = (arr[j] + arr[j - 1]) = (4 + 1) = 5 ... arr[1] = 5
* */
