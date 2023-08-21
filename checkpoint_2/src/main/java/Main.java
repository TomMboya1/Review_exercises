public class Main {
    public static void main(String[] args) {

        Shapes[] shapes = new Shapes[2];
        shapes[0] = new square(5.0);
        shapes[1] = new Circle(7.5);

        drawable[] Drawables = new drawable[3];

        Drawables[0] = new Circle(5.0);
        Drawables[1] = new Rectangle(4.0, 3.0);
        Drawables[2] = new Triangle(6.0, 8.0);


        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Area of Shape " + (i + 1) + ": " + shapes[i].calculateArea());
        }

       for (drawable drawable : Drawables) {
            drawable.draw();

        }

    }
}
