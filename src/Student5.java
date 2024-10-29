public class Student5 {
    // Java program to overload constructors

    int id;
    String name;
    int age;
    // Creating two arg constructor
    Student5(int i,String n){
        id = i;
        name = n;
    }
    // creating three arg constructor
    Student5(int i,String n, int a){
        id = i;
        name = n;
        age = a;
    }
    public void display(){
        System.out.println(id+" "+name+" "+age);
    }
}
