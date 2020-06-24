package LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> foods = new LinkedList<String>();
        addInOrder(foods, "pizza");
        addInOrder(foods, "Apple");
        addInOrder(foods, "bununga");
        addInOrder(foods, "mango");
        addInOrder(foods, "sooshi");
        printList(foods);

        addInOrder(foods, "mankey");
        addInOrder(foods, "krappy batty");
        printList(foods);

        seconds(foods);




    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now monchin` " + i.next());
        }
        System.out.println("=====================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newFood){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newFood);
            if (comparison == 0) {
                // equal, do not add
                System.out.println(newFood + " is already gettin` the monch.");
                return false;
            } else if (comparison > 0 ){
                //newFood should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newFood);
                return true;
            } else if (comparison < 0 ){
                //move on to next food
            }
        }

        stringListIterator.add(newFood);
        return true;
    }

    private static void seconds(LinkedList dishes){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingFoward = true;
        ListIterator<String> listIterator = dishes.listIterator();

        if (dishes.isEmpty()){
            System.out.println("No noms to be found...");
            return;
        } else {
            System.out.println("Now monchin`" + listIterator.next());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("all full, now time sleep");
                    quit = true;
                    break;

                case 1:
                    if(!goingFoward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingFoward = true;
                    }
                    if (listIterator.hasNext()){

                        System.out.println("Now monchin` " + listIterator.next());
                    } else {
                        System.out.println("There not more fud? *snort*");
                        goingFoward = false;
                    }
                    break;

                case 2:
                    if(goingFoward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingFoward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Goin back for seconds! Bring back the " + listIterator.previous() + " for an encore!!!");
                    } else {
                        System.out.println("You not start eat yet. Not can have seconds until has firsts. (ZUG ZUG)");
                        goingFoward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Select how you feast: \nEnter ");
        System.out.println(
                "0 - If done\n" +
                "1 - for more food\n" +
                "2 - for seconds\n" +
                "3 - menu options");
    }


}















