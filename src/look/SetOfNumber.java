package look;

import java.util.Arrays;

/**
 * Created by s5761 on 2016/5/23.
 */
public class SetOfNumber {
  public static void main(String[] args) {
    int[] arr = {4, 25, 10};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    int low=1;
    int high=1;
    int mid = (low + high) >>> 1;
    System.out.println(mid);
    System.out.println(Arrays.binarySearch(arr, 0, 1, 8));
  }
}
