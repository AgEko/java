

import java.util.Arrays;

public class ReverseArrayChallenge
{

    public static void main(String[] args) {
       int[] a = {1,2,3,4,5,6,7,8,9,0};
       int[] b = reverseArray(a);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }

    private static int[] reverseArray(int[] array){
        int[] flippy = Arrays.copyOf(array, array.length);

        for (int i = 0; i < flippy.length / 2; i++)
        {
            int temp = flippy[i];
            flippy[i] = flippy[flippy.length - i - 1];
            flippy[flippy.length - i - 1] = temp;
        }
        return flippy;
    }

}
