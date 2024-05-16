public class task2 {
    static class Segment {
        Point start;
        Point end;

        Segment(Point start, Point end) {
            if (start.equals(end)) {
                throw new IllegalArgumentException("Start and end points must be distinct.");
            }
            this.start = start;
            this.end = end;
        }

        double length() {
            return Math.sqrt(Math.pow(end.x - start.x, 2) + Math.pow(end.y - start.y, 2));
        }

        Point middle() {
            double middleX = (start.x + end.x) / 2;
            double middleY = (start.y + end.y) / 2;
            return new Point(middleX, middleY);
        }

        Point intersection(Segment another) {
            double x1 = start.x, y1 = start.y;
            double x2 = end.x, y2 = end.y;
            double x3 = another.start.x, y3 = another.start.y;
            double x4 = another.end.x, y4 = another.end.y;

            double denominator = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
            if (denominator == 0) {
                return null;
            }

            double px = ((x1 * y2 - y1 * x2) * (x3 - x4) - (x1 - x2) * (x3 * y4 - y3 * x4)) / denominator;
            double py = ((x1 * y2 - y1 * x2) * (y3 - y4) - (y1 - y2) * (x3 * y4 - y3 * x4)) / denominator;

            if (px < Math.min(x1, x2) || px > Math.max(x1, x2) ||
                    py < Math.min(y1, y2) || py > Math.max(y1, y2) ||
                    px < Math.min(x3, x4) || px > Math.max(x3, x4) ||
                    py < Math.min(y3, y4) || py > Math.max(y3, y4)) {
                return null;
            }

            return new Point(px, py);
        }
    }

    public static void main(String[] args) {
        Segment segment1 = new Segment(new Point(0, 0), new Point(3, 4));
        Segment segment2 = new Segment(new Point(1, 1), new Point(5, 2));

        double length1 = segment1.length();
        double length2 = segment2.length();
        Point middle1 = segment1.middle();
        Point middle2 = segment2.middle();

        System.out.println("Length of segment 1: " + length1);
        System.out.println("Length of segment 2: " + length2);
        System.out.println("Middle point of segment 1: " + middle1);
        System.out.println("Middle point of segment 2: " + middle2);

        Point intersection = segment1.intersection(segment2);
        if (intersection != null) {
            System.out.println("Intersection point: " + intersection);
        } else {
            System.out.println("Segments do not intersect.");
        }
    }
}
