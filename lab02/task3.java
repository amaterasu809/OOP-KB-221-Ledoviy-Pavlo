public class task3 {
    static class Triangle {
        private final Point vertex1;
        private final Point vertex2;
        private final Point vertex3;

        public Triangle(Point vertex1, Point vertex2, Point vertex3) {
            if (vertex1.equals(vertex2) || vertex1.equals(vertex3) || vertex2.equals(vertex3)) {
                throw new IllegalArgumentException("Vertices must be distinct.");
            }

            if (areCollinear(vertex1, vertex2, vertex3)) {
                throw new IllegalArgumentException("Triangle cannot be degenerate.");
            }

            this.vertex1 = vertex1;
            this.vertex2 = vertex2;
            this.vertex3 = vertex3;
        }

        public double area() {
            double a = vertex1.distanceTo(vertex2);
            double b = vertex2.distanceTo(vertex3);
            double c = vertex3.distanceTo(vertex1);
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }

        public Point centroid() {
            double centroidX = (vertex1.getX() + vertex2.getX() + vertex3.getX()) / 3;
            double centroidY = (vertex1.getY() + vertex2.getY() + vertex3.getY()) / 3;
            return new Point(centroidX, centroidY);
        }

        private boolean areCollinear(Point p1, Point p2, Point p3) {
            double area = p1.getX() * (p2.getY() - p3.getY()) +
                    p2.getX() * (p3.getY() - p1.getY()) +
                    p3.getX() * (p1.getY() - p2.getY());
            return area == 0;
        }
    }

    public static void main(String[] args) {
        Point vertex1 = new Point(0, 0);
        Point vertex2 = new Point(4, 0);
        Point vertex3 = new Point(2, 3);

        Triangle triangle = new Triangle(vertex1, vertex2, vertex3);

        System.out.println("Area of the triangle: " + triangle.area());
        System.out.println("Centroid of the triangle: " + triangle.centroid());
    }
}
