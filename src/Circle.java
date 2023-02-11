public class Circle {
    private static final double PI = Math.PI;
    public static double area(double radius) {
        double area = PI*(radius * radius);
        System.out.println("Area: " + area);
        return area;
    }public static double circumfernce(double radius){
        double circircumfernce = PI * 2 * radius;
        System.out.println("Circircumfernce: " + circircumfernce);
        return circircumfernce;
    }
}
