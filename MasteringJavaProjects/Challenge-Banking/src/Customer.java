import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    public Customer(String customerName, double transaction){
        name = customerName;
        transactions = new ArrayList<Double>();
        transactions.add(transaction);
    }

    public void newTransaction(double amount){
        transactions.add(amount);
    }

    public String getName(){
        return name;
    }
    public void printTransactions(){
        for(int i = 0; i < transactions.size(); i++){
            System.out.println(transactions.get(i));
        }
    }
}
