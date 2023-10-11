import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {

    public static void main(String[] args) {
        //create array list
        ArrayList<Integer> arrayListNumbers= new ArrayList<Integer>();
        //add numbers to array list
        arrayListNumbers.add(17);
        arrayListNumbers.add(13);
        arrayListNumbers.add(7);
        arrayListNumbers.add(3);
        arrayListNumbers.add(37);
        arrayListNumbers.add(73);
        arrayListNumbers.add(28);
        //remove numbers from array list
        arrayListNumbers.remove(6);
        //get the size of the array list
        System.out.println("The size of my ArrayList is "+ arrayListNumbers.size());
        //check if an element is in the array list
       int checkNumber = 133;
       boolean inArray=false;
        for (int i = 0; i < arrayListNumbers.size(); i++) {
            if (arrayListNumbers.get(i) == checkNumber) {
                System.out.println(checkNumber + " is in the array! :)");
                inArray = true;
                break;
            } else {
                inArray = false;
            }
        }
            if (inArray == false) {
                System.out.println(checkNumber + " isn't in the array. :(");
            }
        //sort the elements of the array
        Collections.sort(arrayListNumbers);  // Sort myNumbers

        for (int i : arrayListNumbers) {
            System.out.print(i+", ");

        }

    }

}
