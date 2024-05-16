public class task1 {
    static class Line {
        double k;
        double b;

        Line(double k, double b) {
            this.k = k;
            this.b = b;
        }

        Point intersection(Line other) {
            if (this.k == other.k && this.b == other.b) {
                return null;
            } else if (this.k == other.k) {
                return null;
            } else {
                double x = (other.b - this.b) / (this.k - other.k);
                double y = this.k * x + this.b;
                return new Point(x, y);
            }
        }
    }

    public static void main(String[] args) {
        Line line1 = new Line(1, 1);
        Line line2 = new Line(-1, 3);

        Point intersectionPoint = line1.intersection(line2);
        System.out.println(intersectionPoint);
    }
}
