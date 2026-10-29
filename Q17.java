
import java.util.HashMap;
import java.util.Scanner;

public class Q17
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of product IDs: ");
        int n = sc.nextInt();

        int[] sales = new int[n];

        System.out.println("Enter the product IDs:");
        for (int i = 0; i < n; i++)
        {
            sales[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++)
        {
            int id = sales[i];

            if (freq.containsKey(id))
            {
                freq.put(id, freq.get(id) + 1);
            }
             else
            {
                freq.put(id, 1);
            }
        }

        int popular = sales[0];
        int maxFreq = 0;

        for (int id : freq.keySet())
           {
            int count = freq.get(id);

            if (count > maxFreq)
            {
                maxFreq = count;
                popular = id;
            }
            else if (count == maxFreq && id < popular) 
               {
                popular = id;
            }
        }
        System.out.println("Most popular product ID: " + popular);
        sc.close();
    }
}