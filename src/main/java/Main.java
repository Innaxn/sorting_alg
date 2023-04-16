import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int[] S = new int[] { 7, 3, 1, 77, 10,4 };
        //int[] S = new int[] { };
        System.out.println("Before: " + Arrays.toString(S));
        SorterUseCaseImpl.sort(S);
        System.out.println("After: " + Arrays.toString(S));
    }
}

