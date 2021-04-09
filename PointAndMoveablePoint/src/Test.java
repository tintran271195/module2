public class Test {
    public static void main(String[] args) {
        Point point = new Point(10, 20);
        MoveablePoint moveablePoint = new MoveablePoint(10,20,5,5);
        moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }
}
