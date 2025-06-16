import java.util.Arrays;

public class TrickQuestion {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int i = 0 ;
        arr[i] = i = 3;
        System.out.println(Arrays.toString(arr));  // 3,1,2,3,4
    }
}
