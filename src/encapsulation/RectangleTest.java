package encapsulation;

public class RectangleTest {
    static void main() {

        Rectangle rt = new Rectangle(20,30);

        int lth = rt.getLength();
        int bth = rt.getBreadth();

        int Area = lth * bth;
        System.out.println(Area);

        rt.setLength(50);
        rt.setBreadth(60);

        int ln = rt.getLength();
        int br = rt.getBreadth();
        int newArea = ln * br;
        System.out.println(newArea);
    }
}
