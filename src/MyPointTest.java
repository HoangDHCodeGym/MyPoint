public class MyPointTest {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);
        System.out.println("The distance is " + MyPoint.getDistance(point1, point2));
    }
}
