package exercise.Resizeable;

public class ResizeableTest {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        double[] arr = {circle.getArea(), rectangle.getArea(), square.getSide()};

        System.out.println("After resize:");
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        circle.resize(Math.random()*100);
        rectangle.resize(Math.random()*100);
        square.resize(Math.random()*100);
        arr[0] = circle.a;
        arr[1] = rectangle.b;
        arr[2] = square.c;

        System.out.println("Before resize:");
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
