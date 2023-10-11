public class ConditionalStatements {
    public static void main(String[] args) {
     int number = -100;
    //check if a number is even or odd
    if ( number % 2 == 1){
        System.out.println("The number is odd!");
    } else {
        System.out.println("The number is even!");
    }
    //check if a number is positive or negative
    if (number>0){
        System.out.println("The number is positive!");
    } else{
        System.out.println("The number is negative!");
    }
    //check if a number is prime]\
        boolean prime = true;
        for(int x=2;x<100;x++) {
            if (number % x == 0) {
                System.out.println("The number is not prime!");
                prime=false;
                break;
            }
        }
        if (prime==true){
            System.out.println("The number is prime!");
        }

    }
}
