public class Methods {

    //find the factorial of a number
    static void factorial(){
        System.out.println("factorial:");
        //to change the number being factorialized change int factNum and x=
int factNum=10;
    for (int x=10;x>0;x--) {
        factNum=factNum*x;
        System.out.println(factNum);
    }
        System.out.println();

    }
    //write a method to reverse a string
    static void stringReverse(){
        System.out.println("reverse:");

        String reverser="jibberish";
      for(int y=reverser.length()-1;y>=0;y-- ){
       System.out.print(reverser.charAt(y));
      }
      System.out.println();
      System.out.println();

    }
    //write a method to find the maximum of two numbers
    static void maximum(){
        System.out.println("maximum:");
        int numOne=1;
        int numTwo=2;
        if (numOne>numTwo){
            System.out.print(numOne+">"+numTwo);
        }else if(numOne<numTwo){
            System.out.print(numOne+"<"+numTwo);
        }else{
            System.out.print(numOne+"=="+numTwo);
        }

    }
    public static void main(String[] args) {
    factorial();
    stringReverse();
    maximum();
    }
}
