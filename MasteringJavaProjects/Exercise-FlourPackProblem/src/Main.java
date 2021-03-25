public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-1,0,4));
        System.out.println(canPack(1, 5, 10));
        System.out.println(canPack(5, 3, 24));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(smallCount < 0 || bigCount < 0 || goal < 0){
            return false;
        }
        else {
            if(goal % 5 > smallCount){
                return false;
            }
            else{
                if(goal - (bigCount * 5 + smallCount) <= 0){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
    }
}
