import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myNewArray;
        myNewArray = SortedArray.getIntegers(6);
        SortedArray.printArray(myNewArray);

        System.out.println("Sorted array " + Arrays.toString(SortedArray.sortIntegers(myNewArray)));
    }
}
