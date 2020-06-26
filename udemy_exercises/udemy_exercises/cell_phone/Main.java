package udemy_exercises.cell_phone;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner((System.in));
    private static udemy_exercises.cell_phone.CellPhone cellPhone = new udemy_exercises.cell_phone.CellPhone("123 234 3456");



    public static void main(String[] args){

        boolean quit = false;
        startPhone();
        menuOptions();
        while(!quit){
            System.out.println("\nEnter action: (Enter '6' for available actions.");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    cellPhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    menuOptions();
                    break;
                case 7:
                    quit = true;
                    break;
            }

        }
    }

    private static void addContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter a phone number: ");
        String phone = scanner.nextLine();
        udemy_exercises.cell_phone.Contact newContact = udemy_exercises.cell_phone.Contact.createContact(name, phone);

        if (cellPhone.addContact(newContact)){
            System.out.println("New contact added: " + name + ", " + phone + ".");
        } else {
            System.out.println("Error, contact already exists. Please use menu option 3 to modify this contact.");
        }
    }

    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        udemy_exercises.cell_phone.Contact existingContactRecord = cellPhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found.");
            return;
        }

        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number");
        String newPhone = scanner.nextLine();
        udemy_exercises.cell_phone.Contact newContact = udemy_exercises.cell_phone.Contact.createContact(newName, newPhone);
        if (cellPhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Successfully updates contact: ");
        } else {
            System.out.println("Error updating record!");
        }

    }

    private static void removeContact() {
        System.out.println("Enter contact to delete: ");
        String name = scanner.nextLine();
        udemy_exercises.cell_phone.Contact existingContactRecord = cellPhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        if(cellPhone.removeContact(existingContactRecord)){
            System.out.println( name + " Contact deleted.");
        } else {
            System.out.println("Error deleting contact.");
        }
    }

    private static void queryContact() {
        System.out.println("Enter contact to search: ");
        String name = scanner.nextLine();
        udemy_exercises.cell_phone.Contact existingContactRecord = cellPhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + "\n Phone number is: " + existingContactRecord.getPhoneNum());
    }




    private static void startPhone() {
        System.out.println("Starting Phone...");
    }

    private static void menuOptions(){
        System.out.println("\nAvailable Actions:");
        System.out.println(
                "0 - to shutdown\n" +
                "1 - List of contacts\n" +
                "2 - Add new contact\n" +
                "3 - Update contact\n" +
                "4 - Remove contact\n" +
                "5 - Search for contact\n" +
                "6 - Menu options\n");
        System.out.println("Choose your action: ");
    }


}
