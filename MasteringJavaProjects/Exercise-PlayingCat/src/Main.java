public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(isCatPlaying(true, 45));
        System.out.println(isCatPlaying(true, 43));
        System.out.println(isCatPlaying(true, 25));
        System.out.println(isCatPlaying(true, 22));
        System.out.println(isCatPlaying(false, 25));
        System.out.println(isCatPlaying(false, 22));
        System.out.println(isCatPlaying(false, 27));


    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer && (temperature >= 25 && temperature <= 45)){
                return true;

        }
        else if(!summer && (temperature >= 25 && temperature <= 35)){
            return true;
        }

        return false;
    }
}
