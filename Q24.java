class Q24
{
    static int shortestSubarray(int arr[], int target)
    {
        int minLength = arr.length + 1;

        for(int i = 0; i < arr.length; i++)
        {
            int sum = 0;

            for(int j = i; j < arr.length; j++)
            {
                sum = sum + arr[j];

                if(sum >= target)
                {
                    int length = j - i + 1;

                    if(length < minLength)
                    {
                        minLength = length;
                    }

                    break;
                }
            }
        }

        if(minLength == arr.length + 1)
        {
            return 0;
        }

        return minLength;
    }

    public static void main(String args[])
    {
        int arr[] = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int result = shortestSubarray(arr, target);

        System.out.println("Shortest Subarray Length: " + result);
    }
}