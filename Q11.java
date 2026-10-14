import java.util.Scanner;

public class Q11
 {
    public static void main(String[] args)
   {

        Scanner sc = new Scanner(System.in);

        int n;
        long[] arr = new long[1000];
        long sum = 0;
        long MOD = 1000000007L;

        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        for (int i = 0; i < n; i++) {
            sum = (sum + arr[i]) % MOD;
        }

        System.out.println("Result = " + sum);

        sc.close();
    }
}