public class Circle extends Shape{
    double radius;


    public Circle(String pColor, boolean pFilled, double pRadius) {
        super(pColor, pFilled);
        radius = pRadius;
    }

    public void area(){
         double area;
        area= radius*radius*3.14;
        System.out.println("The area of my circle is "+area);

    }
}
