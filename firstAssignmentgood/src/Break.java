public class Break {
    public static void main(String[] args) {
        //print the even numbers from 1 to 100. Use a break statement to stop the loop after printing the first 10 even numbers.
      int  numPrinted = 0;
        for (int x = 0; x <= 100; x++) {
        if(x%2==0){
            System.out.println(x+", ");
            numPrinted+=1;
        }
        if(numPrinted==10){
            break;
        }
        }
    }

}
