

import java.util.ArrayList;

public class AutoboxAndUnbox {

    class IntClass{
        private int myVal;

        public IntClass(int myVal){
            this.myVal = myVal;
        }

        public int getMyVal() {
            return myVal;
        }

        public void setMyVal(int myVal) {
            this.myVal = myVal;
        }
    }

    public static void main(String[] args){
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String>strArrayList = new ArrayList<String>();
        strArrayList.add("Me");

        //ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        //intClassArrayList.add(new IntClass(45));
        Integer integer = new Integer(87);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++){
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i <= 10; i++){
            System.out.println(i + " ---> " + intArrayList.get(i).intValue());
        }

        Integer myIntVal = 34;

        ArrayList<Double> myDubs = new ArrayList<Double>();
        for (double d=0.0; d<= 10.0; d+=0.5){
            myDubs.add(d);
        }

        for (int i = 0; i < myDubs.size(); i++){
            double value = myDubs.get(i);
            System.out.println(i + " -.-> " + value);
        }




    }

}
