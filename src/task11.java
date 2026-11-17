import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] reverse = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();
        }
        int j = 0;

        for (int i = n - 1; i >= 0; i--) {
            reverse[j] = arr[i];
            j++;
        }
        boolean same = true;

        for (int i = 0; i < n; i++) {
            if (arr[i] != reverse[i]) {
                same = false;
                break;
            }
        }
        if (same) {
            System.out.println("Array is palindrome.");
        } else {
            System.out.println("Array is not palindrome.");
        }
    }
}