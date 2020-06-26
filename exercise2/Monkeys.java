package exercise2;

import java.util.*;

class Monkeys {

    boolean monkeyBusiness(Monkey[] monkeys) {
    //BONUS EXERCISE
    //We have a set of monkeys.  Each Monkey has a boolean smile property, which indicates if that particular monkey is smiling.  Determine whether or not the majority of monkeys are smiling.  If the majority are smiling, return true.  if the majority are not smiling, return false.  If it is a tie, return true.  
        return true;
    }

    public static class Monkey {
        String name;
        boolean smile;

        public Monkey(String name, boolean smile) {
            this.name = name;
            this.smile = smile;
        }
    }




    public static void main(String[] args) {
        //Bonus exercise instructions:  create an array of at least 3 monkeys, utilizing the nested Monkey class, and determine whether the majority of them are smiling or not.  
        //required monkey data:
        // Rafiqi is smiling
        // Curious George is smiling
        // King Kong is not smiling
        //You are NOT allowed to move the Monkey class.  Keep it where it is.

        Monkey rafiqi = new Monkey("Rafiqi", true);
        Monkey curiousG = new Monkey("Curious George", true);
        Monkey dK = new Monkey("Dankey Kang", true);
        Monkey kingDong = new Monkey("King Kong", false);
        Monkey peanut = new Monkey("Peanut", false);
        Monkey frd = new Monkey("Peanut", false);

        ArrayList<Monkey> mankeys = new ArrayList<>();
        mankeys.add(rafiqi);
        mankeys.add(curiousG);
        mankeys.add(kingDong);
        mankeys.add(dK);
        mankeys.add(peanut);
        mankeys.add(frd);

        System.out.println((mankeys.size()) / 2);

        System.out.println(findSmiles(mankeys));

        //System.out.println(mankeys.toString());
    }

    public static boolean findSmiles(ArrayList<Monkey> array) {
        int angeryMonkeys = 0;

        for (Monkey bool : array) {
//            System.out.println(bool);

            if (bool.smile) {
//                System.out.println(bool.smile);
                angeryMonkeys ++;
                System.out.println(angeryMonkeys);
            }
        }

        if (angeryMonkeys < (array.size() / 2)) {
            return false;
        }

        return true;
    }




    
}