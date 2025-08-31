public class revision {
    
    public static int revisionKadaneAlgo(int a[]) {
        int sum = a[0];
        int maxsum = a[0];

        for (int i = 1; i < a.length; i++) {
            if (sum >= 0) {
                sum = sum + a[i];
            } else {
                sum = a[i];
            }
            // update maxsum after every step
            if (sum > maxsum) {
                maxsum = sum;
            }
        }
        return maxsum;
    }

    public static void main(String args[]) {
        int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int revision = revisionKadaneAlgo(a);
        System.out.println("Maximum Subarray Sum = " + revision);
    }
}
