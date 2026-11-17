import java.util.Scanner;
public class task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] products = {10, 25, 15, 30, 20};
        int choice;
        do {
            System.out.println("\n1. Show all products");
            System.out.println("2. Add product quantity");
            System.out.println("3. Sell product");
            System.out.println("4. Show maximum quantity");
            System.out.println("5. Show minimum quantity");
            System.out.println("6. Show total quantity");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    for (int i = 0; i < products.length; i++) {
                        System.out.println("Product " + i + ": " + products[i]);
                    }
                    break;

                case 2:
                    System.out.print("Enter product index: ");
                    int index = sc.nextInt();

                    if (index >= 0 && index < products.length) {
                        System.out.print("Enter quantity: ");
                        int quantity = sc.nextInt();

                        if (quantity > 0) {
                            products[index] = products[index] + quantity;
                        } else {
                            System.out.println("Invalid quantity!");
                        }
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 3:
                    System.out.print("Enter product index: ");
                    index = sc.nextInt();

                    if (index >= 0 && index < products.length) {
                        System.out.print("Enter quantity: ");
                        int quantity = sc.nextInt();

                        if (quantity > 0 && quantity <= products[index]) {
                            products[index] = products[index] - quantity;
                        } else {
                            System.out.println("Invalid quantity or not enough products!");
                        }
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 4:
                    int max = products[0];

                    for (int i = 1; i < products.length; i++) {
                        if (products[i] > max) {
                            max = products[i];
                        }
                    }

                    System.out.println("Maximum quantity: " + max);
                    break;

                case 5:
                    int min = products[0];

                    for (int i = 1; i < products.length; i++) {
                        if (products[i] < min) {
                            min = products[i];
                        }
                    }

                    System.out.println("Minimum quantity: " + min);
                    break;

                case 6:
                    int total = 0;

                    for (int i = 0; i < products.length; i++) {
                        total = total + products[i];
                    }

                    System.out.println("Total quantity: " + total);
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            if (choice != 0) {
                System.out.println("\nUpdated array:");

                for (int i = 0; i < products.length; i++) {
                    System.out.print(products[i] + " ");
                }

                System.out.println();
            }

        } while (choice != 0);

        sc.close();
    }
}