
import java.util.Scanner;

public class ArraysAvg
{
    private static Scanner scanner = new Scanner((System.in));

    public static void  main(String[] args)
    {
        int[] myInts = getIntegers(5);

        for (int i = 0; i < myInts.length; i++)
        {
            System.out.println(myInts[i] + " was entered for array position " + i);
        }

        System.out.println("Average is : " + getAvg(myInts));

    }

    public static int[] getIntegers(int number)
    {
        System.out.println("Enter " + number + " int values.\r");
        int[] values = new int[number];

        for (int i=0; i < values.length; i++)
        {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAvg(int[] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }

        return (double) sum / (double)array.length;
    }

}
