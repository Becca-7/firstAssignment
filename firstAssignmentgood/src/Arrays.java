public class Arrays {
    public static void main(String[] args) {
        //print the elements of an array
    String[] favoriteFoods = {"ice cream","strawberry shortcake","pizza","cookies","sweet potato fries"};
    for(int x=0; x<favoriteFoods.length;x++) {
        System.out.print(favoriteFoods[x]+", ");
    }
    System.out.println();

    //find the sum of the elements of an array
    int[] sumNumbers={1,2,3,4,5,6,7,8,9};
    int sum=0;
    for(int x=0;x<sumNumbers.length+1; x++){
        sum=sum+x;
    }
    System.out.println("The sum of the numbers is "+sum);

    //find the largest element of an array
    int[] biggestNumber = {1,3,100,13,17};
    int biggest=0;
    for (int x=0;x<biggestNumber.length; x++ ){
    if(biggestNumber[x]>biggest){
        biggest=biggestNumber[x];
    }
    }
    System.out.println("The biggest number is "+biggest);
}
}
