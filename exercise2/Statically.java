package exercise2;

public class Statically {
    //Once you have finished getting statistically.js to run, refactor the code here in Java.
    private static String glue = "Epoxy";
    String jello = "Jello";

    public static void moveAndShake() {
        System.out.println("Never stagnate in life.  Be agile, change, and improve...");
    }

    public static void stubborn() {
        System.out.println("Please don't make me change... I just don't like it...");
        moveAndShake();
    }

    public static void explain() {
        System.out.println(glue);
        stubborn();
    }

    public static String getGlue() {
        return glue;
    }

    public static void main(String[] args) {
        Statically stats = new Statically();

        moveAndShake();
        Statically.stubborn();
        Statically.explain();

        System.out.println(getGlue());
        System.out.println(stats.jello);

    }
}

