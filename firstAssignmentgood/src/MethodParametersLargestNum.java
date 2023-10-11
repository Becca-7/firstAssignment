public class MethodParametersLargestNum {

    static void maximumInt(int numOne, int numTwo){
        System.out.println("maximum:");
        if (numOne>numTwo){
            System.out.print(numOne+">"+numTwo);
        }else if(numOne<numTwo){
            System.out.print(numOne+"<"+numTwo);
        }else{
            System.out.print(numOne+"=="+numTwo);
        }

    }
    static void maximumDouble(double numOneD, double numTwoD){
        System.out.println("maximum:");
        if (numOneD>numTwoD){
            System.out.print(numOneD+">"+numTwoD);
        }else if(numOneD<numTwoD){
            System.out.print(numOneD+"<"+numTwoD);
        }else{
            System.out.print(numOneD+"=="+numTwoD);
        }

    }
    public static void main(String[] args) {
    maximumInt(3,4);
    System.out.println();
    maximumDouble( 3.1,  3.2);
    }
    }
