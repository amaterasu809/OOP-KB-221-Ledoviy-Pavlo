import java.util.ArrayList;

public class Quadrilateral extends Figure {
    Point a, b, c, d;

    Quadrilateral(Point a, Point b, Point c, Point d) {
        if (!isValidQuadrilateral(a, b, c, d)) {
            throw new IllegalArgumentException("Invalid quadrilateral: vertices are collinear or coincident.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    double area() {
        ArrayList<Point> points = new ArrayList<>();
        points.add(a);
        points.add(b);
        points.add(c);
        points.add(d);

        double area = 0.0;
        for (int i = 0; i < points.size(); i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % points.size());
            area += current.x * next.y - next.x * current.y;
        }
        return Math.abs(area) / 2.0;
    }

    @Override
    Point centroid() {
        double centroidX = (a.x + b.x + c.x + d.x) / 4.0;
        double centroidY = (a.y + b.y + c.y + d.y) / 4.0;
        return new Point(centroidX, centroidY);
    }

    @Override
    public String toString() {
        return "Quadrilateral[A(" + a.x + "," + a.y + ") B(" + b.x + "," + b.y + ") C(" + c.x + "," + c.y + ") D(" + d.x + "," + d.y + ")]";
    }

    private boolean isValidQuadrilateral(Point a, Point b, Point c, Point d) {
        return notCollinear(a, b, c) && notCollinear(b, c, d) && notCollinear(c, d, a) && notCollinear(d, a, b);
    }

    private boolean notCollinear(Point a, Point b, Point c) {
        return (b.y - a.y) * (c.x - b.x) != (c.y - b.y) * (b.x - a.x);
    }
}
