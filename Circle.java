public class Circle extends Shape{
    private int radius;
    public Circle(){
        this(0,0,0);
    }
    public Circle(int x, int y, int rad){
        this.x = x;
        this.y = y;
        this.radius = rad;
    }
}