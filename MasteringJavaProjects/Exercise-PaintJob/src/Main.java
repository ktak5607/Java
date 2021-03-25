public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        else{
            int numberOfBuckets = (int)Math.ceil(((width * height) / areaPerBucket) - extraBuckets);
            return numberOfBuckets;
        }
    }


    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        else{
            int numberOfBuckets = (int)Math.ceil((width * height) / areaPerBucket);
            return numberOfBuckets;
        }
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        else{
            int numberOfBuckets = (int)Math.ceil(area / areaPerBucket);
            return numberOfBuckets;
        }
    }
}

