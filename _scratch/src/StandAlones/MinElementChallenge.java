
import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {

    private static Scanner scanner = new Scanner((System.in));

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        int[] userInts = getInts(number);
        int returnedMin = findMin(userInts);


        System.out.println(findMin(userInts));
        System.out.println("returned min: " + returnedMin);
    }


    public static int[] getInts(int number) {
        int[] values = new int[number];
        System.out.println("Enter " + number + " int values.\r");
        for (int i = 0; i < values.length; i++)
        {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int findMin(int[] array) {
        int[] targetArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int min = Integer.MAX_VALUE;

        for (int i =0; i < array.length; i++) {
            int value = array[i];

            if (value < min){
                min = value;
            }
        }
        return min;
    }


}
