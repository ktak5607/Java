public class Floor {
    private double length;
    private double width;

    public Floor(double w, double l){
        if(w <= 0 && l > 0){
            this.width = 0;
            this.length = l;
        }
        else if(w > 0 && l <= 0){
            this.width = w;
            this.length = 0;
        }
        else if(w <= 0 && l <= 0){
            this.width = 0;
            this.length = 0;
        }
        else{
            this.width = w;
            this.length = l;
        }
    }

    public double getArea(){
        return this.width * this.length;
    }
}
