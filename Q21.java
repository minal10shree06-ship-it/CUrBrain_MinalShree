class Q21
{
    static int deleteValue(int arr[], int target, int n)
    {
        int index = -1;

        for(int i = 0; i < n; i++)
        {
            if(arr[i] == target)
            {
                index = i;
                break;
            }
        }

        if(index != -1)
        {
            for(int i = index; i < n - 1; i++)
            {
                arr[i] = arr[i + 1];
            }

            n--;
        }

        return n;
    }

    public static void main(String args[])
    {
        int arr[] = {10, 20, 30, 20, 40};
        int target = 20;
        int n = arr.length;

        n = deleteValue(arr, target, n);

        System.out.print("Array after deletion: ");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}