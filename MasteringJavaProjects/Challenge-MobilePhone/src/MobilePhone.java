import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    private Scanner scanner= new Scanner(System.in);

    public void printContacts(){
        System.out.println("You have " + contacts.size() + " contacts in your phone.");
        for(int i = 0; i < contacts.size(); i++){
            System.out.println((i+1) + ". " + contacts.get(i).getName() + " " +
                    contacts.get(i).getNumber());
        }
    }
    public void addContact(){
        String name = getName();
        if(name != null) {
            int position = findContact(name);
            if (position == -1) {
                int number = getNumber();
                contacts.add(new Contact(name, number));
                System.out.println("Successfully added " + name + " to your contacts list.");
            } else {
                System.out.println("The contact you entered already exists in your contact list.");
            }
        }
    }

    public void modifyContact(){
        String name = getName();
        if(name != null) {
            int contactPosition = findContact(name);
            if (contactPosition > -1) {
                int number = getNumber();
                contacts.get(contactPosition).setNumber(number);
                System.out.println("Successfully changed " + name + "'s number" +
                        " to " + number);
            }
            else {
                System.out.println("The contact you entered doesn't exist in your contacts list.");
            }
        }
    }

    public void removeContact(){
        String name = getName();
        if(name != null){
            int position = findContact(name);
            if(position > -1){
                contacts.remove(position);
            }
            else{
                System.out.println("The contact you entered doesn't exist in your contacts list.");
            }
        }
    }
    public void searchForContact(){
        System.out.println("Do you want to search for a name (press a) or a number (press b)?: ");
        String c = scanner.nextLine();
        if(c.equals("a")){
            String name = getName();
            searchForContact(name);
        }
        if(c.equals("b")){
            int number = getNumber();
            searchForContact(number);
        }
    }
    private void searchForContact(String name){
        int position = findContact(name);
        if(position > -1){
            System.out.println(name + " " + contacts.get(position).getNumber());
        }
        else{
            System.out.println("None of your contacts has the name you entered.");
        }
    }

    private void searchForContact(int number){
        int position = findContact(number);
        if(position > -1){
            System.out.println(contacts.get(position).getName() + " " + number);
        }
        else{
            System.out.println("None of your contacts has the number you entered.");
        }
    }

    private int findContact(String name){
        int position = -1;
        for(int i = 0; i < contacts.size(); i++){
            if(contacts.get(i).getName().equals(name)){
                position  = i;
            }
        }
        return position;
    }

    private int findContact(int number){
        int position = -1;
        for(int i = 0; i < contacts.size(); i++){
            if(contacts.get(i).getNumber() == number){
                position  = i;
            }
        }
        return position;
    }

    private String getName(){
        System.out.print("Enter the name of the contact: ");
        String name = scanner.nextLine();
        if(!name.equals("") || !name.equals(null) || !name.equals(" ")){
            return name;
        }
        else{
            System.out.println("Please enter a valid name.");
            return null;
        }
    }

    private int getNumber(){
        System.out.print("Enter the contact's phone number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }
}

