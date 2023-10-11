public class DataTypes {
    public static void main(String[] args) {
    //short, int, long, float, double, char, and boolean
        short myShort=-12345;
        int myInt = 1234567891;
        long myLong= 1234567891234567891L;
        float myFloat=123/4567;
        double myDouble = 1.23456789;
        char myChar = 'C';
        boolean myBoolean=true;
        System.out.println("My short = "+ myShort);
        System.out.println("My int = "+ myInt);
        System.out.println("My long = "+ myLong);
        System.out.println("My float = "+myFloat );
        System.out.println("My double = "+ myDouble);
        System.out.println("My char = "+ myChar);
        System.out.println("My boolean = "+ myBoolean);
        System.out.println();
    //convert a double to an integer.
        double doubleInt=77.77;
        int intDouble = (int)doubleInt;
        System.out.println("My double before converting = "+doubleInt);
        System.out.println("My int after converting = "+intDouble);
    //convert an integer to a double
        int intDouble2=77;
        int doubleInt2 = (int)doubleInt;
        System.out.println("My int before converting = "+intDouble2);
        System.out.println("My double after converting = "+doubleInt2);
    }







}
