package udemy_exercises;

import java.util.Arrays;
import java.util.Scanner;

class Sorting {

    private static Scanner scanner = new Scanner((System.in));

    public static void main(String[] args) {
        int[] myInts = getInts(9);

        int[] sortedS = sortInts(myInts);
        printIntArray(sortedS);

    }

    public static int[] getInts(int number)
    {
        int[] values = new int[number];
        System.out.println("Enter " + number + " int values.\r");

        for (int i=0; i < values.length; i++)
        {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printIntArray(int[] array)
    {
//        int[] values = new int[];
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i] + " was entered for array position " + i);
        }
    }

    public static int[] sortInts(int[] array)
    {
        int[] sorted = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while (flag)
        {
            flag = false;
            for(int i = 0; i < sorted.length - 1; i++)
            {
                if (sorted[i] < sorted[i + 1])
                {
                    temp = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sorted;
    }


}













