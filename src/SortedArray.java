import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {


    public static void printArray(int[] array) {
        for(int i = 0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] getIntegers(int capacity) {
        Scanner scanner = new Scanner(System.in);
        int[] myIntArray = new int[capacity];
        System.out.println("Enter " + capacity + " integer values.\r");
        for(int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = scanner.nextInt();
        }
        return myIntArray;
    }

    public static int[] sortIntegers(int[] array) {
        int[] myIntArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for(int i = 0; i < myIntArray.length-1; i++) {
                if(myIntArray[i] < myIntArray[i+1]) {
                    temp = myIntArray[i];
                    myIntArray[i] = myIntArray[i+1];
                    myIntArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return myIntArray;
    }

}
