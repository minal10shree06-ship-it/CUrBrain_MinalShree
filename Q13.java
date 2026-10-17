
import java.util.Scanner;

public class Q13
 {
    public static void main(String[] args)
      {
        Scanner sc = new Scanner(System.in);

        int n, k;
        long sum = 0;
        boolean found = false;

        n = sc.nextInt();
        k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long mod = Math.abs((long) k);

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum % mod == 0) {
                found = true;
                break;
            }
        }

        System.out.println(found);

        sc.close();
    }
}