
public class SorterUseCaseImpl {
    public static void sort(int[] S) {
        if (S.length == 0) {
            throw new IllegalArgumentException("Input array cannot be empty");
        }

        //from 0 to n
        int lengthOfArray = S.length - 1;
        while (0 < lengthOfArray) {
            //maxIndex represents the index of the greatest number in the array
            int maxIndex = max(S, 0, lengthOfArray);
            if (maxIndex != lengthOfArray) {
                //with the first call we move the position of the number with the max index to the first position which is 0
                reverse(S, maxIndex);
                //with the second call on the reverse method we change the position of the first item in the list which in
                //our case is the largest number from the sub-array and we change it with the number on the last position
                reverse(S, lengthOfArray);
            }
            lengthOfArray--;
        }
    }

    static int max(int[] S, int start, int end) {
        int maxIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (S[i] > S[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void reverse(int[] S, int end) {
        if (S.length == 0) {
            throw new IllegalArgumentException("Input array cannot be empty");
        }

        int start = 0;
        while (start < end) {
            int temp = S[start];
            S[start] = S[end];
            S[end] = temp;
            start++;
            end--;
        }
    }
}
