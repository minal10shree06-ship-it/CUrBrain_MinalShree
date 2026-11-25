class Q25
{
    static int[] closestPair(int arr[], int target)
    {
        int left = 0;
        int right = arr.length - 1;

        int minDiff = Integer.MAX_VALUE;

        int first = arr[left];
        int second = arr[right];

        while(left < right)
        {
            int sum = arr[left] + arr[right];

            int diff;

            if(sum > target)
            {
                diff = sum - target;
            }
            else
            {
                diff = target - sum;
            }

            if(diff < minDiff)
            {
                minDiff = diff;

                first = arr[left];
                second = arr[right];
            }

            if(sum < target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }

        return new int[] {first, second};
    }

    public static void main(String args[])
    {
        int temps[] = {10, 22, 28, 29, 30, 40};
        int target = 54;

        int result[] = closestPair(temps, target);

        System.out.println("Closest Pair: (" + result[0] + ", " + result[1] + ")");
    }
}