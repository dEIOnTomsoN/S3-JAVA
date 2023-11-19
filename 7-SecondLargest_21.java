import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest_21 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = reader.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = reader.nextInt();
        }
        Arrays.sort(arr);
        int secondLargest = arr[size - 2];
        System.out.println("The second largest element in the array is " + secondLargest);
    }
}

