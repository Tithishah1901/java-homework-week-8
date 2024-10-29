package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        // setting value of the variables
        obj.setName("Tithi");
        obj.setAge(19);
        obj.setRollNo(12);

        // displaying values of the variables
        System.out.println("Prime's name: " + obj.getName());
        System.out.println("Prime's age:   "+ obj.getAge() );
        System.out.println("Prime' rollNo:  "+ obj.getRollNo());

        // direct access of rolNo is not possible due to encapsulation
       // System.out.println("Prime's rollNo: "+ obj.geekName);
    }
}
