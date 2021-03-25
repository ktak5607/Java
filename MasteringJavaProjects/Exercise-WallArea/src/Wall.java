public class Wall {
    private double width;
    private double height;

    public Wall(){
    }
    public Wall(double w, double h){
        if(w <= 0 && h <= 0){
            this.width = 0;
            this.height = 0;
        }
        else if(h <= 0 && w > 0){
            this.height = 0;
            this.width = w;
        }
        else if(w <= 0 && h > 0){
            this.height = h;
            this.width = 0;
        }
        else{
            this.width = w;
            this.height = h;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        if(width <= 0){
            this.width = 0;
        }
        else{
            this.width = width;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        if(height <= 0){
            this.height = 0;
        }
        else{
            this.height = height;
        }
    }

    public double getArea(){
        return this.height * this.width;
    }
}
