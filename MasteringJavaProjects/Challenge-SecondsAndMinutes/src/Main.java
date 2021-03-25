public class Main {
    private static final String INVALIDVALUE = "Invalid Value";
    public static void main(String[] args) {
        System.out.println(getDurationString(544));
        System.out.println(getDurationString(60));
        System.out.println(getDurationString(9876));
        System.out.println(getDurationString(245, 46));
    }

    public static String getDurationString(int minutes, int seconds){
        if( minutes < 0 || seconds < 0 || seconds > 59){
            return INVALIDVALUE;
        }
        int hours = minutes / 60;
        int remainingMin = minutes % 60;
        String sMin = remainingMin + "m ";
        String sHours = hours + "h ";
        String sSeconds = seconds + "s";
        if(hours < 10){
            sHours = "0" + sHours;
        }
        if(remainingMin < 10){
            sMin = "0" + sMin;
        }
        if(seconds < 10){
            sSeconds = "0" + sSeconds;
        }

        return sHours + sMin + sSeconds;
    }

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return INVALIDVALUE;
        }
//        int hours = seconds / 3600;
//        int remainingSec = seconds % 3600;
//        int minutes = remainingSec / 60;
//        remainingSec = remainingSec % 60;
//        String finalTime = hours + "h " + minutes + "m " + remainingSec + "s";
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        String finalTime = getDurationString(minutes, remainingSeconds);
        return finalTime;
    }
}
