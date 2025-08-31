import java.util.*;

public class PrefixSumEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask how many numbers
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        // Step 2: Take array input
        int arr[] = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Calculate prefix sum
        int pref[] = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }

        // Step 4: Print result
        System.out.print("Prefix Sum Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(pref[i] + " ");
        }

        sc.close();
    }
}

