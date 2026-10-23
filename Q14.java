import java.util.Scanner;

public class Q14 
{
public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of sales figures: ");
    int n = sc.nextInt();
    int[] sales = new int[n];
    System.out.println("Enter " + n + " sales figures:");
    for (int i = 0; i < n; i++)
    {
        sales[i] = sc.nextInt();
    }
    System.out.print("Enter the threshold: ");
    int threshold = sc.nextInt();
    int count = 0;
    for (int i = 0; i < n; i++)
      {
        if (sales[i] >= threshold) 
        {
            count++;
        }
    }
    int[] result = new int[count];
    int j = 0;
    for (int i = 0; i < n; i++) 
      {
        if (sales[i] >= threshold) 
         {
            result[j] = sales[i];
            j++;
        }
    }
    System.out.print("Filtered sales figures: [");
    for (int i = 0; i < count; i++) {
        System.out.print(result[i]);
        if (i < count - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");

    sc.close();
   }
}
