import java.util.Scanner;

public class Q15 
{
public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter " + n + " integers:");
    for (int i = 0; i < n; i++) 
    {
        arr[i] = sc.nextInt();
    }

    int smallest = arr[0];
    int minAbs = arr[0];
    if (minAbs < 0) 
    {
        minAbs = minAbs * -1;
    }
    for (int i = 1; i < n; i++) 
    {
        int absValue = arr[i];
        if (absValue < 0) 
        {
            absValue = absValue * -1;
        }
        if (absValue < minAbs)
        {
            minAbs = absValue;
            smallest = arr[i];
        }
    }
    System.out.println("Number with the smallest absolute value: " + smallest);
    sc.close();
}

}
