package exercises.ch2;

public class RectangleImpl implements Rectangle {
    private double width;
    private double length;

    public RectangleImpl(double width, double length) {
        this.width = width > 0 ? width : 0;
        this.length = length > 0 ? length : 0;
    }

    public double calculateArea(){
        return width * length;
    }

}
