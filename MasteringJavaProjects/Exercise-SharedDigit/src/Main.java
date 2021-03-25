public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int start, int end){
        if(start > 99 || end > 99 || start < 10 || end < 10){
            return false;
        }
        else{
            int origEnd = end;
            int endDigit, startDigit = 0;
            while(start > 0){
                startDigit = start % 10;
                while(end > 0){
                    endDigit = end % 10;
                    if(endDigit == startDigit){
                        return true;
                    }
                    else{
                        end /= 10;
                    }
                }
                end = origEnd;
                start /= 10;
            }
        }
        return false;
    }
}
