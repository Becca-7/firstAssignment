import java.util.ArrayList;
public class Student {
String name;
int age;
 int grade;
    static ArrayList<Integer> averageGrades = new ArrayList<Integer>();

    //Create a class called Student with the following attributes: name, age, and grade
    public Student(String pName, int pAge, int pGrade){
    name=pName;
    age=pAge;
    grade=pGrade;
    averageGrades.add(grade);
}




    public static void main(String[] args) {

        Student george=new Student("george",15,100);
        Student michael=new Student("michael",12,89);
        Student lilly = new Student("lilly",9,69);
        Student poppy = new Student("poppy",18,94);
    george.studentDetails();
    michael.studentDetails();
    lilly.studentDetails();
    poppy.studentDetails();
    gradeAverages();

    }

    //Write a method to print the details of a student
    public void studentDetails(){
        System.out.println("Name: "+name+", Age: "+age+", Grade: "+grade);
    }


    //Write a method to calculate the average grade of a group of students.
    public static void gradeAverages(){
    int total=0;
        for(int x=0;x<averageGrades.size(); x++) {
            total=total+averageGrades.get(x);
        }
     int average=0;
        average=total/averageGrades.size();
        System.out.println("The average grade is " +average);

    }

}
