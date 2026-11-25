class Q23
{
    static int minSubarraySum(int arr[])
    {
        int minSum = arr[0];

        for(int i = 0; i < arr.length; i++)
        {
            int sum = 0;

            for(int j = i; j < arr.length; j++)
            {
                sum = sum + arr[j];

                if(sum < minSum)
                {
                    minSum = sum;
                }
            }
        }

        return minSum;
    }

    public static void main(String args[])
    {
        int arr[] = {3, -4, 2, -3, 5};

        int result = minSubarraySum(arr);

        System.out.println("Minimum Subarray Sum: " + result);
    }
}