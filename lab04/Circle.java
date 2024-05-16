public class Circle extends Figure {
    Point center;
    double radius;

    Circle(Point center, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Invalid circle: radius must be positive.");
        }
        this.center = center;
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    Point centroid() {
        return center; // For a circle, centroid coincides with the center
    }

    @Override
    public String toString() {
        return "Circle[(" + center.x + "," + center.y + ") Radius: " + radius + "]";
    }
}
