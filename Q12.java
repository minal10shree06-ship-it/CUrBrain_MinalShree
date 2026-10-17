import java.util.Scanner;

public class Q12
 {
  public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);


    long base, power, MOD;
    long result;

    System.out.print("Enter base: ");
    base = sc.nextLong();

    System.out.print("Enter power: ");
    power = sc.nextLong();

    System.out.print("Enter MOD: ");
    MOD = sc.nextLong();

    result = 1 % MOD;
    base = base % MOD;

    for (long i = 0; i < power; i++) 
    {
        result = (result * base) % MOD;
    }

    System.out.println("Result = " + result);

    sc.close();
}

}
