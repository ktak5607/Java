public class Main {

    public static boolean isEven(int num){
        if(num < 0){
            return false;
        }
        else if(num % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
	    int startNum = 4;
	    int stopNum = 20;
	    int evenCount =0;
	    while(startNum <= 20){
	        startNum++;
	        if(!isEven(startNum)){
	            continue;
            }
	        else{
	            evenCount++;
                System.out.println("Even number " + startNum);
                if(evenCount == 5){
                    break;
                }
            }
        }
        System.out.println("Even number count " + evenCount);
    }
}
