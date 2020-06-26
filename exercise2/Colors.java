package exercise2;

import java.util.ArrayList;

public class Colors {

    public static void main(String[] args) {
        String[] code = {"bluebird","red herring", "yellow bumblebee","black spider", "green monkey","pink","great gatsby","feeding frenzy","black bird","widowmaker","quran","bible","torah"};
        ArrayList<String>  matches = new ArrayList<>();
        System.out.println("This is the Colors class");
        for ( String e : code) {
            if (e.matches(".*(black|red|blue|pink|yellow|green).*")){
                matches.add(e);
            }
        }
        System.out.println(matches);
    }
}