public class MethodParametersStringReverse {

   public static void stringReverse(String reverser){
        System.out.println("reverse:");
        for(int y=reverser.length()-1;y>=0;y-- ){
            System.out.print(reverser.charAt(y));
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        stringReverse("reverse me");
    }
}
