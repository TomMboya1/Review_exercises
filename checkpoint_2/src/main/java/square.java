public class square extends Shapes  {
    private double side;

    public square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {

    }

}