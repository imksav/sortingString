import java.util.Arrays;
import java.util.Scanner;

class SortingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int sizeOfArray = sc.nextInt();
        String arr[] = new String[sizeOfArray];
        System.out.println("Enter the words: ");
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = sc.next();
        }
        System.out.println("In Orginal Order: " + Arrays.toString(arr));
        ascendingOrder(arr);
        System.out.println("In Ascending Order: " + Arrays.toString(arr));
        descendingOrder(arr);
        System.out.println("In Descending Order: " + Arrays.toString(arr));
        sc.close();
    }

    // to sort i ascending order
    public static void ascendingOrder(String[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = 0; k < arr.length - 1 - j; k++) {
                if (arr[k].compareToIgnoreCase(arr[k + 1]) > 0) {
                    String temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }
    }
    // to sort in descending order

    public static void descendingOrder(String[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = 0; k < arr.length - 1 - j; k++) {
                if (arr[k].compareToIgnoreCase(arr[k + 1]) < 0) {
                    String temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }
    }
}