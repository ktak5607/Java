import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();
    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    public void modifyGroceryList(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position > -1){
            modifyGroceryList(position, newItem);
        }
    }
    private void modifyGroceryList(int position, String item){
        groceryList.set(position, item);
        System.out.println("Item " + (position + 1) + " has been modified.");
    }
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position > -1){
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position){
        String item = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(item + " has been removed from the list.");
    }

    private int findItem(String searchItem) {
        //boolean exists = groceryList.contains(searchItem);
        return groceryList.indexOf(searchItem);
    }
    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position > -1){
            return true;
        }
        else{
            return false;
        }
    }
}
