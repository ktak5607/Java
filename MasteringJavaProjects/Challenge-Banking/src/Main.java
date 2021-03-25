import java.util.Scanner;

public class Main {
    private static Scanner scanner =  new Scanner(System.in);
    private static Bank bank = new Bank("First");
    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printOptions();
        while(!quit){
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    printOptions();
                    break;
                case 1:
                    addBranch();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    addCustomerTransaction();
                    break;
                case 4:
                    printCustomers();
                    break;
                case 5:
                    printCustomerTransactions();
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }
    }
    public static void printOptions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - to print the options,");
        System.out.println("\t 1 - to add a new branch to the bank,");
        System.out.println("\t 2 - to add a new customer to a branch");
        System.out.println("\t 3 - to add a new customer transaction,");
        System.out.println("\t 4 - to print the branch customers,");
        System.out.println("\t 5 - to print the customer transactions,");
        System.out.println("\t 6 - to quit the application.");
    }

    public static void addBranch(){
        System.out.print("Enter the name of the new branch: ");
        String branchName = scanner.nextLine();
        bank.addBranch(branchName);
    }

    public static void addCustomer(){
        System.out.print("Enter the name of the branch to add the customer to: ");
        String branchName = scanner.nextLine();
        System.out.print("Enter the customers name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter the customer's transaction amount: ");
        double transactionAmount = scanner.nextDouble();
        scanner.nextLine();
        bank.addCustomer(branchName, customerName, transactionAmount);
    }

    public static void addCustomerTransaction(){
        System.out.print("Enter the name of the branch the customer goes to: ");
        String branchName = scanner.nextLine();
        System.out.print("Enter the customers name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter the customer's transaction amount: ");
        double transactionAmount = scanner.nextDouble();
        scanner.nextLine();
        bank.addCustomerTransaction(branchName, customerName, transactionAmount);
    }

    public static void printCustomers(){
        System.out.print("Enter the branch name: ");
        String branchName = scanner.nextLine();
        bank.printCustomers(branchName);
    }

    public static void printCustomerTransactions(){
        System.out.print("Enter the branch name: ");
        String branchName = scanner.nextLine();
        System.out.print("Enter the customer name: ");
        String customerName = scanner.nextLine();
        bank.printCustomerTransactions(branchName, customerName);
    }
}
