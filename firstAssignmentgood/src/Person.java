public class Person {
  //  Make the name, age, and address attributes private
  private String name;
  private  int age;
  private String address;

  //Create a class called Person with the following attributes: name, age, and address.
public Person(String pName, int pAge, String pAddress){
        name=pName;
        age=pAge;
        address=pAddress;

}
//Create methods to get and set the values of the name, age, and address attributes..
public String getName(){
    return name;
}
public void setName (String newName){
    name=newName;
}
    public int getAge(){
        return age;
    }
    public void setAge (int newAge){
        age=newAge;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress (String newAddress){
        address=newAddress;
    }











}
