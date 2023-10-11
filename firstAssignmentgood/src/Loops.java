public class Loops {
    public static void main(String[] args) {
    //print the numbers 1-10
        for(int x=0; x<11; x++){
            System.out.print(x+", ");
        }
        System.out.println();
    //print the even numbers 1-10
        for (int y=0;y<11; y++){
            if(y%2==0){
                System.out.print(y+", ");
            }
        }
    }
}
//was told not to do Fibonacci