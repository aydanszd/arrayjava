import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter exam count: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int passed = 0;
        int failed = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter exam result: ");
            arr[i] = sc.nextInt();
        }

        for (int grade : arr) {
            System.out.print("Result:"+ grade);
            if (grade>51) {
                passed++;
            }
            else {
                failed++;
                }
            if (grade > max) {
                max = grade;
            }
            }
        System.out.println("Passed students: " + passed);
        System.out.println("Failed students: " + failed);
        System.out.println("Highest result: " + max);
    }
        }