package exercise2;

class ArraysClass {
    //Take the arrays.js file, and refactor the code into Java in this file.
//    int[] nums = {10,23,3,4,5,2,1};
//    String[] greetings = {"hello","howdy","hallo","hola","bonjour","ciao","أهلا"};
//    boolean[] binaries = {0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0};
//
//    void printNums() {};
//    void printGreetings() {};
//    void printBinaries() {};

    public static void main(String[] args) {

        int[] nums = new int[]{10,23,3,4,5,2,1};
        String[] greetings = new String[] {"hello","howdy","hallo","hola","bonjour","ciao","أهلا"};
        //If you make a boolean[] you cannot store int values. Changed to int[].
        int[] binaries = new int[] {0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0};

        printNums(nums);
        printGreetings(greetings);
        printBinaries(binaries);

    }

    private static void printNums(int[] nums) {
        for (int i : nums) {
            System.out.println(i);
        }
    }

    private static void printGreetings(String[] array) {
        for (String i : array) {
            System.out.println(i);
        }
    }

    private static void printBinaries(int [] array) {
        //Eh.. Comments try to be more true to the spirit of the challenge. But finished product hacks the job just fine.
        //boolean[] temp = new boolean[array.length];

        for (int i : array) {
            if (i == 0) {
                //temp[i] = false;
                System.out.println("false");
            } else if (i == 1) {
               // temp[i] = true;
                System.out.println("true");
            } else {
                System.out.println("Error: Not a valid binary string.");
            }

            //Error! all changes are being saved to the same location in memory
            //System.out.println(temp);
        }
    }

}







