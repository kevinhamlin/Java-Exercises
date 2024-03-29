public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }
    public static double area(double radius) {
        // will return area of a circle
        // formula: area of a circle is Pi *r^2

        if (radius < 0) return -1.0;

        double area = Math.PI * (radius * radius);
        return area;

    }
    public static double area(double x, double y) {
        //will return area of a rectangle
        // formula: area of rectangle is x * y

        if (x < 0 || y <0 ) return -1.0;
        double area = x * y;
        return area;
    }
}
