public class DataEncapsulationMain {
    public static void main(String[] args) {
        DataEncapsulationMain myApp= new DataEncapsulationMain();

    }
    public DataEncapsulationMain(){
        Person Becca = new Person("Becca", 17, "170 Centre Street");
        Becca.setName("Beckles");
        System.out.println(Becca.getName());
        Becca.setAge(18);
        System.out.println(Becca.getAge());
        Becca.setAddress("118 Centre Street");
        System.out.println(Becca.getAddress());

    }


}
