public class Circle extends Shape{
    private double radius;
    public Circle(){
        radius =1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * 2 * 3.14;
    }
    public double getPerimeter(){
        return Math.pow(radius,2) * 3.14;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + this.radius + ", which is a subclass of " + super.toString();
    }
}
