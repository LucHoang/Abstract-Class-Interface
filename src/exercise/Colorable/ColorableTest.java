package exercise.Colorable;

public class ColorableTest {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        Rectangle rectangle = new Rectangle();
//        Square square = new Square();

        Shape[] shape = new Shape[3];
        shape[0] = new Circle();
        shape[1] = new Rectangle();
        shape[2] = new Square();

//        Shape[] re = {new Circle(2.5),new Rectangle(3,4),new Square(5)};
//        Double[] arr = {circle.getArea(), rectangle.getArea(), square.getSide()};

        for (int i=0; i<shape.length; i++) {
            if (shape[i] instanceof Colorable) {
                Square square = new Square();
                square.howToColor();
            } else System.out.println(shape[i]);
        }
    }
}
