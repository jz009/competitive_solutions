import java.util.Arrays;
import java.util.*;


public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int total = in.nextInt();
    Boolean blah = false;
    int[] arr = new int[total];
    for (int i = 0; i < total; i++) {
        arr[i] = in.nextInt();
    }
    Arrays.sort(arr);
    for (int i = total - 1; i >= 0; i--) {
        int index = total - i;
        if (arr[i] <= index) {
            System.out.println(Math.max(arr[i], index - 1));
            blah = true;
            break;
        }

    }

    if (!blah) {
        System.out.println(total);
    }
    }
}
