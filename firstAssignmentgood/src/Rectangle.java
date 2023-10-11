public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(String pColor, boolean pFilled, int pWidth, int pHeight) {
        super(pColor, pFilled);
        width=pWidth;
        height=pHeight;
    }

    public void area(){
        int area;
        area=width*height;
        System.out.println("The area of my square is "+area);


    }
}
