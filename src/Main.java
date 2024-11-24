import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Input Validation for Number of Integers
        while (true) {
            System.out.println("Enter the number of integers to sort:");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) { // Ensure the number is positive
                    break;
                } else {
                    System.out.println("The number of integers must be greater than 0.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }

        // Collect integers
        int[] arr = new int[n];
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sorting choice
        System.out.println("Choose a sorting algorithm: 1. Bubble Sort 2. Selection Sort");
        int choice = scanner.nextInt();
        if (choice == 1) {
            BubbleSort bubbleSort = new BubbleSort();
            bubbleSort.sort(arr);
        } else if (choice == 2) {
            SelectionSort selectionSort = new SelectionSort();
            selectionSort.sort(arr);
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        // Display sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Binary Search
        System.out.println("Enter the number to search:");
        int target = scanner.nextInt();
        BinarySearch binarySearch = new BinarySearch();
        int position = binarySearch.search(arr, target);
        if (position != -1) {
            System.out.println("Number found at position: " + (position + 1));
        } else {
            System.out.println("Number not found.");
        }
    }
}
