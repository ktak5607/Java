import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String bankName){
        name = bankName;
        branches =  new ArrayList<Branch>();
    }
    private Branch findBranch(String branchName){
       for(int i = 0; i < branches.size(); i++){
            if(branches.get(i).getName().equals(branchName)){
               return branches.get(i);
            }
        }
       System.out.println("The given branch doesn't exist yet.");
       return null;
    }
    public void addBranch(String branchName){
        if(findBranch(branchName) == null){
            branches.add(new Branch(branchName));
            System.out.println("Successfully added the branch to the bank");
        }
        else{
            System.out.println("Failed to add the branch to the bank." +
                    " The branch you entered already exists.");
        }
    }
    public void addCustomer(String branchName, String customerName, double transactionAmount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            branch.addNewCustomer(customerName, transactionAmount);
        }
    }

    public void addCustomerTransaction(String branchName, String customerName, double transactionAmount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            branch.newTransaction(customerName, transactionAmount);
        }
    }
    public void printCustomers(String branchName){
        Branch branch = findBranch(branchName);
        if(branch != null){
            branch.printCustomers();
        }
    }
    public void printCustomerTransactions(String branchName, String customerName){
        Branch branch = findBranch(branchName);
        if(branch != null){
           branch.printCustomerTransactions(customerName);
        }
    }
}
