public class Shape {
    public static void main(String[] args) {
    Shape blueCircle=new Circle("Blue", true, 13.7);
    blueCircle.area();
    Shape orangeRectangle=new Rectangle("Orange",true,13,7);
    orangeRectangle.area();

    }
    String color;
    boolean filled;

    public Shape(String pColor, boolean pFilled){
        color = pColor;
        filled = pFilled;

    }

    public void area(){



    }

}
