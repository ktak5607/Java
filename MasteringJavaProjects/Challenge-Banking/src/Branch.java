import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;
    public Branch(String branchName){
        name = branchName;
        customers = new ArrayList<Customer>();
    }
    private Customer findCustomer(String customerName){
        for(int i = 0; i < customers.size(); i++){
            if(customers.get(i).getName().equals(customerName)){
                return customers.get(i);
            }
        }

        System.out.println("The customer doesn't exist at the branch yet.");
        return null;
    }

    public void addNewCustomer(String customerName, double transactionAmount){
        Customer customer = findCustomer(customerName);
        if(customer == null){
            customers.add(new Customer(customerName, transactionAmount));
            System.out.println("Successfully added the customer to the branch.");
        }
        else{
            System.out.println("The customer already exists at the branch.");
        }
    }

    public void newTransaction(String customerName, double transactionAmount){
        Customer customer = findCustomer(customerName);
        if(customer != null){
            customer.newTransaction(transactionAmount);
            System.out.println("Successfully completed the transaction.");
        }
    }

    public void printCustomers(){
        for(int i = 0; i < customers.size(); i++){
            System.out.println(customers.get(i).getName());
        }
    }

    public void printCustomerTransactions(String customerName){
        Customer customer = findCustomer(customerName);
        if(customer != null){
            customer.printTransactions();
        }
    }
    public String getName(){
        return this.name;
    }
}
