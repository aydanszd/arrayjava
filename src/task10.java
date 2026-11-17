import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int Positive =0;
        int Negative=0;
        int zero =0;
        int PostiveSum=0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Numver");
            arr[i] = sc.nextInt();
            if (arr[i]>0){
                Positive++;
                PostiveSum+=arr[i];

            }
            else if (arr[i]<0) {
                Negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Positive numbers: " + Positive);
        System.out.println("Negative numbers: " + Negative);
        System.out.println("Zeros: " + zero);
        System.out.println("Sum of positive numbers: " + PostiveSum);

        if (Negative == 0) {
            System.out.println("There are no negative numbers.");
        }
    }
}