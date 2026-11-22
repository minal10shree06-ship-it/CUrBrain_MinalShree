class Q20
{
    static void suffixSum(int arr[])
    {
        int sum = 0;

        for(int i = arr.length - 1; i >= 0; i--)
        {
            int temp = arr[i];

            arr[i] = sum;

            sum = sum + temp;
        }
    }

    public static void main(String args[])
    {
        int arr[] = {10, 4, 8, 3};

        suffixSum(arr);

        System.out.print("Suffix sum array: ");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}