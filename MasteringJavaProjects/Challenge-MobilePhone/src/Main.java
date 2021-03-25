import java.util.Scanner;

public class Main {
    private static Scanner scanner =  new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();
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
                        mobilePhone.printContacts();
                        break;
                    case 2:
                        mobilePhone.addContact();
                        break;
                    case 3:
                        mobilePhone.modifyContact();
                        break;
                    case 4:
                        mobilePhone.removeContact();
                        break;
                    case 5:
                        mobilePhone.searchForContact();
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
        System.out.println("\t 1 - to print the list of all contacts,");
        System.out.println("\t 2 - to add a contact,");
        System.out.println("\t 3 - to modify a contact,");
        System.out.println("\t 4 - to remove a contact,");
        System.out.println("\t 5 - to search for a contact,");
        System.out.println("\t 6 - to quit the application.");
    }

     
}
