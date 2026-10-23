
import java.util.Scanner;

public class Q16
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of scores: ");
        int n = sc.nextInt();

        int highest = 0;
        int secondHighest = 0;

        boolean hasHighest = false;
        boolean hasSecondHighest = false;

        System.out.println("Enter " + n + " scores:");

        for (int i = 0; i < n; i++) 
        {
            int score = sc.nextInt();

            if (!hasHighest || score > highest) 
            {
                if (hasHighest) 
                {
                    secondHighest = highest;
                    hasSecondHighest = true;
                }

                highest = score;
                hasHighest = true;
            } 
              else if (score < highest &&(!hasSecondHighest || score > secondHighest))
            {
                secondHighest = score;
                hasSecondHighest = true;
            }
        }

        if (hasSecondHighest) 
        {
            System.out.println("Second-highest distinct score:" + secondHighest);
        } 
        else 
        {
            System.out.println("Second-highest distinct score: -1");
        }

        sc.close();
    }
}