package udemy_exercises.bank;

public class Main {
    public static void main(String[] args){

    Bank bank = new Bank("Navy Federal Credit Union");

    bank.addBranch("Norfolk");

    bank.addCustomer("Norfolk", "Jack", 13.37);
    bank.addCustomer("Norfolk", "Chongo", 42.00);
    bank.addCustomer("Norfolk", "Templeton", 42.00);

    if (bank.addBranch("Texas")) {
        System.out.println("Texas branch generated.");
    }


    bank.addCustomer("Texas", "Jeb", 66.33);

    bank.addCustomerTransaction("Norfolk", "Jack", 13.37);
    bank.addCustomerTransaction("Norfolk", "Jack", 29.09);
    bank.addCustomerTransaction("Norfolk", "Chongo", -1374.33);

    bank.listCustomers("Norfolk", true);
    bank.listCustomers("Texas", true);

        bank.addBranch("Mel");

    if (!bank.addCustomer("Mel", "Dog", 30.07)){
        System.out.println("Error: Branch 'Mel' does not exist");
    }

    if(!bank.addBranch("Texas")){
        System.out.println("Texas branch already exists");
    }

    if (!bank.addCustomerTransaction("Texas", "Fungus", 30.00)){
        System.out.println("Yo not real!");
    }

    }
}
