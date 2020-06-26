class Statically {
    //fix this code, so all of the instantiation and console.logs() work.  Try not to change the signature of the class, unless absolutely necessary.
    static #glue = "Epoxy";
    jello = "Jello";

    moveAndShake() {
        console.log("Never stagnate in life.  Be agile, change, and improve...");
    }

    static stubborn() {

        console.log("Please don't make me change... I just don't like it...");
        stats.moveAndShake();
    }

    static explain() {
        console.log(Statically.#glue);
        return this.stubborn();

        //write an explanation for how the keyword static behaves differently in javascript vs. java.


        //Static in .js = Is not called on instances class, rather only on the class its self. Used to implement functions that belong to a class but not to a singular part of said class. Class must be implemented.

        //Static in JAVA = Allows the class or method to be accessed without instantiation or reference to any object. Unable to reference non-static methods from a static method.
    }

    static getGlue() {
      return this.#glue
    }
}

//get the below code to run correctly without errors:  Make sure you explain what you did in the the explain() method, defined in the class.  Do NOT remove the 'static' keyword from the explain() method.

const stats = new Statically();

stats.moveAndShake();
Statically.stubborn();
Statically.explain();

console.log(Statically.getGlue());
console.log(stats.jello);


//Once you have finished getting statistically.js to run, refactor the code here in Java.