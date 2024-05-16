public class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ";" + y + ")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceTo(Point another) {
        double dx = this.x - another.getX();
        double dy = this.y - another.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
