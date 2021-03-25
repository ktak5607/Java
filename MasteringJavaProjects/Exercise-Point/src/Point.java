public class Point {
    private int x;
    private int y;
    public Point(){
        this(0,0);
    }
    public Point(int xCoord, int yCoord){
        this.x = xCoord;
        this.y = yCoord;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    public double distance(int newX, int newY){
        return Math.sqrt(Math.pow(this.x - newX, 2) + Math.pow(this.y - newY, 2));
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
    }
}
