import java.util.Scanner;
public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arry size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter first element index: ");
        int index1 = sc.nextInt();
        System.out.print("Enter second index: ");
        int index2 = sc.nextInt();
        if (index1 >= 0 && index1 < n &&
                index2 >= 0 && index2 < n) {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
            System.out.print("Change index 1 and 2");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        else {
            System.out.print("Invalid index");
        }
            sc.close();
        }

    }

