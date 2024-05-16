public class Triangle extends Figure {
    Point a, b, c;

    Triangle(Point a, Point b, Point c) {
        if (!isValidTriangle(a, b, c)) {
            throw new IllegalArgumentException("Invalid triangle: vertices are collinear.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double area() {
        return Math.abs((a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2.0);
    }

    @Override
    Point centroid() {
        double centroidX = (a.x + b.x + c.x) / 3.0;
        double centroidY = (a.y + b.y + c.y) / 3.0;
        return new Point(centroidX, centroidY);
    }

    @Override
    public String toString() {
        return "Triangle[A(" + a.x + "," + a.y + ") B(" + b.x + "," + b.y + ") C(" + c.x + "," + c.y + ")]";
    }

    private boolean isValidTriangle(Point a, Point b, Point c) {
        double area = Math.abs((a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2.0);
        return area > 0;
    }
}
