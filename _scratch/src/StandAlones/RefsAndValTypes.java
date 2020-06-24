
import java.util.Arrays;

public class RefsAndValTypes {

    public  static void main(String[] args)
    {
        int myInt = 10;
        int otherInt = myInt;

        int[] myIntArray = new int[5];
        int[] otherArray = myIntArray;

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(otherArray));

        otherArray[0] = 1;

        System.out.println("post : " + Arrays.toString(myIntArray));
        System.out.println("post : " + Arrays.toString(otherArray));

        modArray(myIntArray);

        System.out.println("post : " + Arrays.toString(myIntArray));
        System.out.println("post : " + Arrays.toString(otherArray));

        otherArray = new int[] {1,2,3,4,5};

        System.out.println("post : " + Arrays.toString(myIntArray));
        System.out.println("post : " + Arrays.toString(otherArray));
    }

    private static void modArray(int[] array)
    {
        array[0] = 2;
        array = new int[] {1,2,3,4,5};


    }


}
