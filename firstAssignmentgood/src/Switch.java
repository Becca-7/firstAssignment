public class Switch {
    public static void main(String[] args) {
        int dayOfWeek = 3;
        switch (dayOfWeek) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
        }

        int grade=85;
        int caseGrade=(int)(grade+10)/25;
switch(caseGrade){
    case 1:
        System.out.print("F");
        break;
    case 2:
        System.out.print("C");
        break;
    case 3:
        System.out.print("B");
        break;
    case 4:
        System.out.print("A+");
        break;


}


    }
}
