public class Circle extends Shapes implements drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

