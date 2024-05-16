public class Main {
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 3);
        Point d = new Point(4, 3);
        Point center = new Point(2, 2);

        Triangle triangle = new Triangle(a, b, c);
        Quadrilateral quadrilateral = new Quadrilateral(a, b, c, d);
        Circle circle = new Circle(center, 3);

        System.out.println(triangle);
        System.out.println("Area: " + triangle.area());
        System.out.println("Centroid: " + triangle.centroid());

        System.out.println(quadrilateral);
        System.out.println("Area: " + quadrilateral.area());
        System.out.println("Centroid: " + quadrilateral.centroid());

        System.out.println(circle);
        System.out.println("Area: " + circle.area());
        System.out.println("Centroid: " + circle.centroid());
    }
}